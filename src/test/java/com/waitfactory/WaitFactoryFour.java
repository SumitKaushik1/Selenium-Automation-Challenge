package com.waitfactory;

import enumconstants.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import threadlocal.ThreadLocalWebDriver;

import java.time.Duration;

public class WaitFactoryFour {


    public static void explicitlyWaitToPerform(WaitStrategy waitStrategy, By element){
        if(waitStrategy== WaitStrategy.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}



    }
}
