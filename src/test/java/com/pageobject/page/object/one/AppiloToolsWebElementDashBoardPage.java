package com.pageobject.page.object.one;

import com.pageobject.base.BasePageObjectOne;
import customExceptions.KeyUrlNotFoundException;
import org.Utils.CalculateEarnedSpent;
import org.openqa.selenium.By;
import threadlocal.ThreadLocalWebDriver;

//class is made final so that it cannot be  inherited by any other class
public final  class AppiloToolsWebElementDashBoardPage extends BasePageObjectOne {


    //private scope within the class final it cannot be changed once initialsed
    private final By negativeSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]");
    private final By positiveSpansApplitoolsDashBoard = By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]");



    public AppiloToolsWebElementDashBoardPage getCurrentUrl() throws KeyUrlNotFoundException {

        String currentUrl=ThreadLocalWebDriver.getDriver().getCurrentUrl();
        return this;
    }

    public AppiloToolsWebElementDashBoardPage negativeSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
        //ThreadLocalWebDriver.getDriver().
          //     findElements(negativeSpansApplitoolsDashBoard)
        //.forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));


       this.findMoreElements(negativeSpansApplitoolsDashBoard).forEach( amountSpent -> calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim())));
       // Iterate over the negative <span> elements and print their text content
        return this;
    }

    public AppiloToolsWebElementDashBoardPage positiveSpanApplitoolsDashbord(CalculateEarnedSpent calculateEarnedSpent) throws KeyUrlNotFoundException {

        //what we are doing we are finding hte element here and doing the operation on it and retrun this class object back
       // ThreadLocalWebDriver.getDriver().
         //       findElements(positiveSpansApplitoolsDashBoard)
           //     .forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
            //    );
        // Iterate over the negative <span> elements and print their text content

        this.findMoreElements(positiveSpansApplitoolsDashBoard).forEach( amountEarned -> calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()))
                    );
        return this;
    }


}
