package com.bast_test_control.two;

import com.basetest.two.BaseTestChromeTwo;
import org.openqa.selenium.WebDriver;

public class BaseTestControlChromeTwo {

    //only its child class can make its object

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeTwo(){

    }

   protected  void setUpControlChrome(){
        BaseTestChromeTwo.setUpChrome();
    }


    protected void tearDownControlChrome(){
        BaseTestChromeTwo.tearDownChrome();
    }


   protected WebDriver controlGetDriver(){
        return BaseTestChromeTwo.getDriverChrome();
    }
}
