package com.javacourse.chapter5.Operators_And_Expressions;

public class WideningAndNarrowing {
    public static void main(String[] args){
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10.5f;
        double d = 10;
        char c = 10;
        boolean bl = true;
        s = b;
        i = b;
        l = b;
        f = b;
        d = b;
        // here data loss will happen in narrowing
        // if the data can fit inside byte like if I assign 120 to short there will be not Data Loss
        b = (byte)s;
        System.out.println(b);
        i = s;
        l = s;
        f = s;
        d = s;
        //i = f;
        f = i;
        //f = d;
        d = f;
        d = f;
    }
}
