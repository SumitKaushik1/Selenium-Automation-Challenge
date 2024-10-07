package com.pageobject.page.object.one;

import com.pageobject.base.BasePageObjectOne;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ReadFileConstants;
import org.openqa.selenium.By;
import propertesfilesread.LoginCredentialsPropertyFileRead;

public class ApplitoolsWebElementLoginPage extends BasePageObjectOne {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");

    public ApplitoolsWebElementLoginPage enterUserNameApplitools(String username) throws KeyUrlNotFoundException {
         // ThreadLocalWebDriver.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("userName"));

      // enusm are made to control all the constants from one place ie from enum class predefined so the constsants of string i snot needed
      //  this.sendCredentialsKeys(usernameApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.USERNAME));
        this.sendCredentialsKeys(usernameApplitools,username);
        return this;
    }

    public ApplitoolsWebElementLoginPage enterPasswordApplitools(String password) throws KeyUrlNotFoundException {

         //ThreadLocalWebDriver.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password"));;
        //this.sendCredentialsKeys(passwordApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD));
        this.sendCredentialsKeys(passwordApplitools,password);

        return this;
    }
    public ApplitoolsWebElementDashBoardPage clickButtonApplitools() throws KeyUrlNotFoundException {
      // ThreadLocalWebDriver.getDriver().findElement(buttonApplitools).click();
       //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage

        this.clickLogin(buttonApplitools);
       return new ApplitoolsWebElementDashBoardPage();
    }


}
