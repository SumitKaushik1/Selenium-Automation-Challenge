package com.pageobjectandextendreport.page.object.one;

import com.pageobjectandextendreport.basepageobjectwithextendreport.one.BasePageObjectOne;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneChromeEdgeTest;
import org.openqa.selenium.By;

public class ApplitoolsWebElementLoginPage  extends BasePageObjectOne {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");



    public ApplitoolsWebElementLoginPage enterUserNameApplitools(String username, ApplitoolsChallengeOneChromeEdgeTest  applitoolsChallengeOneChromeEdgeTest) throws Exception {
        // ThreadLocalWebDriverManager.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("userName"));

        // enusm are made to control all the constants from one place ie from enum class predefined so the constsants of string i snot needed
        //  this.sendCredentialsKeys(usernameApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ConfigProperties.USERNAME));
        this.sendCredentialsKeys(usernameApplitools,username,"username",applitoolsChallengeOneChromeEdgeTest);
        return this;
    }

    public ApplitoolsWebElementLoginPage enterPasswordApplitools(String password, ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws Exception {

        //ThreadLocalWebDriverManager.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password"));;
        //this.sendCredentialsKeys(passwordApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ConfigProperties.PASSWORD));
        this.sendCredentialsKeys(passwordApplitools,password,"password",applitoolsChallengeOneChromeEdgeTest);

        return this;
    }
    public ApplitoolsWebElementDashBoardPage clickButtonApplitools(ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws Exception {
        // ThreadLocalWebDriverManager.getDriver().findElement(buttonApplitools).click();
        //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage



        this.clickLogin(buttonApplitools,"login in ",applitoolsChallengeOneChromeEdgeTest);
        // jsut adding one test case login button click

        // OneExtentLogger.pass("appilo log in button click");


        return new ApplitoolsWebElementDashBoardPage();
    }


}
