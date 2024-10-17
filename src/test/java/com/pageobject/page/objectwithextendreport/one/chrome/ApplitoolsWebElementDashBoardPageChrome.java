package com.pageobject.page.objectwithextendreport.one.chrome;

import com.pageobject.basepageobject.one.BasePageObjectOneChrome;
import customExceptions.KeyUrlNotFoundException;
import com.utilslikeexcelpojo.challengeutils.one.CalculateEarnedSpent;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneChromeTest;
import org.openqa.selenium.By;

//class is made final so that it cannot be  inherited by any other class
public final  class ApplitoolsWebElementDashBoardPageChrome extends BasePageObjectOneChrome {


    //private scope within the class final it cannot be changed once initialsed
    private final By negativeSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]");
    private final By positiveSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]");



    public ApplitoolsWebElementDashBoardPageChrome getCurrentUrl(ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws KeyUrlNotFoundException {

        String currentUrl=applitoolsChallengeOneChromeTest.controlGetDriver().getCurrentUrl();
        return this;
    }

    public ApplitoolsWebElementDashBoardPageChrome negativeSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent,ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
        //ThreadLocalWebDriver.getDriver().
          //     findElements(negativeSpansApplitoolsDashBoard)
        //.forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));


       this.findMoreElements(negativeSpansApplitoolsDashBoard,applitoolsChallengeOneChromeTest).forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));
       // Iterate over the negative <span> elements and print their text content
        return this;
    }

    public ApplitoolsWebElementDashBoardPageChrome positiveSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent,ApplitoolsChallengeOneChromeTest applitoolsChallengeOneChromeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
       // ThreadLocalWebDriver.getDriver().
         //       findElements(positiveSpansApplitoolsDashBoard)
           //     .forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
            //    );
        // Iterate over the negative <span> elements and print their text content

        this.findMoreElements(positiveSpansApplitoolsDashBoard,
                applitoolsChallengeOneChromeTest).forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
                    );
        return this;
    }


}
