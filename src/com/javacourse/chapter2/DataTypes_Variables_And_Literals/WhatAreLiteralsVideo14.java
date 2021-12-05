package com.javacourse.chapter2.DataTypes_Variables_And_Literals;

public class WhatAreLiteralsVideo14 {
    public static void main(String[] args){
        byte b = 15; //int literal
        short s = 15; //int literal
        int i = 15; //int literal
        //int i1 = 15L; //beyond the limit of int because it is long
        //long l = 15095823095823238; //int literal (we have to type (L) or (l)) to make it long literal
        long l1 = 1_509_582_309_582_323_842L; //long literal
        float f = 15.23F; //float literal
        //float f1 = 15.9; //double literal (we have to type (F) or (f)) else it will give error that's why I commented it
        double d = 15.9D; //double literal
        double d1 = 15.95340943985340958340; //also double literal (no need of (D) or (d)) by default decimal values are double
        char c = 'A'; //char literal
        boolean bool = true; //boolean literal
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l1);
        System.out.println(f);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(bool);

        long l = 99_99_99_999L;
        float f3 = 123_456.78f;
        float f4 = 123_456.7_8f;
        System.out.println(l);
        System.out.println(f3);
        System.out.println(f4);
        /*
        Wrong:
        float f3 = 123_456_.78f;
        float f3 = 123_456._78f;
        float f3 = _123_456.78f;
        float f3 = _123_456.78f_;
        */
    }
}