package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToUserDefinedAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) // where the user defined annotation will be available
    /*RetentionPolicy.CLASS Is The Default One*/

@interface RetentionAnnotationDemo {
    String name();
    String project();
    String date() default "today";
    String version() default "1.3";
}

public class RetentionAnnotation {
    public static void main(String[] args){

    }
}
