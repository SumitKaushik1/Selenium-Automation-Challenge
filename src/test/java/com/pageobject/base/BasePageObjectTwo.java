package com.pageobject.base;

import enumconstants.WaitStrategy;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.waitfactory.WaitFactoryTwo;

import java.time.Duration;

public class BasePageObjectTwo {

    //suppose you donot know that what you want ot return
    protected  WebElement findElement(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By elmement){


          return  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement( elmement);

    }




    protected  WebDriverWait  wait(WaitStrategy waitStrategy,DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,WebElement element ){


      // return  new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10));
      return (WebDriverWait) WaitFactoryTwo.explicitWaitToBePerform( waitStrategy, demoQAWebsiteChallengeTwoTest, element);

    }


    protected void  findByJavscriptCode(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,WebElement element){

        ((JavascriptExecutor) demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element);//for this srolling is not required

    }



    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected void clickOnButton(WaitStrategy waitStrategy,By element,DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest){
       // if(waitStrategy==WaitStrategy.CLICKABLE)
         //   explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);

       WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
        WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,demoQAWebsiteChallengeTwoTest,webElement);

        this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

    }



    /*private WebElement  explicitlyWaitForClickable(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By element){


       return new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));


    }*/


}
