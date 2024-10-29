package com.pagefactory.two;

public class DynamicWebUtils {

    private DynamicWebUtils(){

    }

    public static String getXpath(String xpath,String value){
        return  xpath.replace("%replaceable%",value);
    }
}
