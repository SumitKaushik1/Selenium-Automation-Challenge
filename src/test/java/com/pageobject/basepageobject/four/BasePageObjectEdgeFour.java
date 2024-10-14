package com.pageobject.basepageobject.four;

import com.extendedreport.four.ExtendLoggerToAddLogInReportFour;
import com.waitfactory.four.WaitFactoryFourEdge;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import threadlocal.ThreadLocalWebDriver;

public class BasePageObjectEdgeFour {

    protected  WebElement findElement(By element, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest){

       return appVWOChallengeFourEdgeTest.controlGetDriver().findElement(element);
    }

   protected void enterCredentials( By element,String stringValueFromPropertyFile,AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest ,String elementname ) throws Exception {

        this.findElement(element,appVWOChallengeFourEdgeTest)
                .clear();
        this.findElement(element,appVWOChallengeFourEdgeTest ).sendKeys(stringValueFromPropertyFile);
       ExtendLoggerToAddLogInReportFour.pass(stringValueFromPropertyFile+"is entered successfully in "+elementname,true);

    }
    protected void clickLogin(By element,AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest,String elementname ) throws Exception {
       this.findElement(element,appVWOChallengeFourEdgeTest).click();;
        ExtendLoggerToAddLogInReportFour.pass(elementname+" is clicked",true);

    }



    protected void findByJavascriptCode(WebElement element,AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest ){
        ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(By element, WaitStrategyConstants waitStrategy, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest ){

       //if(waitStrategy== WaitStrategyConstants.VISIBLE)
         //         explicityWaitForVisibilty(element);

        WaitFactoryFourEdge.explicitlyWaitToPerform(waitStrategy,element,appVWOChallengeFourEdgeTest);
    }

   /* private void  explicityWaitForVisibilty(By element){

        WebDriverWait wait =new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }*/

}
