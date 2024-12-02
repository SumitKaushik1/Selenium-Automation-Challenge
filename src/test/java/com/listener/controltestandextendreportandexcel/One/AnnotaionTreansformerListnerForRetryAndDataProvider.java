package com.listener.controltestandextendreportandexcel.One;

import com.exceldataprovider.one.forread.ExcelOneDataProviderUtils;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotaionTreansformerListnerForRetryAndDataProvider implements IAnnotationTransformer {

    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setDataProvider("getData1");
        annotation.setDataProviderClass(ExcelOneDataProviderUtils.class);
        //annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
      //  annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);

    }

}
