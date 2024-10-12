package com.pageobject.basepageobject;

import com.waitfactory.WaitFactoryFive;
import enumconstants.WaitStrategy;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePageObjectFive {


   protected WebElement findElement(By element , AppVWOChallengeFiveTest appVWOChallengeFiveTest){
        return appVWOChallengeFiveTest.controlGetDriver().findElement(element);


    }


    protected void moveToElement(AppVWOChallengeFiveTest appVWOChallengeFiveTest,WebElement element){
        Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
        actions.moveToElement(element).perform();
    }

    protected void switchWindow(String window, AppVWOChallengeFiveTest  appVWOChallengeFiveTest){
        appVWOChallengeFiveTest.controlGetDriver().switchTo().window(window);


    }


    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string
    protected  void driverWaiting(AppVWOChallengeFiveTest appVWOChallengeFiveTest,By element, WaitStrategy waitStrategy){

        //if(waitStrategy== WaitStrategy.VISIBLE)
        //         explicityWaitForVisibilty(element);

        WaitFactoryFive.explicitlyWaitToPerform(appVWOChallengeFiveTest,waitStrategy,element);
    }


}
