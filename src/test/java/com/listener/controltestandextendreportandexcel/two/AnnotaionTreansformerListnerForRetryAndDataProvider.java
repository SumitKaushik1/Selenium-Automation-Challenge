package com.listener.controltestandextendreportandexcel.two;

import com.exceldataprovider.four.forread.ExcelFourDataProviderUtils;
import com.exceldataprovider.two.read.ExcelTwoDataProviderUtils;
import com.listener.controltestandextendreportandexcel.four.ListenerRetryFour;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotaionTreansformerListnerForRetryAndDataProvider implements IAnnotationTransformer {



    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setDataProvider("getData");
        annotation.setDataProviderClass(ExcelTwoDataProviderUtils.class);
        //annotation.setRetryAnalyzer(RetryListenerForFailTestOne.class);
        annotation.setRetryAnalyzer(ListenerRetryTwo.class);

    }
}
