package com.pageobject.basepageobject.one;

import com.extendedreport.one.ExtendLoggerOne;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


//this base class is made to reduce verbosity ie the repeatative ness of the code int the child class
public class BasePageObjectOneChrome {


    protected void  sendCredentialsKeys(By usernameApplitools,String stringValueFromPropertyFile,String elementname,ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws Exception {

        applitoolsChallengeOneChromeTest.controlGetDriver().findElement(usernameApplitools).sendKeys(stringValueFromPropertyFile);
        ExtendLoggerOne.pass(stringValueFromPropertyFile+"is entered successfully in "+elementname,true);
    }

    protected void clickLogin(By buttonApplitools, String elementname , ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws Exception {

        applitoolsChallengeOneChromeTest.controlGetDriver().findElement(buttonApplitools).click();
        ExtendLoggerOne.pass(elementname+" is clicked",true);
    }

    protected List<WebElement> findMoreElements(By spans,ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest){


        return  applitoolsChallengeOneChromeTest.controlGetDriver().
                findElements(spans);
    }


}
