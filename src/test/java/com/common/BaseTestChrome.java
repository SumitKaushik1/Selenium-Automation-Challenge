package com.common;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTestChrome {
//BaseTestChrome is the class which is used by whole class
// but only once like the navigation to url but it is
// used only once it is base of the class
    //BaseTestChrome class is actullay related to test so it is kept in the test folder
    //BaseTestChrome will be extended so it is kept in the same folder as test folder

    protected WebDriver driver;
    //ie it can be used only by the deriveed class ie the child class

    @BeforeSuite
    public void  setUpChrome(){
        System.setProperty("webDriver.chrome.driver",DriverPath.chromePath());
        driver=new ChromeDriver();//ChromeDriver class from webdriver famework uses the upper location for the driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");
    }



    @AfterSuite
    public void tearDown(){
        //all connections to .exe file is gone but driver can hold the refeence of the instance

        driver.quit();
    }

}
