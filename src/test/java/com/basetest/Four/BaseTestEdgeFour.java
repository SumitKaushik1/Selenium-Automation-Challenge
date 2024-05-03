package com.basetest.Four;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestEdgeFour {

   protected WebDriver driver;

    @BeforeSuite
    protected void setUpEdge(){
        System.setProperty("webdriver.edge.driver", DriverPath.edgePath());
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app.vwo.com/#/login");




    }

    @AfterSuite
    protected void tearDown(){
        driver.quit();
    }

}
