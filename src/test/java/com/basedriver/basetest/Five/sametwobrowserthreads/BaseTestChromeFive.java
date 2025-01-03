package com.basedriver.basetest.Five.sametwobrowserthreads;

import com.driverfactory.one.OneDriverFactory;
import enumconstants.ConfigPropertiesConstants;
import enumconstants.MethodPropertiesConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import path.DriverAndFilesPathConstants;
import propertesfilesread.FrameoworksConstantFileReadPropertyUtils;
import propertesfilesread.MethodPropertiesPropertyFileRead;
import threadlocal.ThreadLocalWebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;

public class BaseTestChromeFive {

    // BasetTestControlChromeFive is the parent class of  the AppVWOChallengeFiveTest
    // so it comes under the main thread and BasetTestControlChromeFive is using hte
    //BaseTestChromeFive so this class is comes in the main thread so the webdriver static
    // comes int he main thread



   /* public static void baseTestChromeEdgeOneInitDriver(String browser) throws Exception {


        // since the thread count is  2 in test ng and it is at the method level ie first 4 method  of chrome divied into the
        // ino the one thread and  4 of  edge divided into other thread
        // when the first thread  come
    if(Objects.isNull(ThreadLocalWebDriverManager.getDriver())){
        if(browser.equalsIgnoreCase("chrome")){
          //  System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            WebDriverManager.chromedriver().clearDriverCache().setup();


           //chrome driver is set or its scope to that particulat thread
            ThreadLocalWebDriverManager.setDriver(new ChromeDriver());
        }else if(browser.equalsIgnoreCase("edge")){
            //System.setProperty("webdriver.edge.driver", DriverAndFilesPathConstants.edgePath());
            WebDriverManager.edgedriver().clearDriverCache().setup();


            //edge driver is set or scope to the particualar thread
            ThreadLocalWebDriverManager.setDriver(new EdgeDriver());
        }

    }
        ThreadLocalWebDriverManager.getDriver().get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLONE));


    }
*/


    public static void setUpChrome() throws Exception {
        // String runMode="remote";
        String runMode = MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RUNMODE);


        if(Objects.isNull(ThreadLocalWebDriverManager.getDriver())){
            if (runMode.equalsIgnoreCase("remote")) {

                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setBrowserName(Browser.CHROME.browserName());

                cap.setPlatform(Platform.WIN10);


                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);




                // Merge ChromeOptions with DesiredCapabilities
                cap.merge(chromeOptions);

                //cap.setCapability("maxInstances", 2);

                //  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);

                //it is for the  docker
                ThreadLocalWebDriverManager.setDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap));
                // driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);


            }
            else {

                // System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());

                WebDriverManager.chromedriver().clearDriverCache().setup();

                //  WebDriverManager.chromedriver().setup();

                //driver=new ChromeDriver();//ChromeDriver class from webdriver famework uses the upper location for the driver
                //which ever thread use this method it will have the local threadlocal variale set as below
                //so it recommanded to make threadlocal variable as static bz impliclty it will make the
                // sepaerte local variable for each thread
                //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
                //so the thread local variable is made static even it is static the when thrad comes to it
                //it will make its own threadlocal variblae ,static only give the feature to call by classname

                // hreadLocalWebDriver.setDriver(driver);
                ThreadLocalWebDriverManager.setDriver(new ChromeDriver());

                // ThreadLocalWebDriverManager.getDriver().get("https://demo.applitools.com/");


            }


            ThreadLocalWebDriverManager.getDriver().manage().window().maximize();
            ThreadLocalWebDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        }

        //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
        ThreadLocalWebDriverManager.getDriver().get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLFIVE));
    }





    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }



    // it used to get driver where there is not inheritance of this class directlly call this
    //public static void  setDriver(WebDriver driver) {
        //ThreadLocalWebDriverManager.setDriver(driver);
        //  }

    //method used by clas name only
    /* suppose the a thread is executing the ChromeEdgeOneDriver class  is using hte chrome then thread insance then we can assign the sepearte value of to thread limited ot thid thread*/


    public static void tearDown() {

        // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
        if (Objects.nonNull(ThreadLocalWebDriverManager.getDriver()))
            ThreadLocalWebDriverManager.getDriver().quit();//firstly webdriver variable is reomved
        ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    }


    //public static void tearDown() {

        // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
        //if (Objects.nonNull(ThreadLocalWebDriverManager.getDriver()))
        //   ThreadLocalWebDriverManager.getDriver().quit();//firstly webdriver variable is reomved
      //  ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    //}

    //public static void tearDownWebDriver(WebDriver driver) {

        // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
      //  if (Objects.nonNull(driver))
        //    driver.quit();//firstly webdriver variable is reomved
        // ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    //}

}