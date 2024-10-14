package com.basedriver.basetest.One;

import enumconstants.ReadFileConstants;
import path.DriverAndFilesPath;
import propertesfilesread.FrameoworksConstantPropertyFileRead;

import threadlocal.ThreadLocalWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Objects;

//non one extend that

public final class BaseTestEdgeOne {

    //only this variable  used within the class
    private static WebDriver driver;
    //static bz i wnat ot use hte static method
    //each browser must have its own driver to find eleement


    //nonone make the objecct of it
    //no object making of this ,object in this calss possible
    private BaseTestEdgeOne() {

    }

//method used by clas name only

    public static void setUpEdge() throws Exception {
        if (Objects.isNull(driver)) {
            // System.setProperty("webDriver.edge.driver", DriverAndFilesPath.edgePath());
            System.setProperty("webdriver.edge.driver", DriverAndFilesPath.edgePath());

            driver = new EdgeDriver();
            //which ever thread use this method it will have the local threadlocal variale set as below
            //so it recommanded to make threadlocal variable as static bz impliclty it will make the
            // sepaerte local variable for each thread

            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname
            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            // ThreadLocalWebDriver.getDriver().get("https://demo.applitools.com/");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriver.getDriver().get(FrameoworksConstantPropertyFileRead.readPropertyFile(ReadFileConstants.URLONE));


        }
    }


    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriver.getDriver();
    }

    //method used by clas name only
    public static void tearDownEdge() {
        if (Objects.nonNull(driver))
            driver.quit();//firstly driver is reooved so that browser beome close
        //to save native memory
        ThreadLocalWebDriver.unload();//thne threadlocal variable is removed which ic sholdering
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser


    }


}
