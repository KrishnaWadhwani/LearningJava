package com.javacourse.chapter22.LambdaExpressions;

// if an interface is having only one method then the interface is called functional interface
@FunctionalInterface
interface MyLambda {
    // by default methods of interfaces are public and abstract
    void display();
}
// why to use this in functional interface?? just use lambda expressions

/*
class My implements MyLambda {
    @Override
    public void display(){
        System.out.println("Hello World");
    }
}
*/

public class LambdaExpressions {
    public static void main(String[] args){
        // this is a lambda expression :-)
        MyLambda m = () -> { System.out.println("Hello World"); };
        m.display();
    }
}
