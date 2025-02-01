package com.screenshot;

import com.driver.Five.onebrowser.BaseTestChromeFive;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtilsFive {

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeFive.getDriver()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package
    }
}
