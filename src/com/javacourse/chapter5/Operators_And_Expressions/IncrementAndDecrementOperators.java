package com.javacourse.chapter5.Operators_And_Expressions;

public class IncrementAndDecrementOperators {
    public static void main(String[] args){
        int a = 2, b = 5, x = 4;
        System.out.println(a*(x++)+6);
        System.out.println(a*(++x)+6); //here the result is 18 cause x is incremented on line number 6 so here x = 6
    }
}
