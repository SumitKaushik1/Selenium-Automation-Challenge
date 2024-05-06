package com.basttestcontrol.basetestcontrolone;

import com.basetest.One.DriverChromeOne;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestChrome {

    //only the child class can make object of it
    protected BaseTestChrome(){

    }


    //we have the driver class which i donot want to extend or touch but controlling of ddriver
    // we make this calss


    public void setUpDriver(){
        DriverChromeOne.setUpChrome();
    }

    public void tearDown(){
        DriverChromeOne.tearDown();

    }



}
