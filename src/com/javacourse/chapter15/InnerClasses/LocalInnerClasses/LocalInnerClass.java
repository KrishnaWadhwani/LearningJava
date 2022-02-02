package com.javacourse.chapter15.InnerClasses.LocalInnerClasses;

class Outer{
    public void display(){
        class Inner{
            public void show(){
                System.out.println("Hello");
            }
        }
        new Inner().show();
    }
}
public class LocalInnerClass{
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.display();
    }
}