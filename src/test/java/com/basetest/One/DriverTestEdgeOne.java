package com.basetest.One;

import com.threadLocal.ThreadLocalWebDriver;
import driverpath.DriverPath;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.Objects;

//non one extend that
public final class DriverTestEdgeOne {

    private static WebDriver driver;
    //each browser must have its own driver to find eleement


    //nonone make the objecct of it
    private DriverTestEdgeOne(){

    }



    public static  void setupEdge() {
        if (Objects.isNull(driver)) {
            // System.setProperty("webDriver.edge.driver", DriverPath.edgePath());
            System.setProperty("webdriver.edge.driver", DriverPath.edgePath());

            driver = new EdgeDriver();
            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            ThreadLocalWebDriver.getDriver().get("https://demo.applitools.com/");



        }
    }





      public static void tearDownEdge() {
            if (Objects.nonNull(driver))
                //to save native memory
                driver.quit();

            ThreadLocalWebDriver.unload();
        }



    }
