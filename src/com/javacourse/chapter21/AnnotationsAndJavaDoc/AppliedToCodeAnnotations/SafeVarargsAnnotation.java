package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToCodeAnnotations;

class My<T> {
    @SafeVarargs
    private void show(T... arg) { // Method must be a private or final method, if method is final then it can be anything public, protected, private, default("")
        for (T x : arg){
            System.out.println(x);
        }
    }
}

public class SafeVarargsAnnotation {
    public static void main(String[] args){

    }
}
