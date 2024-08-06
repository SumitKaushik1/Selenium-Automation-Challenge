package com.basetest.Four;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertesfilesread.PropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;


//no other class can extent it
public final  class BaseTestChromeFour {

      //only this class can use this variable
      //staatic bz i want ot use in the ststic method
       private static  WebDriver driver;


//it can be used by classname
   public static   void setUpChrome() throws Exception {

       if(Objects.isNull(driver)){
           System.setProperty("webdriver.chrome.driver", DriverPath.chromePath());
           driver=new ChromeDriver();
           //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
           //so the thread local variable is made static even it is static the when thrad comes to it
           //it will make its own threadlocal variblae ,static only give the feature to call by classname
           ThreadLocalWebDriver.setDriver(driver);
           ThreadLocalWebDriver.getDriver().manage().window().maximize();
           ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          // ThreadLocalWebDriver.getDriver().get("https://app.vwo.com/#/login");
           ThreadLocalWebDriver.getDriver().get(PropertyFileRead.readPropertyFile("urlFour"));
       }

    }


//it can be used by classname
                public static  void tearDown(){

       //it will first close the browser by removing hte driver instsnce
                   if(Objects.nonNull(driver))
                       driver.quit();
                  //then we will remove the thread local variable which is holding the refernce of driver
                   ThreadLocalWebDriver.unload();

                }

}
