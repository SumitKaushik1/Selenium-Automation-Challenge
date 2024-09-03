package com.base.bast_test_control.four;

import com.base.basetest.Four.BaseTestChromeFour;

public class BaseTestControlChromeFour {


    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeFour(){

    }

    //withing packeag adn its chile class acn use this
    protected void setUpControlChrome() throws Exception {
        BaseTestChromeFour.setUpChrome();
    }


    //used only in the child class only
    protected void tearDownControlChrome(){
        BaseTestChromeFour.tearDown();
    }
}
