package com.pageobjectandextendreport.basepageobjectwithextendreport.one.methodlevel;

import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.methodlevel.ApplitoolsChallengeOneChromeEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePageObjectOne {



    protected void  sendCredentialsKeys(By usernameApplitools, String stringValueFromPropertyFile, String elementname, ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws Exception {

        applitoolsChallengeOneChromeEdgeTest.controlGetDriver().findElement(usernameApplitools).sendKeys(stringValueFromPropertyFile);
       // OneExtentLogger.pass(stringValueFromPropertyFile+"is entered successfully in "+elementname,true);
    }

    protected void clickLogin(By buttonApplitools, String elementname , ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws Exception {


        applitoolsChallengeOneChromeEdgeTest.controlGetDriver().findElement(buttonApplitools).click();
        //OneExtentLogger.pass(elementname+" is clicked",true);
    }

    protected List<WebElement> findMoreElements(By spans, ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest){


        return  applitoolsChallengeOneChromeEdgeTest.controlGetDriver().
                findElements(spans);
    }


}
