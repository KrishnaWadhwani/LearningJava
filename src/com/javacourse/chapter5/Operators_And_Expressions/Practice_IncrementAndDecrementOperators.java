package com.javacourse.chapter5.Operators_And_Expressions;

public class Practice_IncrementAndDecrementOperators {
    public static void main(String[] args) {
        /*int x = 5, y, y1;
        y1 = x++;
        y = ++x;
        System.out.println(x);
        System.out.println("y: "+y);
        System.out.println("y1: "+y1);
        *//*-------------------*//*
        ++x;
        System.out.println(x);*/
        //int x = 5, y = 4, z;
        /*z=2*x++ + 3 * ++y;
        System.out.println(z);*/
        /*z=2*x++ + 3 * ++x;
        System.out.println(z);*/
        /*float a = 3.5F;
        a++;*/
        /*char a = 'A';
        a++;*/
        byte b = 5;
        b++;
        // b = b + 1; Error cause 1 is a int literal
        System.out.println(b);
    }
}
