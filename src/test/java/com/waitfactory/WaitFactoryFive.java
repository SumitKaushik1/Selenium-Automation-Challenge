package com.waitfactory;

import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactoryFive {

    public static void explicitlyWaitToPerform(AppVWOChallengeFiveTest appVWOChallengeFiveTest, WaitStrategyConstants waitStrategy, By element){
        if(waitStrategy== WaitStrategyConstants.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(appVWOChallengeFiveTest.controlGetDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}
        else if(waitStrategy ==  WaitStrategyConstants.CLICKABLE)
        {   WebDriverWait wait =new WebDriverWait(appVWOChallengeFiveTest.controlGetDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }



    }
}
