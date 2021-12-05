package com.javacourse.chapter5.Operators_And_Expressions;

public class PrecedenceOfOperators {
    public static void main(String[] args) {
        System.out.println(10+20/2); // = 20
        System.out.println((10+20)/2); // = 15
        System.out.println(10/2*5); // = 25
        System.out.println(10/(2*5)); // = 1
    }
}
