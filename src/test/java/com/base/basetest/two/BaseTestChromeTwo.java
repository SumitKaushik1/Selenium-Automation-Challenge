package com.base.basetest.two;

import enumconstants.ReadFileConstants;
import path.DriverFilesPath;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import propertesfilesread.FrameoworksConstantPropertyFileRead;


import java.time.Duration;
import java.util.Objects;

//no one extend this class
public final class BaseTestChromeTwo {

    //only variable  used within the class
    private static WebDriver driver;
    //static bz i wnat ot use hte static method

    //non one make object of this class
    //object only made in this class not outsdie the class
    private BaseTestChromeTwo() {

    }


    //method call by class naem
    public static void setUpChrome() throws Exception {

        System.setProperty("webdriver.chrome.driver", DriverFilesPath.chromePath());
        //  System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.get("https://demoqa.com/webtables");


        //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
        driver.get(FrameoworksConstantPropertyFileRead.readPropertyFile(ReadFileConstants.URLTWO));

    }


    //mehod call by class anme
    public static void tearDownChrome() {
        driver.quit();
    }

    //method call by classname
    public static WebDriver getDriverChrome() {
        if (Objects.nonNull(driver))
            return driver;
        else
            return null;


    }

}