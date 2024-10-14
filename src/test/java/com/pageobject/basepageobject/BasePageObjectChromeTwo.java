package com.pageobject.basepageobject;

import com.extendedreport.two.ExtendLoggerToAddLogInReportTwo;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.waitfactory.WaitFactoryTwo;

public class BasePageObjectChromeTwo {

    //suppose you donot know that what you want ot return
    protected  WebElement findElement(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By elmement){


          return  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement( elmement);

    }




    protected  WebElement wait(WaitStrategyConstants waitStrategy, DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest, WebElement element ){


      // return  new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10));
      return  WaitFactoryTwo.explicitWaitToBePerform( waitStrategy, demoQAWebsiteChallengeTwoTest, element);

    }


    protected void  findByJavscriptCode(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,WebElement element){

        ((JavascriptExecutor) demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element);//for this srolling is not required

    }



    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected void clickOnButton(WaitStrategyConstants waitStrategy, WebElement element, DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest, String elementname) throws Exception {
       // if(waitStrategy==WaitStrategyConstants.CLICKABLE)
         //   explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);

    //   WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
        WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,demoQAWebsiteChallengeTwoTest,element);

        //this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

        element.click();

      //  ExtendLoggerToAddLogInReportTwo.pass(elementname+" is clicked");
        ExtendLoggerToAddLogInReportTwo.pass(elementname+" is clicked",true);


    }



    /*private WebElement  explicitlyWaitForClickable(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By element){


       return new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));


    }*/


}
