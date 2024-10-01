package com.pageobject.page.object.one;

import com.pageobject.base.BasePageObjectOne;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ReadFileConstants;
import org.openqa.selenium.By;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

public class AppiloToolsWebElementLoginPage extends BasePageObjectOne {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");

    public AppiloToolsWebElementLoginPage enterUserNameApplitools() throws KeyUrlNotFoundException {
         // ThreadLocalWebDriver.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("userName"));

      // enusm are made to control all the constants from one place ie from enum class predefined so the constsants of string i snot needed
        this.sendCredentialsKeys(usernameApplitools,LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.USERNAME));
        return this;
    }

    public AppiloToolsWebElementLoginPage enterPasswordApplitools() throws KeyUrlNotFoundException {

         //ThreadLocalWebDriver.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password"));;
        this.sendCredentialsKeys(passwordApplitools,LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.PASSWORD));
        return this;
    }
    public AppiloToolsWebElementDashBoardPage clickButtonApplitools() throws KeyUrlNotFoundException {
      // ThreadLocalWebDriver.getDriver().findElement(buttonApplitools).click();
       //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage

        this.clickLogin(buttonApplitools);
       return new AppiloToolsWebElementDashBoardPage();
    }


}
