package com.bast_test_control.two;

import com.basetest.two.BaseTestChromeTwo;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseTestControlChromeTwo {

    //only its child class can make its object

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeTwo(){

    }

   protected  void setUpControlChrome() throws Exception {
        BaseTestChromeTwo.setUpChrome();
    }


    protected void tearDownControlChrome(){
        BaseTestChromeTwo.tearDownChrome();
    }


   protected WebDriver controlGetDriver(){
        return BaseTestChromeTwo.getDriverChrome();
    }
}
