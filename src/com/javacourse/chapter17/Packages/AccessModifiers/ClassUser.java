package com.javacourse.chapter17.Packages.AccessModifiers;

// for definition please check notes // of date 3/2/22

// different package non subclass

import com.javacourse.chapter17.Packages.AccessModifiers.MyPack1.Demo1;

public class ClassUser {
    public static void main(String[] args){
        Demo1 practice_accessModifiers = new Demo1();
        practice_accessModifiers.display();
        // (a) is default - will give error
        // (b) is private - will give error
        // (c) is protected - will give error
        // (d) is public - will not give error
        // System.out.println(practice_accessModifiers.a + practice_accessModifiers.b + practice_accessModifiers.c + practice_accessModifiers.d);
    }
}
