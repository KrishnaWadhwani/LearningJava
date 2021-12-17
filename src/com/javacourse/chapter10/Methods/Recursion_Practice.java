package com.javacourse.chapter10.Methods;

public class Recursion_Practice {
    public static void fun(int n){ // put a break point here to see how it is working
        if (n > 0){
            System.out.println(n);
            fun(n - 1);
        }
    }
    public static void fun1(int n){ // put a break point here to see how it is working
        if (n > 0){
            fun1(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        System.out.println("fun");
        fun(10);
        System.out.println("fun1");
        fun1(10);
    }
}
