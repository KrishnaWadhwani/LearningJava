package com.javacourse.chapter17.Packages.AccessModifiers.MyPack2;

// different package non subclass

import com.javacourse.chapter17.Packages.AccessModifiers.MyPack1.Demo1;

public class Demo4 extends Demo1 {
    public void show(){
        // (a) is default - will give error
        // (b) is private - will give error
        // (c) is protected - will not give error
        // (d) is public - will not give error
        // System.out.println(a+b+c+d);
    }
}
