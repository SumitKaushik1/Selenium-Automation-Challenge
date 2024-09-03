package com.page.object.three;

import com.page.object.two.DemoQAWebTablePage;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Three.DemoQaModalDialogesChallengeThreeTest;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DemoQAModalDialoguePage {

    //private wihin th class scope finla once initilaized then cannot be changed
private final By largeModelButtonDemoQAModalDialoguePage = By.xpath("//button[@id='showLargeModal']");

private final By largeModelButtonTextDemoQAModalDialoguePage=By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");



    public DemoQAModalDialoguePage largeModelButtonWebElement(DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest) throws KeyUrlNotFoundException {
        WebElement largeModelButton= demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(largeModelButtonDemoQAModalDialoguePage);
        ((JavascriptExecutor)  demoQaModalDialogesChallengeThreeTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", largeModelButton );
        largeModelButton.click();

        return this;
    }

    public WebElement  largeModelButtonTextWebElement(DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest) throws KeyUrlNotFoundException {
        return   demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));



    }





}
