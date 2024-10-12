package com.pageobject.page.objectwithextendreport.four.edge;

import com.pageobject.basepageobject.four.BasePageObjectEdgeFour;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourEdgeTest;
import org.openqa.selenium.By;

public class VWOLoginEdgePage extends BasePageObjectEdgeFour {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    private final By invalidLoginMessageVWOLogin=By.xpath("//div[@id='js-notification-box-msg']");

    public VWOLoginEdgePage enterUserNameVWOLogin(String username, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws KeyUrlNotFoundException {
       // ThreadLocalWebDriver.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("emailAddress"));
       // this.enterCredentials(emailAddressVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.EMAILADDRESS));
        this.enterCredentials(emailAddressVWOLoginPage,username,appVWOChallengeFourEdgeTest);
        return this;
    }

    public VWOLoginEdgePage enterPasswordVWOLogin(String password, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws KeyUrlNotFoundException {

       // ThreadLocalWebDriver.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password1"));;
      // this.enterCredentials(passwordVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD1));
        this.enterCredentials(passwordVWOLoginPage,password,appVWOChallengeFourEdgeTest);


        return this;
    }


    public Boolean clickButtonVWOLogin(AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws KeyUrlNotFoundException {


       // ThreadLocalWebDriver.getDriver().findElement(signInButtonVWOLoginPage).click();;
      this.clickLogin(signInButtonVWOLoginPage,appVWOChallengeFourEdgeTest );

     // this.driverWaiting(invalidLoginMessageVWOLogin, WaitStrategy.VISIBLE,appVWOChallengeFourEdgeTest);
        System.out.println("errorMessage is not displayed edge"+! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourEdgeTest).isDisplayed());

      return ! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourEdgeTest).isDisplayed();


    }




}
