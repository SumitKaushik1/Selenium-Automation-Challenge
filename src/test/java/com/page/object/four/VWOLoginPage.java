package com.page.object.four;

import com.page.object.one.AppiloToolsWebElementLoginPage;
import customExceptions.KeyUrlNotFoundException;
import org.openqa.selenium.By;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

public class VWOLoginPage {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    public VWOLoginPage enterUserNameVWOLogin() throws KeyUrlNotFoundException {
        ThreadLocalWebDriver.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("emailAddress"));
        return this;
    }

    public VWOLoginPage enterPasswordVWOLogin() throws KeyUrlNotFoundException {

        ThreadLocalWebDriver.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password1"));;
        return this;
    }


    public VWODashBoardPage clickButtonVWOLogin() throws KeyUrlNotFoundException {
        ThreadLocalWebDriver.getDriver().findElement(signInButtonVWOLoginPage).click();;
        return new VWODashBoardPage();
    }




}
