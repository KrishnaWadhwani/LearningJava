package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToUserDefinedAnnotations;

import java.lang.annotation.Documented;

@Documented
@interface DocumentedAnnotationDemo {
    String name();
}
public class DocumentedAnnotation {
    @DocumentedAnnotationDemo(name = "Krishna Wadhwani")
    public static void main(String[] args){

    }
}
