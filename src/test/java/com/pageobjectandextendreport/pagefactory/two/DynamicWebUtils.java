package com.pageobjectandextendreport.pagefactory.two;

public class DynamicWebUtils {

    private DynamicWebUtils(){

    }

  /*  public static String getXpath(String xpath,String value){
        return  xpath.replace("%replaceable%",value);
    }*/

    public static String getXpath(String xpath,String value){
        return  String.format(xpath,value);//at the place of %s value is placed there
    }
}
