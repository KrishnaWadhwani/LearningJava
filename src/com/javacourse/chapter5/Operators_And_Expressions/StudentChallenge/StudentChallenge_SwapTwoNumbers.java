package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

public class StudentChallenge_SwapTwoNumbers {
    public static void main(String[] args){
        int a = 9;
        int b = 12;
        System.out.println("Before (a): "+a);
        System.out.println("Before (b): "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After(a): "+a);
        System.out.println("After(b): "+b);
    }
}
