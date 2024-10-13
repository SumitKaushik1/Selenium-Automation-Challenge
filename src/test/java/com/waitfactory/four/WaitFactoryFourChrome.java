package com.waitfactory.four;

import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactoryFourChrome {


    public static void explicitlyWaitToPerform(WaitStrategyConstants waitStrategy, By element, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest){
        if(waitStrategy== WaitStrategyConstants.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(appVWOChallengeFourChromeTest.controlGetDriver(), Duration.ofSeconds(100));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}



    }
}
