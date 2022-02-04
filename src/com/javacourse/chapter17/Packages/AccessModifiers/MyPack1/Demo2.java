package com.javacourse.chapter17.Packages.AccessModifiers.MyPack1;

// non subclass of same package

public class Demo2 {
    public static void main(String[] args){
        Demo1 demo1 = new Demo1();
        // (a) is default - will not give error
        // (b) is private - will give error
        // (c) is protected - will not give error
        // (d) is public - will not give error
        // System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);
    }
}
