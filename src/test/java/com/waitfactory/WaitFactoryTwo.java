package com.waitfactory;

import enumconstants.WaitStrategy;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitFactoryTwo {

   // CLICKABLE,VISIBLE,NONE;
  public static WebElement explicitWaitToBePerform(WaitStrategy waitStrategy,
                                                   DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest, WebElement element){


      if(waitStrategy==WaitStrategy.CLICKABLE){
       return   new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(100))
                  .until(ExpectedConditions.elementToBeClickable(element));



      }else if(waitStrategy==WaitStrategy.NONE)
        return  new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10))
                  .until(ExpectedConditions.elementToBeClickable(element));


        else
            return null;

    }
}
