package com.pageobject.page.object.five;

import com.pageobject.base.BasePageObjectFive;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VWOHeatmapPage extends BasePageObjectFive {

    private final  By triggerElementOneVWOHeatmap=By.xpath("//li[2]//div[2]//div[1]//div[3]");

    private final By triggerElementTwoVWOHeatmap=By.xpath("//li[1]//div[2]//div[1]//div[3]");

    private final By buttonElementVWOHeatmap=By.xpath("//li[2]//div[2]//div[1]//div[3]");





    public VWOHeatmapPage triggerElementOneVWOHeatmap(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {
       // WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementOneVWOHeatmap);
        WebElement triggerElement= this.findElement(triggerElementOneVWOHeatmap,appVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
      //  Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
        //actions.moveToElement(triggerElement).perform();

        this.moveToElement(appVWOChallengeFiveTest,triggerElement);

        return this ;
    }


    public void   triggerElementTwoVWOHeatmap(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {
      //  WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementTwoVWOHeatmap);

        WebElement triggerElement= this.findElement(triggerElementTwoVWOHeatmap,appVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
        //Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
       // actions.moveToElement(triggerElement).perform();

       this.moveToElement(appVWOChallengeFiveTest,triggerElement);

    }


    public void  buttonClickVWOHeatmap(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {

        // Once the button is visible, identify the button element and click on it
        /*1.*/
        //WebElement buttonElement = appVWOChallengeFiveTest.controlGetDriver().findElement(buttonElementVWOHeatmap);
        //you can use this button of other trigger element if upper one button donot work
        /*2.*/  //WebElement buttonElement = this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        WebElement buttonElement= this.findElement(buttonElementVWOHeatmap, appVWOChallengeFiveTest);
        buttonElement.click();


    }

}
