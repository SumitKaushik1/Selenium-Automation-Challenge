package com.listener.controltestandextendreportandexcel.four;


import com.exceldataprovider.four.forread.ExcelFourDataProviderUtils;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotaionTreansformerListnerForRetryAndDataProvider implements IAnnotationTransformer {
    @Override
    public void transform (ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setDataProviderClass(ExcelFourDataProviderUtils.class);
        annotation.setDataProvider("getData");
        annotation.setRetryAnalyzer(ListenerRetryFour.class);

    }
}
