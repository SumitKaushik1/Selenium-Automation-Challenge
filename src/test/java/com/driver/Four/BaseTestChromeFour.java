package com.driver.Four;

import enumconstants.URLPropertiesConstants;
import org.openqa.selenium.WebDriver;
import path.DriverAndFilesPathConstants;
import org.openqa.selenium.chrome.ChromeDriver;

import propertesfilesread.URLConstantFileReadPropertyUtils;
import threadlocal.ThreadLocalWebDriverManager;

import java.time.Duration;
import java.util.Objects;


//no other class can extent it
public final  class BaseTestChromeFour {

    //only this class can use this variable
    //staatic bz i want ot use in the ststic method
    //private static WebDriver driver;


    //we donot use public bz this method will only be used within package
  //  public static void setUpChrome() throws Exception {

    //it can be used by classname
    static void setUpChrome() throws Exception {

        if (Objects.isNull(ThreadLocalWebDriverManager.getDriver())) {
            System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
            //driver = new ChromeDriver();
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname
            ThreadLocalWebDriverManager.setDriver(new ChromeDriver());
            ThreadLocalWebDriverManager.getDriver().manage().window().maximize();
            ThreadLocalWebDriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // ThreadLocalWebDriverManager.getDriver().get("https://app.vwo.com/#/login");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            ThreadLocalWebDriverManager.getDriver().get(URLConstantFileReadPropertyUtils.get(URLPropertiesConstants.URLFOUR));
        }

    }

    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }




    //it can be used by classname
    public static void tearDown() {

        //it will first close the browser by removing hte driver instsnce
        if (Objects.nonNull(ThreadLocalWebDriverManager.getDriver()))
            ThreadLocalWebDriverManager.getDriver().quit();
        //then we will remove the thread local variable which is holding the refernce of driver
        ThreadLocalWebDriverManager.unload();

    }



}