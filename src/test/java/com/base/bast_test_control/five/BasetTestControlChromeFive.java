package com.base.bast_test_control.five;

import com.base.basetest.Five.BaseTestChromeFive;
import org.openqa.selenium.WebDriver;

public class BasetTestControlChromeFive {
    // only can be use its object only can bm made in the child class and the in package
    protected BasetTestControlChromeFive(){

    }

    protected void setUpControlChrome() throws Exception {
        BaseTestChromeFive.setUpChrome();
    }

    protected void tearDownControlChrome(){
        BaseTestChromeFive.tearDown();
    }

    public WebDriver controlGetDriver(){
        return  BaseTestChromeFive.getDriver();
    }
}
