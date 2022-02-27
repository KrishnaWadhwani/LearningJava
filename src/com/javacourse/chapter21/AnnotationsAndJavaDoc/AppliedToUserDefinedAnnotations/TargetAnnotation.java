package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToUserDefinedAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Single Target
@Target(value = ElementType.METHOD)
@interface TestOverride {
    String methodName();
}
// Array of target
@Target(value = {ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface TestOverload {
    String methodOrConstructorName();
}


/*
* TYPE - Classes, Interfaces, Annotation Type Interfaces, Enum Declaration */

public class TargetAnnotation {
    @TestOverload(methodOrConstructorName = "TargetAnnotation")
    TargetAnnotation(){

    }
    @TestOverride(methodName = "main")
    public static void main(String[] args){

    }
}
