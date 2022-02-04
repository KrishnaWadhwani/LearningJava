package com.javacourse.chapter17.Packages.AccessModifiers.MyPack1;

// same package subclass

public class Demo3 extends Demo1{
    public void show(){
        // (a) is default - will not give error
        // (b) is private - will give error
        // (c) is protected - will not give error
        // (d) is public - will not give error

        //System.out.println(a+b+c+d);
    }
    public static void main(String[] args){

    }
}
