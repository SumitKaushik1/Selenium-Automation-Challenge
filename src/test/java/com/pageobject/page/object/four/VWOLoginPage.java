package com.pageobject.page.object.four;

import com.pageobject.base.BasePageObjectFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ReadFileConstants;
import org.openqa.selenium.By;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

public class VWOLoginPage extends BasePageObjectFour {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    public VWOLoginPage enterUserNameVWOLogin(String username) throws KeyUrlNotFoundException {
       // ThreadLocalWebDriver.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("emailAddress"));
       // this.enterCredentials(emailAddressVWOLoginPage,LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.EMAILADDRESS));
        this.enterCredentials(emailAddressVWOLoginPage,username);
        return this;
    }

    public VWOLoginPage enterPasswordVWOLogin(String password) throws KeyUrlNotFoundException {

       // ThreadLocalWebDriver.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password1"));;
      // this.enterCredentials(passwordVWOLoginPage,LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.PASSWORD1));
        this.enterCredentials(passwordVWOLoginPage,password);


        return this;
    }


    public VWODashBoardPage clickButtonVWOLogin() throws KeyUrlNotFoundException {


       // ThreadLocalWebDriver.getDriver().findElement(signInButtonVWOLoginPage).click();;
      this.clickLogin(signInButtonVWOLoginPage);
        return new VWODashBoardPage();
    }




}
