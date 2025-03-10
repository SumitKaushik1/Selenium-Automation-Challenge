package com.driver.Four;

import enumconstants.URLPropertiesConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import propertesfilesread.URLConstantFileReadPropertyUtils;
import threadlocal.ThreadLocalWebDriverManager;


import java.time.Duration;
import java.util.Objects;

public class BaseTestEdgeFour {


    //it can bae used within class only
    //static bz i wnat ot use hte static method
    private static WebDriver driver;

    //we donot use public bz this method will only be used within package
    //public static void setUpEdge() throws Exception {
    //it can only be called by classnaem
     static void setUpEdge() throws Exception {

        if (Objects.isNull(driver)) {
           // System.setProperty("webdriver.edge.driver", DriverAndFilesPathConstants.edgePath());

            WebDriverManager.edgedriver().clearDriverCache().setup();
            driver = new EdgeDriver();
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname

            ThreadLocalWebDriverManager.setDriver(driver);
            ThreadLocalWebDriverManager.getDriver().manage().window().maximize();
            ThreadLocalWebDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //ThreadLocalWebDriverManager.getDriver().get("https://app.vwo.com/#/login");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriverManager.getDriver().get(URLConstantFileReadPropertyUtils.get(URLPropertiesConstants.URLFOUR));
        }


    }


    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }



    //it can be called by classname
    public static void tearDown() {
        if (Objects.nonNull(driver))
            driver.quit();
        ThreadLocalWebDriverManager.unload();
    }

}