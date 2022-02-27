package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToCodeAnnotations;

class OldClass {
    public void display(){
        System.out.println("Hello");
    }

    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

public class DeprecatedAnnotation {
    public static void main(String[] args){
        OldClass oldClass = new OldClass();
        oldClass.show(); // After compilation this will show warning (do not run) (just compile)
    }
}
