package com.javacourse.chapter21.AnnotationsAndJavaDoc;

import java.lang.annotation.Annotation; // Redundant
@TestAnnotation // Annotations can be used at interface level
@interface TestAnnotation {

}

@TestAnnotation // Annotations can be used at class level
public class AboutAnnotations {

    @TestAnnotation // Annotations can be used at Instance Variable Level
    int data;

    @TestAnnotation // Annotations can be used at method level
    public static void main(@TestAnnotation String[] args /* Annotations can be used at Parameter level also */ ){
        @TestAnnotation // Annotations can be used at local variable level
        int x;
    }
}
