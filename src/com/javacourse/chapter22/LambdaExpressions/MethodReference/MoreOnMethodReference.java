package com.javacourse.chapter22.LambdaExpressions.MethodReference;

@FunctionalInterface
interface JustAFunctionalInterface {
    int display(String s1, String s2);
}

public class MoreOnMethodReference {
    public static void main(String[] args){
        JustAFunctionalInterface justAFunctionalInterface = String::compareTo;
        System.out.println(justAFunctionalInterface.display("zello", "well"));
    }
}
