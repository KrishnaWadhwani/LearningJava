package com.javacourse.chapter22.LambdaExpressions;

interface TestLambda {
    void display();
}

class Demo {
    int temp = 10; // need not to-be final or effectively final

    public void method1(){
        int count = 0; // this should be final or effectively final
        TestLambda testLambda = ()->{
            System.out.println("Hello World");
            System.out.println("Bye"+count); // we cannot modify the value of local variable inside lambda expression
            System.out.println("Bye"+(++temp)); // we can modify the value of instance variable
        };
        testLambda.display();
    }
}

public class CaptureInLambdaExpression {
    public static void main(String[] args){
        Demo demo = new Demo();
        demo.method1();
    }
}
