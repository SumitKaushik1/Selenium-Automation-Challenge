package com.bast_test_control.four;

import com.basetest.Four.BaseTestChromeFour;
import com.basetest.Four.BaseTestEdgeFour;

import java.io.IOException;

public class BaseTestControlEdgeFour {


    //only the child can make the object of the parent
    //in package allowed
    protected BaseTestControlEdgeFour(){

    }

    protected void setUpControlEdge() throws Exception {
        BaseTestEdgeFour.setUpEdge();
    }

    protected void tearDownControlEdge(){
        BaseTestEdgeFour.tearDown();
    }

}
