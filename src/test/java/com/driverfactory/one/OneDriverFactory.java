package com.driverfactory.one;

import enumconstants.MethodPropertiesConstant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.auth.MalformedChallengeException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import propertesfilesread.MethodPropertiesPropertyFileRead;

import java.net.MalformedURLException;
import java.net.URL;

public class OneDriverFactory {

    private OneDriverFactory(){

    }

    public static WebDriver getDriver(String browser) throws MalformedURLException {

        WebDriver driver=null;

        String runmode= MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RUNMODE);
        System.out.println("runmode:"+runmode);
        if(browser.equalsIgnoreCase("chrome")){
             if(runmode.equalsIgnoreCase("remote")){
                 System.out.println("inside remote ");
                 DesiredCapabilities  cap=new DesiredCapabilities();
                 cap.setBrowserName(Browser.CHROME.browserName());
                 driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
                // driver=new RemoteWebDriver(new URL("https://192.168.0.8:4444/wd/hub"),cap);

             }
             else {
                 System.out.println("inside local ");
                 WebDriverManager.chromedriver().clearDriverCache().setup();
                 driver=new ChromeDriver();
             }

        }
        else if(browser.equalsIgnoreCase("edge")){
            if(runmode.equalsIgnoreCase("remote")){
                System.out.println("inside remote ");
                DesiredCapabilities cap= new DesiredCapabilities();
                cap.setBrowserName(Browser.EDGE.browserName());
                driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
               // driver=new RemoteWebDriver(new URL("https://192.168.0.8:4444/wd/hub"),cap);


            }else {
                System.out.println("inside local ");
                WebDriverManager.edgedriver().clearDriverCache().setup();
                driver=new EdgeDriver();
            }

        }

        return driver;

    }


}
