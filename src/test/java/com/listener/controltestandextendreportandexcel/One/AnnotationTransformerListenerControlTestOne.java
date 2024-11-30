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
        Map<String ,Object> loginWithCredentialsChrome= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        loginWithCredentialsChrome.put("testname","loginWithCredentialsChrome");
        loginWithCredentialsChrome.put("count","1");
        // i want ot disable that method
        loginWithCredentialsChrome.put("enable",true );
    /*    loginWithCredentialsChrome.put("username","sumit");
        loginWithCredentialsChrome.put("password","sumit@123");
        loginWithCredentialsChrome.put("fname","sumit");*/
        loginWithCredentialsChrome.put("retry",false);





        //bydefault all the test are enabled only
        // to store the testrecord of the test form excel file
        Map<String ,Object> totalMoneySpentCalculationChrome= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        totalMoneySpentCalculationChrome.put("testname","totalMoneySpentCalculationChrome");
        totalMoneySpentCalculationChrome.put("count","1");
        // i want ot disable that method
        totalMoneySpentCalculationChrome.put("enable",true );
        /*totalMoneySpentCalculationChrome.put("username","");
        totalMoneySpentCalculationChrome.put("password","");
        totalMoneySpentCalculationChrome.put("fname","sumit");*/
        totalMoneySpentCalculationChrome.put("retry",false);





        //bydefault all the test are enabled only
        // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestListenerMethod1Chrome= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        justToTestListenerMethod1Chrome.put("testname","justToTestListenerMethod1Chrome");
        justToTestListenerMethod1Chrome.put("count","1");
        // i want ot disable that method
        justToTestListenerMethod1Chrome.put("enable",true );
     /*   justToTestListenerMethod1Chrome.put("username","");
        justToTestListenerMethod1Chrome.put("password","");
        justToTestListenerMethod1Chrome.put("fname","sumit");*/
        justToTestListenerMethod1Chrome.put("retry",false);








        //bydefault all the test are enabled only
        //this  test i want enable ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        //for priorty=3 test
        Map<String,Object> justToTestListenerMethod2Chrome= new HashMap<>();
        justToTestListenerMethod2Chrome.put("testname","justToTestListenerMethod2Chrome");
        justToTestListenerMethod2Chrome.put("count","1");
        // jsut to pass the forloop bydefalt all methdo are enabled
        //justToTestListenerMethod2Chrome.put("enabled",true);
        justToTestListenerMethod2Chrome.put("enable",true);
      /*  justToTestListenerMethod2Chrome.put("username","");
        justToTestListenerMethod2Chrome.put("password","");
        justToTestListenerMethod2Chrome.put("fname","sumit");*/
        justToTestListenerMethod2Chrome.put("retry",false);







        //bydefault all the test are enabled only
        //this  test i want enable ie for the ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestRetryListenerOnFailMethod3Chrome= new HashMap<>();
        //for priorty=3 test
        justToTestRetryListenerOnFailMethod3Chrome.put("name"," justToTestRetryListenerOnFailMethod3Chrome");
        justToTestRetryListenerOnFailMethod3Chrome.put("count","1");
        //bydefault all mehdo are enabled just ot pass for loop
        justToTestRetryListenerOnFailMethod3Chrome.put("enable",true);
        /*justToTestRetryListenerOnFailMethod3Chrome.put("username","");
        justToTestRetryListenerOnFailMethod3Chrome.put("password","");
        justToTestRetryListenerOnFailMethod3Chrome.put("fname","sumit");*/
        justToTestRetryListenerOnFailMethod3Chrome.put("retry",false);






        /// note all these all methods must be in teh excel file  have to be


        //bydefault all the test are enabled only
        // to store the testrecord of the test form excel file
        Map<String ,Object> loginWithCredentialsEdge= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        loginWithCredentialsEdge.put("testname","loginWithCredentialsEdge");
        loginWithCredentialsEdge.put("count","1");
        // i want ot disable that method
       loginWithCredentialsEdge.put("enable",true );
   /*     loginWithCredentialsEdge.put("username","sumit");
        loginWithCredentialsEdge.put("password","sumit@123");
        loginWithCredentialsEdge.put("fname","sumit");*/
        loginWithCredentialsEdge.put("retry",false);





        //bydefault all the test are enabled only
        // to store the testrecord of the test form excel file
        Map<String ,Object> totalMoneySpentCalculationEdge= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        totalMoneySpentCalculationEdge.put("testname","totalMoneySpentCalculationEdge");
        totalMoneySpentCalculationEdge.put("count","1");
        // i want ot disable that method
        totalMoneySpentCalculationEdge.put("enable",true );
     /*   totalMoneySpentCalculationEdge.put("username","");
        totalMoneySpentCalculationEdge.put("password","");
        totalMoneySpentCalculationEdge.put("fname","sumit");*/
        totalMoneySpentCalculationEdge.put("retry",false);





        //bydefault all the test are enabled only
        // to store the testrecord of the test form excel file
        Map<String ,Object>  justToTestListenerMethod1Edge= new HashMap<>();
        //for priorty=2 test
        //this  test i want enable ,run 5 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        justToTestListenerMethod1Edge.put("testname"," justToTestListenerMethod1Edge");
        justToTestListenerMethod1Edge.put("count","1");
        // i want ot disable that method
        justToTestListenerMethod1Edge.put("enable",true );
 /*       justToTestListenerMethod1Edge.put("username","");
        justToTestListenerMethod1Edge.put("password","");
        justToTestListenerMethod1Edge.put("fname","sumit");*/
        justToTestListenerMethod1Edge.put("retry",false);








        //bydefault all the test are enabled only
        //this  test i want enable ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        //for priorty=3 test
        Map<String,Object> justToTestListenerMethod2Edge= new HashMap<>();
        justToTestListenerMethod2Edge.put("testname","justToTestListenerMethod2Edge");
        justToTestListenerMethod2Edge.put("count","1");
        // jsut to pass the forloop bydefalt all methdo are enabled
        //justToTestListenerMethod2Chrome.put("enabled",true);
        justToTestListenerMethod2Edge.put("enable",true);
  /*      justToTestListenerMethod2Edge.put("username","");
        justToTestListenerMethod2Edge.put("password","");
        justToTestListenerMethod2Edge.put("fname","sumit");*/
        justToTestListenerMethod2Edge.put("retry",false);







        //bydefault all the test are enabled only
        //this  test i want enable ie for the ,run 2 times if  times runnign then i dnot wwan that when it fails
        // it run 1 more time already running 5 times i can see its nature
        // to store the testrecord of the test form excel file
        Map<String ,Object> justToTestRetryListenerOnFailMethod3Edge= new HashMap<>();
        //for priorty=3 test
        justToTestRetryListenerOnFailMethod3Edge.put("name","justToTestRetryListenerOnFailMethod3Edge");
        justToTestRetryListenerOnFailMethod3Edge.put("count","1");
        //bydefault all mehdo are enabled just ot pass for loop
        justToTestRetryListenerOnFailMethod3Edge.put("enable ",true);
      /*  justToTestRetryListenerOnFailMethod3Edge.put("username","");
        justToTestRetryListenerOnFailMethod3Edge.put("password","");
        justToTestRetryListenerOnFailMethod3Edge.put("fname","sumit");*/
        justToTestRetryListenerOnFailMethod3Edge.put("retry",false);


















        List<Map<String,Object>> list=new ArrayList<>();
        list.add(loginWithCredentialsChrome);
        list.add( totalMoneySpentCalculationChrome);
        list.add(justToTestListenerMethod1Chrome);
        list.add(justToTestListenerMethod2Chrome);
        list.add(justToTestRetryListenerOnFailMethod3Chrome);

        list.add(loginWithCredentialsEdge);
        list.add(totalMoneySpentCalculationEdge);
        list.add(justToTestListenerMethod1Edge);
        list.add(justToTestListenerMethod2Edge);
        list.add(justToTestRetryListenerOnFailMethod3Edge);




        //what happens the first method is executed then this listner is  called that methtod is matched  to all the
        // list values of i made above and further operation is performed on that method by that listener

        //waht we are doing that method i want  some method should be disabled in this case only 1 method and one method i wnat to retry
        //once if i fails then if again fails then it will ignore that meht
        // disabled or retry 1 time if fails or i want other method to  run according to their count



        for(int i=0;i<list.size();i++){


            if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("testname")))){
                System.out.println("inside "+testMethod.getName());
                System.out.println("enable"+list.get(i).get("enable"));


                //bydefautl all are enabled so we have to set method to disable
                         if(list.get(i).get("enable").equals(false)){
                             System.out.println("inside enable "+testMethod.getName());
                            annotation.setEnabled(false);
                        }
                        else{
                             System.out.println("inside count "+testMethod.getName());
                            annotation.setInvocationCount(Integer.parseInt((String)list.get(i).get("count")));

                           // annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
                        }
            }

           /* if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("justToTestRetryListenerOnFailMethod3"))))
                    annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);*/
           // System.out.println(testMethod.getName());
        }



        for(int i=0;i<list.size();i++){


            if(testMethod.getName().equalsIgnoreCase(String.valueOf(list.get(i).get("testname")))) {
                if(list.get(i).get("retry").equals(true)){
                    System.out.println("inside retry "+testMethod.getName());
                    annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
                }



            }
        }
    }
}
