package com.basedriver.basetest.Four;

import enumconstants.ReadFileConstants;
import path.DriverAndFilesPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import propertesfilesread.FrameoworksConstantPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;


import java.time.Duration;
import java.util.Objects;

public class BaseTestEdgeFour {


    //it can bae used within class only
    //static bz i wnat ot use hte static method
    private static WebDriver driver;


    //it can only be called by classnaem
    public static void setUpEdge() throws Exception {

        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.edge.driver", DriverAndFilesPath.edgePath());

            driver = new EdgeDriver();
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname

            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //ThreadLocalWebDriver.getDriver().get("https://app.vwo.com/#/login");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriver.getDriver().get(FrameoworksConstantPropertyFileRead.readPropertyFile(ReadFileConstants.URLFOUR));
        }


    }


    public static WebDriver getDriver() {
        return  ThreadLocalWebDriver.getDriver();
    }



    //it can be called by classname
    public static void tearDown() {
        if (Objects.nonNull(driver))
            driver.quit();
        ThreadLocalWebDriver.unload();
    }

}