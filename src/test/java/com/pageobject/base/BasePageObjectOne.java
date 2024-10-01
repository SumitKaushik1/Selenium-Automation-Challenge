package com.pageobject.base;

import customExceptions.KeyUrlNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.util.List;


//this base class is made to reduce verbosity ie the repeatative ness of the code int the child class
public class BasePageObjectOne {


    protected void  sendCredentialsKeys(By usernameApplitools,String stringValueFromPropertyFile) throws KeyUrlNotFoundException {

        ThreadLocalWebDriver.getDriver().findElement(usernameApplitools).sendKeys(stringValueFromPropertyFile);

    }

    protected void clickLogin(By buttonApplitools){

        ThreadLocalWebDriver.getDriver().findElement(buttonApplitools).click();

    }

    protected List<WebElement> findMoreElements(By spans){


        return  ThreadLocalWebDriver.getDriver().
                findElements(spans);
    }


}
