package com.listener.controltestandextendreport.One;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.ArrayList;
import java.util.List;

public class MethodInterceptorzListenerControlTestOne implements IMethodInterceptor {

//it has the seperate listener tag in the test.ng file for find it

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context){
        List<IMethodInstance>result=new ArrayList<IMethodInstance>();
        result.add(methods.get(0));//only first @test case will run of one package
        result.add(methods.get(1));//only second @test case will run of one packeage
        result.add(methods.get(2));//only third @test case will run of one package
        result.add(methods.get(3));//only third @test case will run of one package
       // result.add(methods.get(4));//only fourth @test case will run of one package
      //  result.add(methods.get(5));//only fifth @test case will run of one package
       // result.add(methods.get(6));//only sixth @test case will run of one package
        //result.add(methods.get(7));//only seventh @test case will run of one package

        return result;
    }
}
