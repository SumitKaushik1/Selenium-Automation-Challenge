package com.page.object.one;

import customExceptions.KeyUrlNotFoundException;
import org.openqa.selenium.By;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

public class AppiloToolsWebElementLoginPage {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");

    public AppiloToolsWebElementLoginPage enterUserNameApplitools() throws KeyUrlNotFoundException {
          ThreadLocalWebDriver.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("userName"));
         return this;
    }

    public AppiloToolsWebElementLoginPage enterPasswordApplitools() throws KeyUrlNotFoundException {

         ThreadLocalWebDriver.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password"));;
         return this;
    }
    public AppiloToolsWebElementDashBoardPage clickButtonApplitools() throws KeyUrlNotFoundException {
       ThreadLocalWebDriver.getDriver().findElement(buttonApplitools).click();
       //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage
       return new AppiloToolsWebElementDashBoardPage();
    }


}
