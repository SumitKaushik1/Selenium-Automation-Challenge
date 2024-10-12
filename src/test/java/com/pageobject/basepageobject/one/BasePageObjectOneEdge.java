package com.pageobject.basepageobject.one;

import com.extendedreport.one.ExtendLoggerOne;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


//this base class is made to reduce verbosity ie the repeatative ness of the code int the child class
public class BasePageObjectOneEdge {


    protected void  sendCredentialsKeys(By usernameApplitools, String stringValueFromPropertyFile, String elementname, ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws KeyUrlNotFoundException {

        applitoolsChallengeOneEdgeTest.controlGetDriver().findElement(usernameApplitools).sendKeys(stringValueFromPropertyFile);
        ExtendLoggerOne.pass(stringValueFromPropertyFile+"is entered successfully in "+elementname);
    }

    protected void clickLogin(By buttonApplitools,String elementname,ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest){

        applitoolsChallengeOneEdgeTest.controlGetDriver().findElement(buttonApplitools).click();
        ExtendLoggerOne.pass(elementname+" is clicked");
    }

    protected List<WebElement> findMoreElements(By spans,ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest){


        return applitoolsChallengeOneEdgeTest.controlGetDriver().
                findElements(spans);
    }


}
