package com.basetest.three;

import driverpath.DriverPath;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.Objects;

//no extend of this classs
public  final class BaseTestChromerThree {


    //variable used only in thsi class
    //static bz i wnat ot use hte static method

   private static WebDriver driver;

   //no object making of this ,object in this calss possible
    //not outside the class
    private BaseTestChromerThree(){

    }


   // only used by class name this mehtod
   public static   void setUpChrome(){

        if(Objects.isNull(driver)){
            System.setProperty("webdriver.chrome.driver", DriverPath.chromePath());
            ChromeOptions chromoptions=new ChromeOptions();
            chromoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver=new ChromeDriver(chromoptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demoqa.com/modal-dialogs");
        }


    }


    //only used by class name this method
       public static  void tearDownChrome(){

        if(Objects.nonNull(driver))
                 driver.quit();
    }

    public static WebDriver  getDriverChrome(){

        return driver;
    }


}
