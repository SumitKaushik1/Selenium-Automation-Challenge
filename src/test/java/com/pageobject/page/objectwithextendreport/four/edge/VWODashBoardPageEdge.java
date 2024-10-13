package com.pageobject.page.objectwithextendreport.four.edge;

import com.pageobject.basepageobject.four.BasePageObjectEdgeFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourEdgeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VWODashBoardPageEdge extends BasePageObjectEdgeFour {
    private final By textVWOLoginPage=By.cssSelector("span[class='Fw(semi-bold) ng-binding']");

    public WebElement vWODashbord(AppVWOChallengeFourEdgeTest appVWOChallengeFourEdgeTest) throws KeyUrlNotFoundException {

       // WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds


      //  WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(textVWOLoginPage));
        this.driverWaiting(textVWOLoginPage, WaitStrategyConstants.VISIBLE,appVWOChallengeFourEdgeTest);
      //  ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", text);

       WebElement text = this.findElement(textVWOLoginPage,appVWOChallengeFourEdgeTest);

        this.findByJavascriptCode( text,appVWOChallengeFourEdgeTest);
        System.out.println(text.getText());

        // Iterate over the negative <span> elements and print their text content

        return text;
    }

}
