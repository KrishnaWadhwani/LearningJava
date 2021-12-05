package com.javacourse.chapter6.StringClassAndPrinting;

public class PrintingUsing_System_out_println {
    public static void main(String[] args){
        int a = 10, x = 10, y = 20;
        float b = 12.55f;
        char c = 'A';
        String str = "Hello";
        System.out.println(a); // println for int was called
        System.out.println(b); // println for float was called
        System.out.println(c); // println for char was called
        System.out.println(str); // println for String was called
        System.out.println(x + y); // println for int was called
        System.out.println("Number is: "+y);
        System.out.println(x+y+" Sum");
        System.out.println("Sum "+x+y); // output: Sum 1020
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y)); // here (x+y) is written so, because () increase precedence of operator

    }
}
