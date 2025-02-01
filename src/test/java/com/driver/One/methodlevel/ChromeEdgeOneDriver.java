package com.driver.One.methodlevel;

import com.driverfactory.one.OneDriverFactory;
import enumconstants.ConfigPropertiesConstants;
import org.openqa.selenium.WebDriver;
import propertesfilesread.FrameoworksConstantFileReadPropertyUtils;
import threadlocal.ThreadLocalWebDriverManager;

import java.util.Objects;

/**
 *
 */
public class ChromeEdgeOneDriver {

    private ChromeEdgeOneDriver(){}


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

    //we donot use public bz this method will only be used within package

    //public static void baseTestChromeEdgeOneInitDriver(String browser) throws Exception {

         static void baseTestChromeEdgeOneInitDriver(String browser) throws Exception {

        WebDriver webDriver=null;
        // since the thread count is  2 in test ng and it is at the method level ie first 4 method  of chrome divied into the
        // ino the one thread and  4 of  edge divided into other thread
        // when the first thread  come
    if(Objects.isNull(ThreadLocalWebDriverManager.getDriver())){


        // since the thread count is  2 in test ng and it is at the method level ie first 4 method  of chrome divied into the
        // ino the one thread and  4 of  edge divided into other thread
        // when the first thread  come
        //if(Objects.isNull(ThreadLocalWebDriverManager.getDriver())){

            webDriver= OneDriverFactory.getDriver(browser);

            ThreadLocalWebDriverManager.setDriver(webDriver);


            //  if(browser.equalsIgnoreCase("chrome")){
            //  System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            // WebDriverManager.chromedriver().clearDriverCache().setup();


            //chrome driver is set or its scope to that particulat thread
            //ThreadLocalWebDriverManager.setDriver(new ChromeDriver());
            // webDriver=new ChromeDriver();

            // }else if(browser.equalsIgnoreCase("edge")){
            //System.setProperty("webdriver.edge.driver", DriverAndFilesPathConstants.edgePath());
            //  WebDriverManager.edgedriver().clearDriverCache().setup();


            //edge driver is set or scope to the particualar thread
            //ThreadLocalWebDriverManager.setDriver(new EdgeDriver());

            //webDriver=new EdgeDriver();
            // }

      //  }
        // ThreadLocalWebDriverManager.getDriver().get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLONE));



      //  return webDriver;

    }
       // webDriver.get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLONE));

        ThreadLocalWebDriverManager.getDriver().get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLONE));


    }





    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }



    // it used to get driver where there is not inheritance of this class directlly call this
    public static void  setDriver(WebDriver driver) {
        ThreadLocalWebDriverManager.setDriver(driver);
    }

    //method used by clas name only
   /* suppose the a thread is executing the ChromeEdgeOneDriver class  is using hte chrome then thread insance then we can assign the sepearte value of to thread limited ot thid thread*/


    public static void tearDownChromeEdge() {

       // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
        if (Objects.nonNull(ThreadLocalWebDriverManager.getDriver()))
            ThreadLocalWebDriverManager.getDriver().quit();//firstly webdriver variable is reomved
        ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
          //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    }


    public static void tearDown() {

        // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
       //if (Objects.nonNull(ThreadLocalWebDriverManager.getDriver()))
         //   ThreadLocalWebDriverManager.getDriver().quit();//firstly webdriver variable is reomved
        ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    }

    public static void tearDownWebDriver(WebDriver driver) {

        // System.out.println("threadname in teardown:"+Thread.currentThread().getName());
        //all connections to .exe file is gone but driver can hold the refeence of the instance
        //to save native memory
        if (Objects.nonNull(driver))
           driver.quit();//firstly webdriver variable is reomved
       // ThreadLocalWebDriverManager.unload();//then the threadloal variable is removed
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    }


}
