package com.pageobjectandextendreport.basepageobjectwithextendreport;

import com.driver.two.BaseTestControlChromeTwo;
import com.extendedreport.two.ConsoleLoggerImpl;
import com.extendedreport.two.ExtentLoggerImpl;
import com.extendedreport.two.TwoExtentLogger;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.waitfactory.WaitFactoryTwo;



public class BasePageObjectChromeTwo extends BaseTestControlChromeTwo {

    //suppose you donot know that what you want ot return
    protected  WebElement findElement(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By elmement){


          return  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement( elmement);

    }

    protected  WebElement findElement(By elmement){


        return controlGetDriver().findElement( elmement);

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
      //  if(waitStrategy==WaitStrategyConstants.CLICKABLE)
        //    explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);



    //   WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
        WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,demoQAWebsiteChallengeTwoTest,element);

        //this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

        element.click();

       // TwoExtentLogger.pass(elementname+" is clicked");
     TwoExtentLogger.pass(elementname+" is clicked",true);
        new ExtentLoggerImpl().log("pass",(elementname+"is clicked"));
        new ConsoleLoggerImpl().log("pass",(elementname+"is clicked"));

    }


    protected void clickOnButton(WaitStrategyConstants waitStrategy,By element, String elementname) throws Exception {
        //  if(waitStrategy==WaitStrategyConstants.CLICKABLE)
        //    explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);

      WebElement webElement=this.findElement(element);

        //   WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
        WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,webElement);

        //this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

        webElement.click();

        //  TwoExtentLogger.pass(elementname+" is clicked");
       TwoExtentLogger.pass(elementname+" is clicked",true);
        new ExtentLoggerImpl().log("pass",(elementname+"is clicked"));
        new ConsoleLoggerImpl().log("pass",(elementname+"is clicked"));

    }


    protected WebElement getPageTitle(By titleOfpage,String elementname ) throws Exception {
        WebElement webElement=this.findElement(titleOfpage);
        TwoExtentLogger.pass(elementname+" is clicked",true);
        new ExtentLoggerImpl().log("pass",(elementname+"is clicked"));
        new ConsoleLoggerImpl().log("pass",(elementname+"is clicked"));
        return webElement;
    }



    /*private WebElement  explicitlyWaitForClickable(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest,By element){


       return new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));


    }*/





}
