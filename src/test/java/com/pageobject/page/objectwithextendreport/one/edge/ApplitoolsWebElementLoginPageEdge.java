package com.pageobject.page.objectwithextendreport.one.edge;

import com.pageobject.basepageobject.one.BasePageObjectOneEdge;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneEdgeTest;
import org.openqa.selenium.By;

public class ApplitoolsWebElementLoginPageEdge extends BasePageObjectOneEdge {

    private final By usernameApplitools = By.xpath("//input[@id='username']");
    private final By passwordApplitools= By.xpath("//input[@id='password']");

    private final By buttonApplitools=By.xpath("//a[@id='log-in']");

    public ApplitoolsWebElementLoginPageEdge enterUserNameApplitools(String username, ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws Exception {
         // ThreadLocalWebDriver.getDriver().findElement(usernameApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("userName"));

      // enusm are made to control all the constants from one place ie from enum class predefined so the constsants of string i snot needed
      //  this.sendCredentialsKeys(usernameApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.USERNAME));
        this.sendCredentialsKeys(usernameApplitools,username,"username",applitoolsChallengeOneEdgeTest);
        return this;
    }

    public ApplitoolsWebElementLoginPageEdge enterPasswordApplitools(String password, ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws Exception {

         //ThreadLocalWebDriver.getDriver().findElement(passwordApplitools).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password"));;
        //this.sendCredentialsKeys(passwordApplitools,LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD));
        this.sendCredentialsKeys(passwordApplitools,password,"password",applitoolsChallengeOneEdgeTest);

        return this;
    }
    public ApplitoolsWebElementDashBoardPageEdge clickButtonApplitools(ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws Exception {
      // ThreadLocalWebDriver.getDriver().findElement(buttonApplitools).click();
       //since you have clicked then you are logged in now you can use  the elements of the dashbaordPage



        this.clickLogin(buttonApplitools,"login in ",applitoolsChallengeOneEdgeTest);
       // jsut adding one test case login button click

       // ExtendLoggerToAddLogsInReportOne.pass("appilo log in button click");


       return new ApplitoolsWebElementDashBoardPageEdge();
    }


}
