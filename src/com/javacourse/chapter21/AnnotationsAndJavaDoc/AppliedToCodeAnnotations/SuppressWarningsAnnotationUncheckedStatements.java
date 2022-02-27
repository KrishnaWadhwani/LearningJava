package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToCodeAnnotations;

import java.util.List;

public class SuppressWarningsAnnotationUncheckedStatements {
    static List l; // Without initializing List we are using it in the main method
    @SuppressWarnings("unchecked") // to suppress the warning we use @SuppressWarnings("unchecked")
    public static void main(String[] args){
        l.add(10);
    }
}
