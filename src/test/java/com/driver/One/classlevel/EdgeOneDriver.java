


package com.driver.One.classlevel;


import enumconstants.URLPropertiesConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import propertesfilesread.URLConstantFileReadPropertyUtils;

import threadlocal.ThreadLocalWebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Objects;


/**
 * Driver class is responsible for invoking and closing the browser
 *<p>
 *     it is responsible for setting the driver variable to DriverManager which handles teh thread safety for the
 *     webdriver instance </p>
 *         <pre>Checking whether it is formatted correctly</pre>
 *         Jan 20,2021
 * @author  sumit,kaushik
 * @version 1.0
 * @since  1.0
 * @see ControlEdgeOneBaseTest
 *
 */
//non one extend that

public final class EdgeOneDriver {

    //only this variable  used within the class
    private static WebDriver driver;
    //static bz i wnat ot use hte static method
    //each browser must have its own driver to find eleement


    //nonone make the objecct of it
    //no object making of this ,object in this calss possible


    /**
     * private constructor to avoid external instantiation
     */
    private EdgeOneDriver() {

    }

    /**
     * @author  sumit kaushik
     * Jan 20,2021
     *
     */

//method used by clas name only

    //we donot use public bz this method will only be used within package
   // public static void setUpEdge() throws Exception {

         static void setUpEdge() throws Exception {
        System.out.println("Thradnameedge "+Thread.currentThread().getName());

        if (Objects.isNull(driver)) {
            // System.setProperty("webDriver.edge.driver", DriverAndFilesPathConstants.edgePath());
          //  System.setProperty("webdriver.edge.driver", DriverAndFilesPathConstants.edgePath());

        //  WebDriverManager.edgedriver().clearDriverCache().setup();

            WebDriverManager.edgedriver().setup();
           // WebDriverManager.edgedriver().setup();

            driver = new EdgeDriver();
            //which ever thread use this method it will have the local threadlocal variale set as below
            //so it recommanded to make threadlocal variable as static bz impliclty it will make the
            // sepaerte local variable for each thread

            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname
            ThreadLocalWebDriverManager.setDriver(driver);
            ThreadLocalWebDriverManager.getDriver().manage().window().maximize();
            ThreadLocalWebDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            // ThreadLocalWebDriverManager.getDriver().get("https://demo.applitools.com/");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriverManager.getDriver().get(URLConstantFileReadPropertyUtils.get(URLPropertiesConstants.URLONE));


        }
    }


    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }

    //method used by clas name only
    public static void tearDownEdge() {
        if (Objects.nonNull(driver))
            driver.quit();//firstly driver is reooved so that browser beome close
        //to save native memory
        ThreadLocalWebDriverManager.unload();//thne threadlocal variable is removed which ic sholdering
        //suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser


    }


}
