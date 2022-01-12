package com.javacourse.chapter12.Inheritance;

class Super{
    public void display(){
        System.out.println("Super Class");
    }
}
class Sub extends Super{
    // redefined method Super class method will be shadowed
    @Override
    public void display(){
        System.out.println("Sub Class");
    }
}
class Sub1 extends Super{
    public void display(int x){
        System.out.println("Grand Sub Class");
    }
}
public class Overriding {
    public static void main(String[] args){
        Super sup = new Super();
        sup.display(); //display method of Super class will be called

        Sub sub = new Sub();
        sub.display(); //display method of Sub class will be called

        Sub1 sub1 = new Sub1();
        sub1.display(); //display method of Super class will be called cause method of Sub1 class is not overridden it takes some parameter

        // dynamic method dispatch
        Super sup1 = new Sub(); // Reference is of Super class object is of Sub class
        sup1.display(); // method of Sub class will be called
    }
}
