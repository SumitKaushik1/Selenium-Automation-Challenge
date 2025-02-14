package org.example.TestCases.totestonlythread;


import com.driver.Five.twobrowser.BasetTestControlFive;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DiffernetBrowserNodes extends BasetTestControlFive {


    @Test(dataProvider="getData")
    public void localHost(String browser) throws Exception {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setBrowserName(browser);
       // WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

        this.setUpControl(browser);


        WebDriver driver=   this.controlGetDriver();

        driver.get("https://www.google.co.in");
        System.out.println("Title is :"+driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();

    }

    @DataProvider(parallel=true)
    public Object[][] getData(){
        //return new Object[][]{{"chrome"},{"chrome"},{"edge"},{"edge"}};
        return new Object[][]{{"chrome"},{"chrome"},{"firefox"},{"firefox"},{"edge"},{"edge"}};
    }






}
