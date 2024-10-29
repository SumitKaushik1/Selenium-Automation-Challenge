package com.waitfactory;

import com.basedriver.basetest.two.BaseTestChromeTwo;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitFactoryTwo {

   // CLICKABLE,VISIBLE,NONE;
  public static WebElement explicitWaitToBePerform(WaitStrategyConstants waitStrategy,
                                                   DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest, WebElement element){


      if(waitStrategy== WaitStrategyConstants.CLICKABLE){
       return   new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(100))
                  .until(ExpectedConditions.elementToBeClickable(element));



      }else if(waitStrategy== WaitStrategyConstants.NONE)
        return  new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10))
                  .until(ExpectedConditions.elementToBeClickable(element));


        else
            return null;

    }

    public static WebElement explicitWaitToBePerform(WaitStrategyConstants waitStrategy,
                                                      WebElement element){


        if(waitStrategy== WaitStrategyConstants.CLICKABLE){
            return   new WebDriverWait(BaseTestChromeTwo.getDriverChrome(), Duration.ofSeconds(100))
                    .until(ExpectedConditions.elementToBeClickable(element));



        }else if(waitStrategy== WaitStrategyConstants.NONE)
            return  new WebDriverWait(BaseTestChromeTwo.getDriverChrome(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(element));


        else
            return null;

    }



}
