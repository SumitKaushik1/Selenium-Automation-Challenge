package com.waitfactory.four;

import enumconstants.WaitStrategy;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactoryFourEdge {


    public static void explicitlyWaitToPerform(WaitStrategy waitStrategy, By element, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest){
        if(waitStrategy== WaitStrategy.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(appVWOChallengeFourEdgeTest.controlGetDriver(), Duration.ofSeconds(100));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}



    }
}
