package com.javacourse.chapter22.LambdaExpressions.MethodReference;

@FunctionalInterface
interface LambdaExpression {
    void display(String str);
}

public class MethodReference {
    // non-static reverse method
    public void nonStaticReverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void staticReverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args){
        // this is method reference :-)
        // we can use method reference with only functional interface

        // Syntax for static methods
        // [ClassName::static-method]
        LambdaExpression lambdaExpression = MethodReference::staticReverse;

        lambdaExpression.display("Hello,");
        // Syntax for non-static methods
        // [ObjectName::non-static method]
        MethodReference methodReference = new MethodReference();
        LambdaExpression lambdaExpression1 = methodReference::nonStaticReverse; // now display had become reverse

        lambdaExpression1.display(" World!");
    }
}
