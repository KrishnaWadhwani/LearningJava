package com.javacourse.chapter12.Inheritance.Polymorphism_Using_Overloading_And_Overriding;

// Runtime Polymorphism

class Super{
    public void display(){
        System.out.println("Super Display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub Display");
    }
}
public class Polymorphism_Using_Overriding {
    public static void main(String[] args){
        Super s = new Super();
        s.display();

        Sub sub = new Sub();
        sub.display();

        Super s1 = new Sub(); //dynamic method dispatch, object will be created at runtime
        s1.display(); // will call display of Sub, compiler cannot decide which method to call because object will be created at runtime
    }
}
