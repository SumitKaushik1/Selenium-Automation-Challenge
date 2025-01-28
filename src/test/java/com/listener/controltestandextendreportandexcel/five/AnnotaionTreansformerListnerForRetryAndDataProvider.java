package com.listener.controltestandextendreportandexcel.five;


import com.exceldataprovider.five.forread.ExcelFiveDataProviderUtils;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotaionTreansformerListnerForRetryAndDataProvider implements IAnnotationTransformer {
    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setDataProviderClass(ExcelFiveDataProviderUtils.class);
        annotation.setDataProvider("getData1");
        annotation.setRetryAnalyzer(ListenerRetryFive.class);

    }
}
