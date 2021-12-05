package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

public class StudentChallenge_MaskingAndMergingApplication {
    public static void main(String[] args){
        byte a = 9, b = 12;
        byte c = 0;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(String.format("%s", Integer.toBinaryString(b)));
        c = (byte) (c|b);
        a = (byte) (a<<4);
        c = (byte) (c|a);
        System.out.println("Left Hand Side Number: "+((c&0b11110000)>>4));
        // >>4 Will do this operation on left hand side number
        System.out.println("Right Hand Side Number: "+(c&0b00001111));
    }
}