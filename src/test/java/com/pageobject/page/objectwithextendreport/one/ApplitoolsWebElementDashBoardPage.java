package com.pageobject.page.objectwithextendreport.one;

import com.pageobject.basepageobject.one.BasePageObjectOne;
import com.pojo.Pojo.one.CalculateEarnedSpent;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneChromeEdgeTest;
import org.openqa.selenium.By;

public class ApplitoolsWebElementDashBoardPage extends BasePageObjectOne {


    //private scope within the class final it cannot be changed once initialsed
    private final By negativeSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]");
    private final By positiveSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]");



    public ApplitoolsWebElementDashBoardPage getCurrentUrl(ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws KeyUrlNotFoundException {

        String currentUrl=applitoolsChallengeOneChromeEdgeTest.controlGetDriver().getCurrentUrl();
        return this;
    }

    public ApplitoolsWebElementDashBoardPage negativeSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent, ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
        //ThreadLocalWebDriverManager.getDriver().
        //     findElements(negativeSpansApplitoolsDashBoard)
        //.forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));


        this.findMoreElements(negativeSpansApplitoolsDashBoard,applitoolsChallengeOneChromeEdgeTest).forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));
        // Iterate over the negative <span> elements and print their text content
        return this;
    }

    public ApplitoolsWebElementDashBoardPage positiveSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent,ApplitoolsChallengeOneChromeEdgeTest applitoolsChallengeOneChromeEdgeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
        // ThreadLocalWebDriverManager.getDriver().
        //       findElements(positiveSpansApplitoolsDashBoard)
        //     .forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
        //    );
        // Iterate over the negative <span> elements and print their text content

        this.findMoreElements(positiveSpansApplitoolsDashBoard,
                applitoolsChallengeOneChromeEdgeTest).forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
        );
        return this;
    }

}
