package com.driver;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver webDriver;

    private static ThreadLocal<WebDriver> threadLocalWebdriver;

    public Driver(){
        threadLocalWebdriver=new ThreadLocal<>();
    }

    public static void setDriver(WebDriver driver){
        //you can use locally anything static or non static variable but
        //static method can only use static outside  instance variable
        threadLocalWebdriver.set(driver);
    }


    public static void initDriver(){


    }






}
