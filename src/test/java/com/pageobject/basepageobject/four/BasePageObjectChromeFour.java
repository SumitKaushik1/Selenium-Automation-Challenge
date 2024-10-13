package com.pageobject.basepageobject.four;

import com.waitfactory.four.WaitFactoryFourChrome;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePageObjectChromeFour {

    protected  WebElement findElement(By element, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest){

       return appVWOChallengeFourChromeTest.controlGetDriver().findElement(element);
    }

   protected void enterCredentials( By element,String stringValueFromPropertyFile,AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest  ) throws KeyUrlNotFoundException {

        this.findElement(element,appVWOChallengeFourChromeTest).clear();

        this.findElement(element,appVWOChallengeFourChromeTest ).sendKeys(stringValueFromPropertyFile);

    }
    protected void clickLogin(By element,AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest){
       this.findElement(element,appVWOChallengeFourChromeTest).click();;

    }



    protected void findByJavascriptCode(WebElement element,AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest ){
        ((JavascriptExecutor)appVWOChallengeFourChromeTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(By element, WaitStrategyConstants waitStrategy, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest){

       //if(waitStrategy== WaitStrategyConstants.VISIBLE)
         //         explicityWaitForVisibilty(element);

        WaitFactoryFourChrome.explicitlyWaitToPerform(waitStrategy,element,appVWOChallengeFourChromeTest);
    }

   /* private void  explicityWaitForVisibilty(By element){

        WebDriverWait wait =new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }*/

}
