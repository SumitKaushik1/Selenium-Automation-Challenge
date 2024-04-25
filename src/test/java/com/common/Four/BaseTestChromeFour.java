package com.common.Four;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestChromeFour {
   protected WebDriver driver;


    @BeforeSuite
   protected void setUpChrome(){

        System.setProperty("webdriver.chrome.driver", DriverPath.chromePath());
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app.vwo.com/#/login");
    }


    @AfterSuite
    protected void tearDown(){
        driver.quit();
    }

}
