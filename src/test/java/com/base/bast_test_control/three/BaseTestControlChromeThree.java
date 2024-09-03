package com.base.bast_test_control.three;

import com.base.basetest.three.BaseTestChromeThree;
import org.openqa.selenium.WebDriver;

public class BaseTestControlChromeThree {


    //its object only child can make

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeThree(){

    }

    protected void  setUpControlChrome() throws Exception {
        BaseTestChromeThree.setUpChrome();

    }
    protected void tearDownControlChrome(){
        BaseTestChromeThree.tearDownChrome();
    }

    public WebDriver controlGetDriver(){
       return  BaseTestChromeThree.getDriverChrome();

    }


}
