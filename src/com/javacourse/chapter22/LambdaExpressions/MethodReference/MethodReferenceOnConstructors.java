package com.javacourse.chapter22.LambdaExpressions.MethodReference;

@FunctionalInterface
interface TestFunctionalInterface {
    void display(String s);
}

public class MethodReferenceOnConstructors {
    public MethodReferenceOnConstructors(String s){
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args){
        TestFunctionalInterface testFunctionalInterface = MethodReferenceOnConstructors::new; // here reference to a constructor is given
        testFunctionalInterface.display("krishna wadhwani");
    }
}
