package com.javacourse.chapter12.Inheritance;

class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Children Constructor");
    }
}
class GrandChild extends Child {
    public GrandChild(){
        System.out.println("Grand Child Constructor");
    }
}
public class Constructors_In_Inheritance {
    public static void main(String[] args){
        GrandChild grandChild = new GrandChild();
    }
}
