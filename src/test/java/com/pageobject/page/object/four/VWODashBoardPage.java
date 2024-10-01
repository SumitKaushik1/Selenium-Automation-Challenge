package com.pageobject.page.object.four;

import com.pageobject.base.BasePageObjectFour;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import threadlocal.ThreadLocalWebDriver;

import java.time.Duration;

public class VWODashBoardPage  extends BasePageObjectFour  {
    private final By textVWOLoginPage=By.cssSelector("span[class='Fw(semi-bold) ng-binding']");

    public WebElement vWODashbord() throws KeyUrlNotFoundException {

       // WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds


      //  WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(textVWOLoginPage));
        this.driverWaiting(textVWOLoginPage, WaitStrategy.VISIBLE);
      //  ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", text);

       WebElement text = this.findElement(textVWOLoginPage);

        this.findByJavascriptCode( text);
        System.out.println(text.getText());

        // Iterate over the negative <span> elements and print their text content

        return text;
    }

}
