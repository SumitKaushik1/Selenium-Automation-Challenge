package com.pageobjectandextendreport.basepageobjectwithextendreport.five.twosamebrowserthread;

import com.waitfactory.five.twobrowssamethread.WaitFactoryDifferntVersionFive;
import com.waitfactory.five.twobrowssamethread.WaitFactoryFive;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Five.sametwobrowsertwothreads.AppVWOChallengeFiveTest;
import org.example.TestCases.Five.sametwobrowsertwothreads.DiffernetVersionAppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePageObjectDifferntVersionChromeFive {


   protected WebElement findElement(By element , DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest){
        return differnetVersionAppVWOChallengeFiveTest.controlGetDriver().findElement(element);


    }


    protected void moveToElement(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest, WebElement element, String elementname) throws Exception {
        Actions actions = new Actions(differnetVersionAppVWOChallengeFiveTest.controlGetDriver());
        actions.moveToElement(element).perform();

        //ExtendLoggerToAddLogInReportFive.pass(" move to element"+elementname,true);
    }

    protected void switchWindow(String window, DiffernetVersionAppVWOChallengeFiveTest  differnetVersionAppVWOChallengeFiveTest,String elementname) throws Exception {
        differnetVersionAppVWOChallengeFiveTest.controlGetDriver().switchTo().window(window);

      //  ExtendLoggerToAddLogInReportFive.pass(" switch to "+elementname,true);


    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest,By element, WaitStrategyConstants waitStrategy){

        //if(waitStrategy== WaitStrategyConstants.VISIBLE)
        //         explicityWaitForVisibilty(element);

        WaitFactoryDifferntVersionFive.explicitlyWaitToPerform(differnetVersionAppVWOChallengeFiveTest,waitStrategy,element);
    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected void clickOnButton( WebElement element, String elementname) throws Exception {
        // if(waitStrategy==WaitStrategyConstants.CLICKABLE)
        //   explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);

        //   WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
       // WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,demoQAWebsiteChallengeTwoTest,element);

        //this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

        element.click();

        //  TwoExtentLogger.pass(elementname+" is clicked");
      //  ExtendLoggerToAddLogInReportFive.pass(elementname+" is clicked",true);


    }


}
