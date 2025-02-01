package com.screenshot;

import com.driver.two.BaseTestChromeTwo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtilsTwo {

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeTwo.getDriverChrome()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package

    }


}
