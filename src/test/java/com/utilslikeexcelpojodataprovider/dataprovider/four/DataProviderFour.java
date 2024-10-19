package com.utilslikeexcelpojodataprovider.dataprovider.four;

import com.utilslikeexcelpojodataprovider.excelpractice.four.forread.ExcelFileToReadTestControlUseraAndPasslByListenerVwo;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataProviderFour {

private static List<Map<String,String>> list;

   public DataProviderFour(){
       list=new ArrayList<>();
    }


    @DataProvider
        public static   Object[] getData(Method m){
      //public static void main(String args[]){
       String testname=m.getName();
        //  list=new ArrayList<>();
       if(list.isEmpty()){
          list= ExcelFileToReadTestControlUseraAndPasslByListenerVwo.getTestDetails("vwo login user and password");
       }

      //    System.out.println(Arrays.toString(list.toArray()));
       List<Map<String,String>> smalllist=new  ArrayList<>();
       for(int i=0;i<list.size();i++){
           if(list.get(i).get("TestName").equalsIgnoreCase(testname)){
               if(list.get(i).get("Execute").equalsIgnoreCase("yes")){
                   smalllist.add(list.get(i));
               }
           }
       }

            return smalllist.toArray();
    }




}
