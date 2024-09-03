package com.base.bast_test_control.two;

import com.base.basetest.two.BaseTestChromeTwo;
import org.openqa.selenium.WebDriver;

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


   public WebDriver controlGetDriver(){
        return BaseTestChromeTwo.getDriverChrome();
    }
}
