package com.bast_test_control.three;

import com.basetest.three.BaseTestChromerThree;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class BaseTestControlChromeThree {


    //its object only child can make

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeThree(){

    }

    protected void  setUpControlChrome() throws Exception {
        BaseTestChromerThree.setUpChrome();

    }
    protected void tearDownControlChrome(){
        BaseTestChromerThree.tearDownChrome();
    }

    protected WebDriver controlGetDriver(){
       return  BaseTestChromerThree.getDriverChrome();

    }


}
