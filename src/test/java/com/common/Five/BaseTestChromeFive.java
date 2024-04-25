package com.common.Five;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestChromeFive {

   protected WebDriver driver;

    @BeforeSuite
     protected void setUpChrome(){
             System.setProperty("webdriver.chrome.driver", DriverPath.chromePath());
             driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");


    }

    @AfterSuite
    protected void tearDown(){
        driver.quit();
    }

}
