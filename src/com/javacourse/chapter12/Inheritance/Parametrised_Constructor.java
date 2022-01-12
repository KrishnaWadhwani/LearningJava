package com.javacourse.chapter12.Inheritance;

class Parent1{
    public Parent1(){
        System.out.println("Non Parameterised Constructor Of Parent");
    }
    public Parent1(int x){
        System.out.println("Parameterised Constructor Of Parent: "+x);
    }
}
class Child1 extends Parent1{
    public Child1(){
        System.out.println("Non Parameterised Constructor Of Child");
    }
    public Child1(int x){
        System.out.println("Parameterised Constructor Of Child");
    }
    public Child1(int x, int y){
        super(x); // will call the constructor of parent class with param
        System.out.println("2 Params Of Child: "+y);
    }
}
public class Parametrised_Constructor {
    public static void main(String[] args){
        Child1 child1 = new Child1(); // this will call non parameterized constructors of parent then child class
        Child1 child2 = new Child1(5); // this will call non parameterized constructors of parent then child class
        Child1 child3 = new Child1(10, 20); // this will call non parameterized constructors of parent then child class
    }
}
