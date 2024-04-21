package com.common;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseTestEdge {
    protected WebDriver driver;
    //each browser must have its own driver to find eleement

    public void setupEdge(){

        System.setProperty("webDriver.edge.driver", DriverPath.edgePath());
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");



    }

    public void tearDownEdge(){
        driver.quit();
    }

}
