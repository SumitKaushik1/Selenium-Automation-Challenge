package com.pageobject.page.objectwithextendreport.one.chrome;

import com.pageobject.basepageobject.one.BasePageObjectOneChrome;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneChromeTest;
import org.openqa.selenium.By;

public class ApplitoolsWebElementLoginPageChrome extends BasePageObjectOneChrome {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");

    public ApplitoolsWebElementLoginPageChrome enterUserNameApplitools(String username, ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws Exception {
         // ThreadLocalWebDriverManager.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("userName"));

      // enusm are made to control all the constants from one place ie from enum class predefined so the constsants of string i snot needed
      //  this.sendCredentialsKeys(usernameApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ConfigProperties.USERNAME));
        this.sendCredentialsKeys(usernameApplitools,username,"username",applitoolsChallengeOneChromeTest);
        return this;
    }

    public ApplitoolsWebElementLoginPageChrome enterPasswordApplitools(String password, ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws Exception {

         //ThreadLocalWebDriverManager.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password"));;
        //this.sendCredentialsKeys(passwordApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ConfigProperties.PASSWORD));
        this.sendCredentialsKeys(passwordApplitools,password,"password",applitoolsChallengeOneChromeTest);

        return this;
    }
    public ApplitoolsWebElementDashBoardPageChrome clickButtonApplitools(ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws Exception {
      // ThreadLocalWebDriverManager.getDriver().findElement(buttonApplitools).click();
       //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage



        this.clickLogin(buttonApplitools,"login in ",applitoolsChallengeOneChromeTest);
       // jsut adding one test case login button click

       // OneExtentLogger.pass("appilo log in button click");


       return new ApplitoolsWebElementDashBoardPageChrome();
    }


}
