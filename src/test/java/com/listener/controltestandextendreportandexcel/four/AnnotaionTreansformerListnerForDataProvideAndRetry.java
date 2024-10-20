package com.listener.controltestandextendreportandexcel.four;

import com.utilslikeexcelpojodataprovider.dataproviderexcel.four.DataProviderFour;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotaionTreansformerListnerForDataProvideAndRetry implements IAnnotationTransformer {
    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setDataProvider("getData");
        annotation.setDataProviderClass(DataProviderFour.class);
        annotation.setRetryAnalyzer(ListenerRetryFour.class);

    }
}
