package com.javacourse.chapter15.InnerClasses.StaticInnerClasses;

class Outer{
    static int x = 10;
    int y = 20;
    static class Inner{
        int x;
        public void display(){
            System.out.println("Displaying...");
            System.out.println(x);
//          System.out.println(y); // static inner classes can only access static members of outer classes
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
