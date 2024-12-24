package com.pageobjectandextendreport.basepageobjectwithextendreport.five.samebrowser;

import com.waitfactory.five.samebrowser.WaitFactoryFive;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Five.sameonebrowser.AppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePageObjectChromeFive {


   protected WebElement findElement(By element , AppVWOChallengeFiveTest appVWOChallengeFiveTest){
        return appVWOChallengeFiveTest.controlGetDriver().findElement(element);


    }


    protected void moveToElement(AppVWOChallengeFiveTest appVWOChallengeFiveTest,WebElement element,String elementname) throws Exception {
        Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
        actions.moveToElement(element).perform();

        //ExtendLoggerToAddLogInReportFive.pass(" move to element"+elementname,true);
    }

    protected void switchWindow(String window, AppVWOChallengeFiveTest  appVWOChallengeFiveTest,String elementname) throws Exception {
        appVWOChallengeFiveTest.controlGetDriver().switchTo().window(window);

      //  ExtendLoggerToAddLogInReportFive.pass(" switch to "+elementname,true);


    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(AppVWOChallengeFiveTest appVWOChallengeFiveTest,By element, WaitStrategyConstants waitStrategy){

        //if(waitStrategy== WaitStrategyConstants.VISIBLE)
        //         explicityWaitForVisibilty(element);

        WaitFactoryFive.explicitlyWaitToPerform(appVWOChallengeFiveTest,waitStrategy,element);
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
