package com.basetest.Four;

import driverpath.DriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import threadlocal.ThreadLocalWebDriver;


import java.time.Duration;
import java.util.Objects;

public class BaseTestEdgeFour {


    //it can bae used within class only
    //static bz i wnat ot use hte static method
     private static WebDriver driver;


     //it can only be called by classnaem
    public  static  void setUpEdge(){

        if(Objects.isNull(driver)){
            System.setProperty("webdriver.edge.driver", DriverPath.edgePath());
            driver=new EdgeDriver();
            //which ever thread useing this method that thread imopliclaty will have its own threadlocal variable
            //so the thread local variable is made static even it is static the when thrad comes to it
            //it will make its own threadlocal variblae ,static only give the feature to call by classname

            ThreadLocalWebDriver.setDriver(driver);
            ThreadLocalWebDriver.getDriver().manage().window().maximize();
            ThreadLocalWebDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            ThreadLocalWebDriver.getDriver().get("https://app.vwo.com/#/login");
        }





    }


    //it can be called by classname
  public static void tearDown(){
        if(Objects.nonNull(driver))
               driver.quit();
      ThreadLocalWebDriver.unload();
    }

}