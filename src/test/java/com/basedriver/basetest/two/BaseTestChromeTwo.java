package com.basedriver.basetest.two;

import enumconstants.ConfigPropertiesConstants;
import enumconstants.MethodPropertiesConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import path.DriverAndFilesPathConstants;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import propertesfilesread.FrameoworksConstantFileReadPropertyUtils;
import propertesfilesread.MethodPropertiesPropertyFileRead;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;

//no one extend this class
public final class BaseTestChromeTwo {

    //only variable  used within the class
    private static WebDriver driver;
    //static bz i wnat ot use hte static method

    //non one make object of this class
    //object only made in this class not outsdie the class
    private BaseTestChromeTwo() {

    }


    //method call by class naem
    public static void setUpChrome() throws Exception {

       // String runMode="remote";
        String runMode= MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RUNMODE);

        if(runMode.equalsIgnoreCase("remote")){
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

              // Merge ChromeOptions with DesiredCapabilities
            cap.merge(chromeOptions);

            try {
                //it is for the  docker
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        else{

            //  System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            //  System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");
          //  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
            //  DesiredCapabilities cap= new DesiredCapabilities();
            //cap.setBrowserName("chrome");


            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\drivers\\chromedriver.exe");
            // WebDriverManager.chromedriver().clearDriverCache().setup();
            //liberary will take of it the chrome broser version

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);



            driver = new ChromeDriver(chromeOptions);
            // driver= new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"),cap);


        }







        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.get("https://demoqa.com/webtables");


        //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
        driver.get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLTWO));

    }


    //mehod call by class anme
    public static void tearDownChrome() {
        driver.quit();
    }



    // it used to get driver where there is not inheritance of this class directlly call this
    //method call by classname
    public static WebDriver getDriverChrome() {
        if (Objects.nonNull(driver))
            return driver;
        else
            return null;


    }

}