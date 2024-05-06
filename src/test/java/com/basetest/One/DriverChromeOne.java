package com.basetest.One;

import com.threadLocal.ThreadLocalWebDriver;
import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.Objects;

//no extending of this class
public final  class DriverChromeOne {
//DriverChromeOne is the class which is used by whole class
// but only once like the navigation to url but it is
// used only once it is base of the class
    //DriverChromeOne class is actullay related to test so it is kept in the test folder
    //DriverChromeOne will be extended so it is kept in the same folder as test folder

    private static WebDriver driver;
    //ie it can be used only by the deriveed class ie the child class

    //no object of this class
 private DriverChromeOne(){

 }



    



      public static void  setUpChrome(){
        //  System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");
        if(Objects.isNull(driver)){
            System.setProperty("webdriver.chrome.driver",DriverPath.chromePath());


            driver=new ChromeDriver();//ChromeDriver class from webdriver famework uses the upper location for the driver
            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            ThreadLocalWebDriver.getDriver().get("https://demo.applitools.com/");
        }

    }




    public static  void tearDown(){
        //all connections to .exe file is gone but driver can hold the refeence of the instance
       //to save native memory
       if(Objects.nonNull(driver))
           driver.quit();

       ThreadLocalWebDriver.unload();
    }

}
