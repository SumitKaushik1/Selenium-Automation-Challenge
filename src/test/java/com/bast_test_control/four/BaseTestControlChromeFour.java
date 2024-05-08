package com.bast_test_control.four;

import com.basetest.Four.BaseTestChromeFour;

public class BaseTestControlChromeFour {


    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeFour(){

    }

    //withing packeag adn its chile class acn use this
    protected void setUpControlChrome(){
        BaseTestChromeFour.setUpChrome();
    }


    //used only in the child class only
    protected void tearDownControlChrome(){
        BaseTestChromeFour.tearDown();
    }
}
