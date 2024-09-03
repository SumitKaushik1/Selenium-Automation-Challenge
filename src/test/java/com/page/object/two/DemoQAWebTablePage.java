package com.page.object.two;

import com.page.object.one.AppiloToolsWebElementDashBoardPage;
import customExceptions.KeyUrlNotFoundException;
import org.Utils.CalculateEarnedSpent;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import threadlocal.ThreadLocalWebDriver;

import java.time.Duration;

public class DemoQAWebTablePage {

    //private scope within the class final it cannot be changed once initialsed
    private final By editButtonDemoQAWebTablePage =By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]");


    private final By submitDetailsButtonDemoQAWebTablePage=
            By.xpath("//button[@id='submit']");

    private final By firsNameDemoQAWebTablePage=By.xpath("//input[@id='firstName']");
    private final By lastNameDemoQAWebTablePage=By.xpath("//input[@id='lastName']");
    private final By emailDemoQAWebTablePage=By.xpath("//input[@id='userEmail']");
    private final By ageDemoQAWebTablePage=By.xpath("//input[@id='age']");
    private final By salaryDemoQAWebTablePage=By.xpath("//input[@id='salary']");
    private final By departmentDemoQAWebTablePage=By.xpath("//input[@id='department']");
    private final By submitButtonDemoQAWebTablePage=By.xpath(" //button[@id='submit']");


    private final By firstNameCheckWebElementDemoQAWebTablePage=By.xpath("//div[normalize-space()='sumit']");


    private final By firstNameCheckWebElementPage=By.xpath("//div[normalize-space()='sumit']");

    private final By registrationFormElementPage=By.xpath("//div[@id='registration-form-modal']");





    private final  By addNewRecordButtonPage =By.xpath("//button[@id='addNewRecordButton']");


    public  DemoQAWebTablePage editButtonWebElement( DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
        WebElement editButton = demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(editButtonDemoQAWebTablePage);
        ((JavascriptExecutor) demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", editButton );
        editButton.click();

        return this;
    }

    public  WebElement registrtionTextElement( DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
        WebElement webElement=demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(registrationFormElementPage);
        System.out.println(webElement.getText());
        return webElement;
    }

    public  DemoQAWebTablePage submitPreviousDetailButtonAndAddNewRecordButton (DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
        WebElement element1=demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(submitDetailsButtonDemoQAWebTablePage);
        ((JavascriptExecutor) demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element1);//for this srolling is not required
        element1.click();

        WebDriverWait wait = new WebDriverWait(demoQAWebsiteChallengeTwoTest.controlGetDriver(), Duration.ofSeconds(10));
        //xpath changes so you have ot paste again and again using the seelctorhub pro
       wait.until(ExpectedConditions.elementToBeClickable(addNewRecordButtonPage)).click();


        return this;
    }

    public  DemoQAWebTablePage addDetails(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
      demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(firsNameDemoQAWebTablePage).sendKeys("sumit");

     demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(lastNameDemoQAWebTablePage)
        .sendKeys("kaushik");
        demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(emailDemoQAWebTablePage)
        .sendKeys("pritam@gmail.com");
        demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(ageDemoQAWebTablePage)
        .sendKeys("24");
        demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(salaryDemoQAWebTablePage)
        .sendKeys("24000");
        demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(departmentDemoQAWebTablePage)
       .sendKeys("scient");

        WebElement submitButton=demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(submitDetailsButtonDemoQAWebTablePage);
        ((JavascriptExecutor)demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);

        submitButton.click();


        return this;
    }


    public  WebElement firstNameCheckWebElement(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
       return  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(firstNameCheckWebElementPage);

    }


}
