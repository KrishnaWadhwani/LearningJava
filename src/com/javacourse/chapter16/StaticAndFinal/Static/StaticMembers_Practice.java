package com.javacourse.chapter16.StaticAndFinal.Static;

class Test{
    static int x = 10;
    int y = 20;
    void show(){ // can access static and non-static members of class
        System.out.println("x: "+x); //static
        System.out.println("y: "+y); //non-static
    }
    static void display(){ // can only access static members of class
        System.out.println("x: "+x); //static
//      System.out.println(y); //non-static
    }
}
public class StaticMembers_Practice {
    public static void main(String[] args){
        Test test = new Test();
        System.out.println("Test");
        test.show();
        test.x = 30;
        test.y = 50;

        Test test2 = new Test();
        System.out.println("Test2");
        test2.show();
        test2.display();
    }
}
