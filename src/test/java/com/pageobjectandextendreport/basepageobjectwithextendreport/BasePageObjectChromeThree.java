package com.pageobjectandextendreport.basepageobjectwithextendreport;

import com.extendedreport.three.ExtendLoggerToAddLogInReportThree;
import org.example.TestCases.Three.DemoQaModalDialogesChallengeThreeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePageObjectChromeThree {



    protected WebElement findElement(
            DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest, By element){

        return  demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(element);


    }
    protected void findByJavascriptCode( DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest, WebElement element){
        ((JavascriptExecutor)  demoQaModalDialogesChallengeThreeTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

    }



    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected void clickOnButton(WebElement webElement,String elementname) throws Exception {
        // if(waitStrategy==WaitStrategyConstants.CLICKABLE)
        //   explicitlyWaitForClickable(demoQAWebsiteChallengeTwoTest,element);

        //   WebElement webElement= this.findElement(demoQAWebsiteChallengeTwoTest,element);
       // WaitFactoryTwo.explicitWaitToBePerform(waitStrategy,demoQAWebsiteChallengeTwoTest,element);

        //this.findElement(demoQAWebsiteChallengeTwoTest,element).click();

        webElement.click();

        //  TwoExtentLogger.pass(elementname+" is clicked");
        ExtendLoggerToAddLogInReportThree.pass(elementname+" is clicked",true);


    }


}
