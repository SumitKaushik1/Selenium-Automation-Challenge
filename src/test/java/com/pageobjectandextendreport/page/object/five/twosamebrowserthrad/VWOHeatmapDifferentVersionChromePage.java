package com.pageobjectandextendreport.page.object.five.twosamebrowserthrad;


import com.pageobjectandextendreport.basepageobjectwithextendreport.five.twosamebrowserthread.BasePageObjectDifferntVersionChromeFive;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Five.sametwobrowsertwothreads.AppVWOChallengeFiveTest;
import org.example.TestCases.Five.sametwobrowsertwothreads.DiffernetVersionAppVWOChallengeFiveTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VWOHeatmapDifferentVersionChromePage extends BasePageObjectDifferntVersionChromeFive {

    private final  By triggerElementFiveVWOHeatmap1=By.xpath("//li[2]//div[2]//div[1]//div[3]");

    private final By triggerElementFiveVWOHeatmap2=By.xpath("//li[1]//div[2]//div[1]//div[3]");

    private final By buttonElementVWOHeatmap=By.xpath("//li[2]//div[2]//div[1]//div[3]");





    public VWOHeatmapDifferentVersionChromePage triggerElementFiveVWOHeatmap1(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest) throws Exception {

       // this.driverWaiting(appVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1, WaitStrategyConstants.VISIBLE);

        // WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementOneVWOHeatmap);
        WebElement triggerElement= this.findElement( triggerElementFiveVWOHeatmap1,differnetVersionAppVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
      //  Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
        //actions.moveToElement(triggerElement).perform();

        this.moveToElement(differnetVersionAppVWOChallengeFiveTest,triggerElement,"frame");

        return this ;
    }


    public void   triggerElementFiveVWOHeatmap2(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest) throws Exception {


     //   this.driverWaiting(appVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1, WaitStrategyConstants.CLICKABLE);


        // this.driverWaiting(appVWOChallengeFiveTest,triggerElementOneVWOHeatmap,WaitStrategyConstants.VISIBLE);
      //  WebElement triggerElement = appVWOChallengeFiveTest.controlGetDriver().findElement(triggerElementTwoVWOHeatmap);

        WebElement triggerElement= this.findElement(triggerElementFiveVWOHeatmap2,differnetVersionAppVWOChallengeFiveTest);
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
        //Actions actions = new Actions(appVWOChallengeFiveTest.controlGetDriver());
       // actions.moveToElement(triggerElement).perform();

       this.moveToElement(differnetVersionAppVWOChallengeFiveTest,triggerElement,"frame");

    }


    public void  buttonClickVWOHeatmap(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest) throws Exception {

        this.driverWaiting(differnetVersionAppVWOChallengeFiveTest,triggerElementFiveVWOHeatmap1, WaitStrategyConstants.CLICKABLE);
        // Once the button is visible, identify the button element and click on it
        /*1.*/
        //WebElement buttonElement = appVWOChallengeFiveTest.controlGetDriver().findElement(buttonElementVWOHeatmap);
        //you can use this button of other trigger element if upper one button donot work
        /*2.*/  //WebElement buttonElement = this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        WebElement buttonElement= this.findElement(buttonElementVWOHeatmap, differnetVersionAppVWOChallengeFiveTest);
       this.clickOnButton(buttonElement,"framebutton");
       // buttonElement.click();


    }

}
