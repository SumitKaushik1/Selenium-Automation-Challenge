package com.pageobject.base;

import org.example.TestCases.Three.DemoQaModalDialogesChallengeThreeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePageObjectThree {



    protected WebElement findElement(
            DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest, By element){

        return  demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(element);


    }
    protected void findByJavascriptCode( DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest, WebElement element){
        ((JavascriptExecutor)  demoQaModalDialogesChallengeThreeTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element);

    }


}
