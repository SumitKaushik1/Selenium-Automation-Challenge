package com.cutomannotation.one;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


//@inteface is the keyword used to make the annoation
//OneFrameworkAnnotation
@Retention(RUNTIME)
@Target(METHOD)
public @interface OneFrameworkAnnotation {


    // it looks like method  bz of syntax but it is not mehtod instead these are the properties or the elements
    // of annoaion
    //deafult "" meaans default value of author elment is "";

    public String[] author() default "";
    public String[] category() default "";
}
