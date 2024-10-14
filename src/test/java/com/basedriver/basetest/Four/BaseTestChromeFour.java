package com.basedriver.basetest.Four;

import enumconstants.ReadFileConstants;
import org.openqa.selenium.WebDriver;
import path.DriverAndFilesPath;
import org.openqa.selenium.chrome.ChromeDriver;

import propertesfilesread.FrameoworksConstantPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.time.Duration;
import java.util.Objects;


//no other class can extent it
public final  class BaseTestChromeFour {

    //only this class can use this variable
    //staatic bz i want ot use in the ststic method
    //private static WebDriver driver;


    //it can be used by classname
    public static void setUpChrome() throws Exception {

        if (Objects.isNull(ThreadLocalWebDriver.getDriver())) {
            System.setProperty("webdriver.chrome.driver", DriverAndFilesPath.chromePath());
            // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
            //driver = new ChromeDriver();
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname
            ThreadLocalWebDriver.setDriver(new ChromeDriver());
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // ThreadLocalWebDriver.getDriver().get("https://app.vwo.com/#/login");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriver.getDriver().get(FrameoworksConstantPropertyFileRead.readPropertyFile(ReadFileConstants.URLFOUR));
        }

    }

    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriver.getDriver();
    }




    //it can be used by classname
    public static void tearDown() {

        //it will first close the browser by removing hte driver instsnce
        if (Objects.nonNull(ThreadLocalWebDriver.getDriver()))
            ThreadLocalWebDriver.getDriver().quit();
        //then we will remove the thread local variable which is holding the refernce of driver
        ThreadLocalWebDriver.unload();

    }



}