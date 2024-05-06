package com.basttestcontrol.basetestcontrolone;


import com.basetest.One.DriverTestEdgeOne;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//we have the ststic driver class for edge but just for controlling we are making this class
public class BaseTestEdge {

   // only the child class allowed to make object
    protected BaseTestEdge(){

    }


    public void  setUpEdge(){
        DriverTestEdgeOne.setupEdge();
    }

    public void tearDown(){
        DriverTestEdgeOne.tearDownEdge();
    }
}
