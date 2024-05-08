package com.bast_test_control.four;

import com.basetest.Four.BaseTestChromeFour;
import com.basetest.Four.BaseTestEdgeFour;

public class BaseTestControlEdgeFour {


    //only the child can make the object of the parent
    //in package allowed
    protected BaseTestControlEdgeFour(){

    }

    protected void setUpControlEdge(){
        BaseTestEdgeFour.setUpEdge();
    }

    protected void tearDownControlEdge(){
        BaseTestEdgeFour.tearDown();
    }

}
