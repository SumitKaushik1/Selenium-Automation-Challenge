package com.bast_test_control.one;

import com.basetest.One.BaseTestChromeOne;

public class BaseTestControlChromeOne {

    //only the child class can make object of it

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected  BaseTestControlChromeOne(){


    }
    //we have the driver class which i donot want to extend or touch but controlling of ddriver
    // we make this class


    protected void setUpControlChrome(){
        BaseTestChromeOne.setUpChrome();
    }

    protected void tearDownControlChrome(){
        BaseTestChromeOne.tearDownChrome();

    }



}