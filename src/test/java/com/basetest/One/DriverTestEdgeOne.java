package com.basetest.One;

import com.threadLocal.ThreadLocalWebDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;

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
            System.setProperty("webdriver.edge.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
            EdgeOptions edgeOptions=new EdgeOptions();
            edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new EdgeDriver(edgeOptions);
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
