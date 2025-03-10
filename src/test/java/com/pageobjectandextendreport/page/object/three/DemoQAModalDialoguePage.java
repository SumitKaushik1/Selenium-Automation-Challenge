package com.pageobjectandextendreport.page.object.three;

import com.pageobjectandextendreport.basepageobjectwithextendreport.BasePageObjectChromeThree;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Three.DemoQaModalDialogesChallengeThreeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQAModalDialoguePage  extends BasePageObjectChromeThree {

    //private wihin th class scope finla once initilaized then cannot be changed
private final By largeModelButtonDemoQAModalDialoguePage = By.xpath("//button[@id='showLargeModal']");

private final By largeModelButtonTextDemoQAModalDialoguePage=By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");



    public DemoQAModalDialoguePage largeModelButtonWebElement(DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest) throws Exception {
        //WebElement largeModelButton= demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(largeModelButtonDemoQAModalDialoguePage);
       // ((JavascriptExecutor)  demoQaModalDialogesChallengeThreeTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", largeModelButton );

        WebElement largeModelButton= this.findElement(demoQaModalDialogesChallengeThreeTest,largeModelButtonDemoQAModalDialoguePage);
        this.findByJavascriptCode(demoQaModalDialogesChallengeThreeTest,largeModelButton);

       this.clickOnButton(largeModelButton,"largemodelbutton");
        //largeModelButton.click();

        return this;
    }

    public WebElement  largeModelButtonTextWebElement(DemoQaModalDialogesChallengeThreeTest demoQaModalDialogesChallengeThreeTest) throws KeyUrlNotFoundException {

       return  this.findElement( demoQaModalDialogesChallengeThreeTest,largeModelButtonTextDemoQAModalDialoguePage);
       // return   demoQaModalDialogesChallengeThreeTest.controlGetDriver().findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));



    }





}
