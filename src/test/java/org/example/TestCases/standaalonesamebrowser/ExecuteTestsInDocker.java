package org.example.TestCases.standaalonesamebrowser;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ExecuteTestsInDocker {

     @Test
    public void localTest() throws MalformedURLException{


        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.get("https://google.con.in");
        System.out.println("Title is : "+driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void localTest1() throws MalformedURLException{


        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName("chrome");
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.get("https://google.con.in");
        System.out.println("Title is : "+driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();
    }



}
