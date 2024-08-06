package com.bast_test_control.one;


import com.basetest.One.BaseTestEdgeOne;

import java.io.IOException;

//we have the ststic driver class for edge but just for controlling we are making this class
public class BaseTestControlEdgeOne {

   // only the child class allowed to make object

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlEdgeOne(){

    }


    protected void  setUpControlEdge() throws Exception {
        BaseTestEdgeOne.setUpEdge();
    }

    protected void tearDownControlEdge(){
        BaseTestEdgeOne.tearDownEdge();
    }
}
