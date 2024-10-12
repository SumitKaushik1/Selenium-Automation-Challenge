package com.waitfactory.four;

import enumconstants.WaitStrategy;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactoryFourChrome {


    public static void explicitlyWaitToPerform(WaitStrategy waitStrategy, By element, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest){
        if(waitStrategy== WaitStrategy.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(appVWOChallengeFourChromeTest.controlGetDriver(), Duration.ofSeconds(100));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}



    }
}
