package com.pageobject.basepageobject.one;

import com.extendedreport.one.ExtendLoggerToAddLogsInReportOne;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


//this base class is made to reduce verbosity ie the repeatative ness of the code int the child class
public class BasePageObjectOneEdge {


    protected void  sendCredentialsKeys(By usernameApplitools, String stringValueFromPropertyFile, String elementname, ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws Exception {

        applitoolsChallengeOneEdgeTest.controlGetDriver().findElement(usernameApplitools).sendKeys(stringValueFromPropertyFile);
        ExtendLoggerToAddLogsInReportOne.pass(stringValueFromPropertyFile+"is entered successfully in "+elementname,true);
    }

    protected void clickLogin(By buttonApplitools,String elementname,ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws Exception {

        applitoolsChallengeOneEdgeTest.controlGetDriver().findElement(buttonApplitools).click();
        ExtendLoggerToAddLogsInReportOne.pass(elementname+" is clicked",true);
    }

    protected List<WebElement> findMoreElements(By spans,ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest){


        return applitoolsChallengeOneEdgeTest.controlGetDriver().
                findElements(spans);
    }


}
