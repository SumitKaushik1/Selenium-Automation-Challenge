package com.pageobject.base;

import com.waitfactory.WaitFactoryFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.time.Duration;

public class BasePageObjectFour {

    protected  WebElement findElement(By element){

       return ThreadLocalWebDriver.getDriver().findElement(element);
    }

   protected void enterCredentials( By element,String stringValueFromPropertyFile ) throws KeyUrlNotFoundException {

        this.findElement(element).sendKeys(stringValueFromPropertyFile);

    }
    protected void clickLogin(By element ){
       this.findElement(element).click();;

    }



    protected void findByJavascriptCode(WebElement element ){
        ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(By element, WaitStrategy waitStrategy){

       //if(waitStrategy== WaitStrategy.VISIBLE)
         //         explicityWaitForVisibilty(element);

        WaitFactoryFour.explicitlyWaitToPerform(waitStrategy,element);
    }

   /* private void  explicityWaitForVisibilty(By element){

        WebDriverWait wait =new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

    }*/

}
