package com.cutomannotation.two;

import enumconstants.CategoryTypeConstants;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
public @interface TwoFrameworkAnnotation {

    //default properties of these empty array
public String[]author() default {} ;
public CategoryTypeConstants[] category() default  {};

}
