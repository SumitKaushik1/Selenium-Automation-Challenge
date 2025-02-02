package com.screenshot;

import com.driver.Five.onebrowser.BasetTestControlChromeFive;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtilsFive {

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot)  BasetTestControlChromeFive.controlgetDriver()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package
    }
}
