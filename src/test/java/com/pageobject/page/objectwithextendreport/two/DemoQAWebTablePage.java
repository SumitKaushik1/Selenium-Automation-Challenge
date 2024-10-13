package com.pageobject.page.objectwithextendreport.two;

import com.pageobject.basepageobject.BasePageObjectTwo;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DemoQAWebTablePage extends BasePageObjectTwo {

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
       // WebElement editButton =   demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(editButtonDemoQAWebTablePage);
        WebElement editButton =this.findElement(demoQAWebsiteChallengeTwoTest,editButtonDemoQAWebTablePage);

       // ((JavascriptExecutor) demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", editButton );
       this.findByJavscriptCode( demoQAWebsiteChallengeTwoTest,editButton );

        this.clickOnButton(WaitStrategyConstants.CLICKABLE,editButton,demoQAWebsiteChallengeTwoTest,"add button");

       // editButton.click();
     //  ExtendLoggerTwo.pass("add button is clicked");

             return this;
    }

    public  WebElement registrtionTextElement( DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {


        //WebElement webElement=demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(registrationFormElementPage);

        WebElement webElement =this.findElement(demoQAWebsiteChallengeTwoTest,registrationFormElementPage);

        System.out.println(webElement.getText());

      //  ExtendLoggerTwo.pass("registration form opened");
        return webElement;
    }



    public  DemoQAWebTablePage addDetails(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {
     // demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(firsNameDemoQAWebTablePage).sendKeys("sumit");

        this.findElement(demoQAWebsiteChallengeTwoTest,firsNameDemoQAWebTablePage).clear();
      this.findElement(demoQAWebsiteChallengeTwoTest,firsNameDemoQAWebTablePage).sendKeys("sumit");

   //  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(lastNameDemoQAWebTablePage).sendKeys("kaushik");

        this.findElement(demoQAWebsiteChallengeTwoTest,lastNameDemoQAWebTablePage).clear();
        this.findElement(demoQAWebsiteChallengeTwoTest,lastNameDemoQAWebTablePage).sendKeys("kaushik");


      //  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(emailDemoQAWebTablePage).sendKeys("pritam@gmail.com");


        this.findElement(demoQAWebsiteChallengeTwoTest,emailDemoQAWebTablePage).clear();
        this.findElement(demoQAWebsiteChallengeTwoTest,emailDemoQAWebTablePage).sendKeys("pritam@gmail.com");

       // demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(ageDemoQAWebTablePage).sendKeys("24");

        this.findElement(demoQAWebsiteChallengeTwoTest,ageDemoQAWebTablePage).clear();
        this.findElement(demoQAWebsiteChallengeTwoTest,ageDemoQAWebTablePage).sendKeys("24");


      //  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(salaryDemoQAWebTablePage).sendKeys("24000");

        this.findElement(demoQAWebsiteChallengeTwoTest,salaryDemoQAWebTablePage).clear();
        this.findElement(demoQAWebsiteChallengeTwoTest,salaryDemoQAWebTablePage).sendKeys("24000");

       // demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(departmentDemoQAWebTablePage).sendKeys("scient");

        this.findElement(demoQAWebsiteChallengeTwoTest,departmentDemoQAWebTablePage).clear();
        this.findElement(demoQAWebsiteChallengeTwoTest,departmentDemoQAWebTablePage).sendKeys("scient");


       // WebElement submitButton=demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(submitDetailsButtonDemoQAWebTablePage);
        WebElement submitButton= this.findElement(demoQAWebsiteChallengeTwoTest,submitDetailsButtonDemoQAWebTablePage);
       // ((JavascriptExecutor)demoQAWebsiteChallengeTwoTest.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);

        this.findByJavscriptCode(demoQAWebsiteChallengeTwoTest,submitButton);


      //  WebElement button = demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement( submitDetailsButtonDemoQAWebTablePage);
        Actions actions = new Actions(demoQAWebsiteChallengeTwoTest.controlGetDriver());
        actions.moveToElement(submitButton).perform();

        this.clickOnButton(WaitStrategyConstants.CLICKABLE, submitButton,demoQAWebsiteChallengeTwoTest,"submit button");

      // submitButton.click();


     //   ExtendLoggerTwo.pass("submit button clicked");

        return this;
    }


    public  WebElement firstNameCheckWebElement(DemoQAWebsiteChallengeTwoTest demoQAWebsiteChallengeTwoTest) throws KeyUrlNotFoundException {


      // return  demoQAWebsiteChallengeTwoTest.controlGetDriver().findElement(firstNameCheckWebElementPage);
       return  this.findElement(demoQAWebsiteChallengeTwoTest,firstNameCheckWebElementPage);

    }


}
