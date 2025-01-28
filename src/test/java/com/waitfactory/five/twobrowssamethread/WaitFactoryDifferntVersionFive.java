package com.waitfactory.five.twobrowssamethread;

import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Five.sametwobrowsertwothreads.DiffernetVersionAppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactoryDifferntVersionFive {

    public static void explicitlyWaitToPerform( DiffernetVersionAppVWOChallengeFiveTest  differnetVersionAppVWOChallengeFiveTest, WaitStrategyConstants waitStrategy, By element){
        if(waitStrategy== WaitStrategyConstants.VISIBLE)
        {     WebDriverWait wait =new WebDriverWait(differnetVersionAppVWOChallengeFiveTest.controlGetDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));}
        else if(waitStrategy ==  WaitStrategyConstants.CLICKABLE)
        {   WebDriverWait wait =new WebDriverWait(differnetVersionAppVWOChallengeFiveTest.controlGetDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }



    }





    }

