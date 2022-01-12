package com.javacourse.chapter13.AbstractClasses;

abstract class Super{
    public Super()
    {
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Meth1 Of Super");
    }
    abstract public void meth2();
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Meth2 Of Sub");
    }
}
public class PractisingAbstractClass {
    public static void main(String[] args){
        Sub s = new Sub();
        s.meth1();
        s.meth2();

        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
    }
}
