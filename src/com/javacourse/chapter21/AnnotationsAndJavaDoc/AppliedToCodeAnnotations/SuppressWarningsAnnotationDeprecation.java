package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToCodeAnnotations;

class VeryOldClass {
    public void display(){
        System.out.println("Hello");
    }
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

public class SuppressWarningsAnnotationDeprecation {
    @SuppressWarnings("deprecation") // Hide the warnings related to deprecation
    public static void main(String[] args){
        OldClass oc = new OldClass();
        oc.show();
    }
}
