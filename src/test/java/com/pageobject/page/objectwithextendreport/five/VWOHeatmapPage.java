package com.pageobject.page.objectwithextendreport.five;

import com.pageobject.basepageobject.BasePageObjectFive;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategy;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VWOHeatmapPage extends BasePageObjectFive {

    private final  By triggerElementFiveVWOHeatmap1=By.xpath("//li[2]//div[2]//div[1]//div[3]");

    private final By triggerElementFiveVWOHeatmap2=By.xpath("//li[1]//div[2]//div[1]//div[3]");

    private final By buttonElementVWOHeatmap=By.xpath("//li[2]//div[2]//div[1]//div[3]");





    public VWOHeatmapPage triggerElementFiveVWOHeatmap1(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {

        this.driverWaiting(appVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1,WaitStrategy.VISIBLE);

        // WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementOneVWOHeatmap);
        WebElement triggerElement= this.findElement( triggerElementFiveVWOHeatmap1,appVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
      //  Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
        //actions.moveToElement(triggerElement).perform();

        this.moveToElement(appVWOChallengeFiveTest,triggerElement);

        return this ;
    }


    public void   triggerElementFiveVWOHeatmap2(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {


        this.driverWaiting(appVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1,WaitStrategy.CLICKABLE);


        // this.driverWaiting(appVWOChallengeFiveTest,triggerElementOneVWOHeatmap,WaitStrategy.VISIBLE);
      //  WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementTwoVWOHeatmap);

        WebElement triggerElement= this.findElement(triggerElementFiveVWOHeatmap2,appVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
        //Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
       // actions.moveToElement(triggerElement).perform();

       this.moveToElement(appVWOChallengeFiveTest,triggerElement);

    }


    public void  buttonClickVWOHeatmap(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws KeyUrlNotFoundException {

        this.driverWaiting(appVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1,WaitStrategy.CLICKABLE);
        // Once the button is visible, identify the button element and click on it
        /*1.*/
        //WebElement buttonElement = appVWOChallengeFiveTest.controlGetDriver().findElement(buttonElementVWOHeatmap);
        //you can use this button of other trigger element if upper one button donot work
        /*2.*/  //WebElement buttonElement = this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        WebElement buttonElement= this.findElement(buttonElementVWOHeatmap, appVWOChallengeFiveTest);
        buttonElement.click();


    }

}
