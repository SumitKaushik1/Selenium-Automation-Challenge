package com.listener.One;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// you have ot  add this listener in teh testng file also
public class AnnotationTransformerOne implements IAnnotationTransformer {

    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ){

      // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestListenerMethod1= new HashMap<>();
        //for priorty=2 test
        justToTestListenerMethod1.put("name","justToTestListenerMethod1");
        justToTestListenerMethod1.put("count","5");
        justToTestListenerMethod1.put("enabled",true);


        //for priorty=3 test
        Map<String,Object> justToTestListenerMethod2= new HashMap<>();
        justToTestListenerMethod2.put("name","justToTestListenerMethod2");
        justToTestListenerMethod2.put("count","2");
        justToTestListenerMethod2.put("enabled",true);

        List<Map<String,Object>> list=new ArrayList<>();
        list.add(justToTestListenerMethod1);
        list.add(justToTestListenerMethod2);



        for(int i=0;i<list.size();i++){
            if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("name")))){
                if(list.get(i).get("enabled").equals(false)){
                    annotation.setEnabled(false);
                }else{
                    annotation.setInvocationCount(Integer.parseInt((String)list.get(i).get("count")));
                }
            }


        }


    }
}
