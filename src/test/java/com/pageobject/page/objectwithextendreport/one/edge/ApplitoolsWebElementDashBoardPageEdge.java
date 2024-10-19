package com.pageobject.page.objectwithextendreport.one.edge;

import com.pageobject.basepageobject.one.BasePageObjectOneEdge;
import com.utilslikeexcelpojodataprovider.challengeutils.one.CalculateEarnedSpent;
import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.One.One.testNgclassLevelparalleltestngfile.ApplitoolsChallengeOneEdgeTest;
import org.openqa.selenium.By;
import threadlocal.ThreadLocalWebDriver;

//class is made final so that it cannot be  inherited by any other class
public final  class ApplitoolsWebElementDashBoardPageEdge extends BasePageObjectOneEdge {


    //private scope within the class final it cannot be changed once initialsed
    private final By negativeSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]");
    private final By positiveSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]");



    public ApplitoolsWebElementDashBoardPageEdge getCurrentUrl() throws KeyUrlNotFoundException {

        String currentUrl=ThreadLocalWebDriver.getDriver().getCurrentUrl();
        return this;
    }

    public ApplitoolsWebElementDashBoardPageEdge negativeSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent, ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
        //ThreadLocalWebDriver.getDriver().
          //     findElements(negativeSpansApplitoolsDashBoard)
        //.forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));


       this.findMoreElements(negativeSpansApplitoolsDashBoard,applitoolsChallengeOneEdgeTest).forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));
       // Iterate over the negative <span> elements and print their text content
        return this;
    }

    public ApplitoolsWebElementDashBoardPageEdge positiveSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent,ApplitoolsChallengeOneEdgeTest applitoolsChallengeOneEdgeTest) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
       // ThreadLocalWebDriver.getDriver().
         //       findElements(positiveSpansApplitoolsDashBoard)
           //     .forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
            //    );
        // Iterate over the negative <span> elements and print their text content

        this.findMoreElements(positiveSpansApplitoolsDashBoard,applitoolsChallengeOneEdgeTest).forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
                    );
        return this;
    }


}
