package com.pageobjectandextendreport.page.object.four.edge;

import com.pageobjectandextendreport.basepageobjectwithextendreport.four.BasePageObjectEdgeFour;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourEdgeTest;
import org.openqa.selenium.By;

public class VWOLoginEdgePage extends BasePageObjectEdgeFour {

    //private within scope of  the class,final once intialized cannot be changed
    private final By emailAddressVWOLoginPage= By.xpath("//input[@id='login-username']");

    private final By  passwordVWOLoginPage=By.xpath("//input[@id='login-password']");

    private final By signInButtonVWOLoginPage=By.xpath("//button[@id='js-login-btn']");


    private final By invalidLoginMessageVWOLogin=By.xpath("//div[@id='js-notification-box-msg']");

    public VWOLoginEdgePage enterUserNameVWOLogin(String username, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws Exception {
       // ThreadLocalWebDriverManager.getDriver().findElement(emailAddressVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("emailAddress"));
       // this.enterCredentials(emailAddressVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ConfigPropertiesConstants.EMAILADDRESS));
        this.enterCredentials(emailAddressVWOLoginPage,username,appVWOChallengeFourEdgeTest,"username");
        return this;
    }

    public VWOLoginEdgePage enterPasswordVWOLogin(String password, AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws Exception {

       // ThreadLocalWebDriverManager.getDriver().findElement(passwordVWOLoginPage).sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password1"));;
      // this.enterCredentials(passwordVWOLoginPage,LoginCredentialsJsonFileRead.readPropertyFile(ConfigPropertiesConstants.PASSWORD1));
        this.enterCredentials(passwordVWOLoginPage,password,appVWOChallengeFourEdgeTest,"password");


        return this;
    }


    public Boolean clickButtonVWOLogin(AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws Exception {


       // ThreadLocalWebDriverManager.getDriver().findElement(signInButtonVWOLoginPage).click();;
      this.clickLogin(signInButtonVWOLoginPage,appVWOChallengeFourEdgeTest,"signinbutton" );

     // this.driverWaiting(invalidLoginMessageVWOLogin, WaitStrategyConstants.VISIBLE,appVWOChallengeFourEdgeTest);
        System.out.println("errorMessage is not displayed edge"+! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourEdgeTest).isDisplayed());

      return ! this.findElement(invalidLoginMessageVWOLogin,appVWOChallengeFourEdgeTest).isDisplayed();


    }




}
