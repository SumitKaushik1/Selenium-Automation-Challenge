package com.listener.controltestandextendreportandexcel.One;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// you have ot  add this listener in teh testng file also
public class AnnotationTransformerListenerControlTestOne implements IAnnotationTransformer {

    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ){


        /// note all these all methods must be in teh excel file  have to be



        //bydefault all the test are enabled only
      // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestListenerMethod1Chrome= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        justToTestListenerMethod1Chrome.put("name","justToTestListenerMethod1Chrome");
        justToTestListenerMethod1Chrome.put("count","5");
        // i want ot disable that method
        justToTestListenerMethod1Chrome.put("enabled",false);
        justToTestListenerMethod1Chrome.put("retry",false);




        //bydefault all the test are enabled only
        //this  test i want enable ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        //for priorty=3 test
        Map<String,Object> justToTestListenerMethod2Chrome= new HashMap<>();
        justToTestListenerMethod2Chrome.put("name","justToTestListenerMethod2Chrome");
        justToTestListenerMethod2Chrome.put("count","5");
        // jsut to pass the forloop bydefalt all methdo are enabled
        justToTestListenerMethod2Chrome.put("enabled",true);
        justToTestListenerMethod2Chrome.put("retry",false);






        //bydefault all the test are enabled only
        //this  test i want enable ie for the ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestRetryListenerOnFailMethod3= new HashMap<>();
        //for priorty=3 test
        justToTestRetryListenerOnFailMethod3.put("name","justToTestRetryListenerOnFailMethod3Chrome");
        justToTestRetryListenerOnFailMethod3.put("count","1");
        //bydefault all mehdo are enabled just ot pass for loop
        justToTestRetryListenerOnFailMethod3.put("enabled",true);
        justToTestRetryListenerOnFailMethod3.put("retry",true);




        List<Map<String,Object>> list=new ArrayList<>();
        list.add(justToTestListenerMethod1Chrome);
        list.add(justToTestListenerMethod2Chrome);
        list.add(justToTestRetryListenerOnFailMethod3);




        //what happens the first method is executed then this listner is  called that methtod is matched  to all the
        // list values of i made above and further operation is performed on that method by that listener

        //waht we are doing that method i want  some method should be disabled in this case only 1 method and one method i wnat to retry
        //once if i fails then if again fails then it will ignore that meht
        // disabled or retry 1 time if fails or i want other method to  run according to their count



        for(int i=0;i<list.size();i++){


            if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("name")))){
              //  System.out.println("inside "+testMethod.getName());
                        //System.out.println(list.get(i).get("enabled"));

                //bydefautl all are enabled so we have to set method to disable
                         if(list.get(i).get("enabled").equals(false)){
                             System.out.println("inside enable "+testMethod.getName());
                            annotation.setEnabled(false);
                        }
                        else{
                             System.out.println("insdie count "+testMethod.getName()+" "+list.get(i).get("count"));
                            annotation.setInvocationCount(Integer.parseInt((String)list.get(i).get("count")));
                           // annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
                        }
            }

           /* if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("justToTestRetryListenerOnFailMethod3"))))
                    annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);*/
           // System.out.println(testMethod.getName());
        }



        for(int i=0;i<list.size();i++){


            if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("name")))) {
                if(list.get(i).get("retry").equals(true)){
                    System.out.println("inside retry "+testMethod.getName());
                    annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
                }



            }
        }
    }
}
