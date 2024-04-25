package com.common.One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestEdgeOne {
    protected WebDriver driver;
    //each browser must have its own driver to find eleement

    @BeforeSuite
    protected void setupEdge(){

       // System.setProperty("webDriver.edge.driver", DriverPath.edgePath());
        System.setProperty("webdriver.edge.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");

        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");



    }

    @AfterSuite
    protected  void tearDownEdge(){

        //to save native memory
        driver.quit();
    }

}
