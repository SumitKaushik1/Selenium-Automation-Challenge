package com.listener.controltestandextendreportandexcel.One;

import com.exceldataprovider.one.forread.ExcelOneDataProviderUtils;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class MethodInterceptorListenerControlTest2One implements IMethodInterceptor {

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance>methods, ITestContext context) {
        try {
            List<Map<String,String>> list= ExcelOneDataProviderUtils.getTestDetails();
           // List<Map<String,String>> list= null;

            List<IMethodInstance> result= new ArrayList<>();
            List<IMethodInstance> notInresult= new ArrayList<>();

            System.out.println("in listener"+ Arrays.toString(list.toArray()));

            for(int i=0;i<methods.size();i++){
                System.out.println("methods->"+methods.get(i).getMethod().getMethodName());

            }

            for(int j=0;j<list.size();j++){
                System.out.println("list->"+list.get(j).get("TestName"));

            }


         /*   for(int i=0;i<methods.size();i++){

                for(int j=0;j<list.size();j++){
                    if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestName"))){
                        System.out.println("matched->"+list.get(j).get("TestName"));
                    }
                }
            }*/


            for(int i=0;i<methods.size();i++){

                for(int j=0;j<list.size();j++){
                    if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestName"))){
                           System.out.println("matched->"+list.get(j).get("TestName"));
                            methods.get(i).getMethod().setDescription(list.get(j).get("TestDescription"));
                            methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("count")));
                            methods.get(i).getMethod().setPriority(Integer.parseInt(list.get(j).get("Priority")));

                            if("yes".equalsIgnoreCase(list.get(j).get("Execute"))){
                                System.out.println("Executed Yes->"+list.get(j).get("TestName"));
                                result.add(methods.get(i));
                            }

                    }
                }
            }

         /*   for(IMethodInstance r: notInresult){
                result.add(r);

            }*/

     /*     for(int i=0;i<methods.size();i++){

              for(int j=0;j<list.size();j++){
                    if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestName"))){
                        methods.get(i).getMethod().setDescription(list.get(j).get("TestDescripton"));
                        methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("count")));
                        methods.get(i).getMethod().setPriority(Integer.parseInt(list.get(j).get("Priority")));
                        result.add(methods.get(i));
                    }
                }
           }

*/

             // return null;
            return result;
      } catch (IOException e) {
        throw new RuntimeException(e);
       }


    }
}

