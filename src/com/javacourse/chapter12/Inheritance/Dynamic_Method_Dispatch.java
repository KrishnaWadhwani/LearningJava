package com.javacourse.chapter12.Inheritance;

class SuperClass{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}
class SubClass extends SuperClass{
    @Override
    public void meth2(){
        System.out.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("Sub Meth3");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args){
        SuperClass superClass = new SuperClass();
        superClass.meth1();
        superClass.meth2();

        SubClass subClass = new SubClass();
        subClass.meth1();
        subClass.meth2();
        subClass.meth3();

        /* Dynamic Method Dispatch */

        System.out.println("Dynamic Method Dispatch");

        SuperClass superClass1 = new SubClass();
        superClass1.meth1();
        superClass1.meth2(); //Overridden Method Will Be Called
    }
}