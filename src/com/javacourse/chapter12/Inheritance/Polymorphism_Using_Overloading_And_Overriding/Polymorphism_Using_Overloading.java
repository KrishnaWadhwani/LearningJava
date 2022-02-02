package com.javacourse.chapter12.Inheritance.Polymorphism_Using_Overloading_And_Overriding;

// This is also known as compile time polymorphism

class Test{
    //Finding Max Of 2 Numbers
    public int max(int a, int b){
        return a>b?a:b;
    }
    //Finding Max Of 3 Numbers
    public int max(int a, int b, int c){ // Overloaded Method
        if (a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
             return c;
        }
    }
}
public class Polymorphism_Using_Overloading {
    public static void main(String[] args){
        Test test = new Test();
        // here number of argument and type of argument decide which method to call
        // name is same but actions are different
        test.max(10,5);
        test.max(10,5, 15);
    }
}
