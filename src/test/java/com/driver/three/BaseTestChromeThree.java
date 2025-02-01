package com.driver.three;

import enumconstants.URLPropertiesConstants;
import path.DriverAndFilesPathConstants;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import propertesfilesread.URLConstantFileReadPropertyUtils;


import java.time.Duration;
import java.util.Objects;

//no extend of this classs
public  final class BaseTestChromeThree {


    //variable used only in thsi class
    //static bz i wnat ot use hte static method

    private static WebDriver driver;

    //no object making of this ,object in this calss possible
    //not outside the class
    private BaseTestChromeThree() {

    }


    // only used by class name this mehtod
    //public static void setUpChrome() throws Exception {
    //we donot use public bz this method will only be used within package
         static void setUpChrome() throws Exception {
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
            ChromeOptions chromoptions = new ChromeOptions();
            chromoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromoptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //driver.get("https://demoqa.com/modal-dialogs");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            driver.get(URLConstantFileReadPropertyUtils.get(URLPropertiesConstants.URLTHREE));
        }


    }


    //only used by class name this method
    public static void tearDownChrome() {

        if (Objects.nonNull(driver))
            driver.quit();
    }

    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriverChrome() {

        return driver;
    }

}