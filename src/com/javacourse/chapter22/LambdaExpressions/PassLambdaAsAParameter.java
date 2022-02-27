package com.javacourse.chapter22.LambdaExpressions;

interface JustALambda {
    void display();
}

class UseLambda {
    public void callLambda(JustALambda jal){
        jal.display();
    }
}

class DemoClass {
    public void method(){
        UseLambda useLambda = new UseLambda();
        // here we are passing method as an object of JustALambda
        useLambda.callLambda(()->{
            System.out.println("Hello, World!");
        });
    }
}

public class PassLambdaAsAParameter {
    public static void main(String[] args){
        DemoClass demoClass = new DemoClass();
        demoClass.method();
    }
}
