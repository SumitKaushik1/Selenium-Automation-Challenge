package com.pageobject.page.object.four;

import com.pageobject.base.BasePageObjectFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ReadFileConstants;
import enumconstants.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.util.Objects;

public class VWOLoginPage extends BasePageObjectFour {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    private final By invalidLoginMessageVWOLogin=By.xpath("//div[@id='js-notification-box-msg']");

    public VWOLoginPage enterUserNameVWOLogin(String username) throws KeyUrlNotFoundException {
       // ThreadLocalWebDriver.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("emailAddress"));
       // this.enterCredentials(emailAddressVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.EMAILADDRESS));
        this.enterCredentials(emailAddressVWOLoginPage,username);
        return this;
    }

    public VWOLoginPage enterPasswordVWOLogin(String password) throws KeyUrlNotFoundException {

       // ThreadLocalWebDriver.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password1"));;
      // this.enterCredentials(passwordVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD1));
        this.enterCredentials(passwordVWOLoginPage,password);


        return this;
    }


    public Boolean clickButtonVWOLogin() throws KeyUrlNotFoundException {


       // ThreadLocalWebDriver.getDriver().findElement(signInButtonVWOLoginPage).click();;
      this.clickLogin(signInButtonVWOLoginPage);


      return ! this.findElement(invalidLoginMessageVWOLogin).isDisplayed();


    }




}
