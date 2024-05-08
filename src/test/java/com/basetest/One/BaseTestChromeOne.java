package com.basetest.One;

import threadlocal.ThreadLocalWebDriver;
import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

//no extending of this class
public final  class BaseTestChromeOne {
//BaseTestChromeOne is the class which is used by whole class
// but only once like the navigation to url but it is
// used only once it is base of the class
    //BaseTestChromeOne class is actullay related to test so it is kept in the test folder
    //BaseTestChromeOne will be extended so it is kept in the same folder as test folder

    private static WebDriver driver;
    //static bz i wnat ot use hte static method
   //only this variable  used within the class

    //no object of this class only this calss make this object
    //no object making of this ,object in this calss possible
         private BaseTestChromeOne(){

         }



    


//method used by clas name only
      public static void  setUpChrome(){
        //  System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");
        if(Objects.isNull(driver)){
            System.setProperty("webdriver.chrome.driver",DriverPath.chromePath());


            driver=new ChromeDriver();//ChromeDriver class from webdriver famework uses the upper location for the driver
            //which ever thread use this method it will have the local threadlocal variale set as below
            //so it recommanded to make threadlocal variable as static bz impliclty it will make the
            // sepaerte local variable for each thread
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname

            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            ThreadLocalWebDriver.getDriver().get("https://demo.applitools.com/");
        }

    }



    //method used by clas name only
    public static  void tearDownChrome(){
        //all connections to .exe file is gone but driver can hold the refeence of the instance
       //to save native memory
       if(Objects.nonNull(driver))
           driver.quit();//firstly driver is reomved
           ThreadLocalWebDriver.unload();//then the threadloal variable is removed
//suppsoe thradlocal variable si only reomved that browser reamin open bz driver
        // instaance still holding the refeence of browser
    }

}
