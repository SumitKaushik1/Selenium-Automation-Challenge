package com.basetest.three;

import driverpath.DriverPath;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestChromerThree {


   protected WebDriver driver;

    @BeforeSuite
   protected  void setUpChrome(){

        System.setProperty("webdriver.chrome.driver", DriverPath.chromePath());
        ChromeOptions chromoptions=new ChromeOptions();
        chromoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromoptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/modal-dialogs");

    }

     @AfterSuite
     protected void tearDown(){
        driver.quit();
    }

}
