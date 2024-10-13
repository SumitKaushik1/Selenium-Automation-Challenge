package com.pageobject.page.objectwithextendreport.four.chrome;

import com.pageobject.basepageobject.four.BasePageObjectChromeFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Four.FourtestNgclassLevelparallel.AppVWOChallengeFourChromeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VWODashBoardPageChrome extends BasePageObjectChromeFour {
    private final By textVWOLoginPage=By.cssSelector("span[class='Fw(semi-bold) ng-binding']");

    public WebElement vWODashbord( AppVWOChallengeFourChromeTest appVWOChallengeFourChromeTest) throws KeyUrlNotFoundException {

       // WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds


      //  WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(textVWOLoginPage));
        this.driverWaiting(textVWOLoginPage, WaitStrategyConstants.VISIBLE,appVWOChallengeFourChromeTest);
      //  ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", text);

       WebElement text = this.findElement(textVWOLoginPage,appVWOChallengeFourChromeTest);

        this.findByJavascriptCode(text,appVWOChallengeFourChromeTest);
        System.out.println(text.getText());

        // Iterate over the negative <span> elements and print their text content

        return text;
    }

}
