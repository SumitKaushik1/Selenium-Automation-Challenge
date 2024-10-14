package com.pageobject.page.objectwithextendreport.four.chrome;

import com.pageobject.basepageobject.four.BasePageObjectChromeFour;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourChromeTest;
import org.openqa.selenium.By;

public class VWOLoginChromePage extends BasePageObjectChromeFour {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    private final By invalidLoginMessageVWOLogin=By.xpath("//div[@id='js-notification-box-msg']");

    public VWOLoginChromePage enterUserNameVWOLogin(String username, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest) throws Exception {
       // ThreadLocalWebDriver.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("emailAddress"));
       // this.enterCredentials(emailAddressVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.EMAILADDRESS));
        this.enterCredentials(emailAddressVWOLoginPage,username,appVWOChallengeFourChromeTest,"username");
        return this;
    }

    public VWOLoginChromePage enterPasswordVWOLogin(String password, AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest) throws Exception {

       // ThreadLocalWebDriver.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password1"));;
      // this.enterCredentials(passwordVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD1));
        this.enterCredentials(passwordVWOLoginPage,password,appVWOChallengeFourChromeTest,"password");


        return this;
    }


    public Boolean clickButtonVWOLogin(AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest) throws Exception {


       // ThreadLocalWebDriver.getDriver().findElement(signInButtonVWOLoginPage).click();;
      this.clickLogin(signInButtonVWOLoginPage,appVWOChallengeFourChromeTest,"signinbutton");

     // this.driverWaiting(invalidLoginMessageVWOLogin, WaitStrategyConstants.VISIBLE,appVWOChallengeFourChromeTest);
        System.out.println("errror message is not displayed in chrome"+! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourChromeTest).isDisplayed());
      return ! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourChromeTest).isDisplayed();


    }




}
