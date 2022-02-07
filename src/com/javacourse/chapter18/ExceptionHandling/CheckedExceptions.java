package com.javacourse.chapter18.ExceptionHandling;

import java.io.*;

public class CheckedExceptions {
    static void fun1(){
        // This is checked Exception
        // FileInputStream fileInputStream = new FileInputStream("My.txt");

        try{
            throw new LowBalanceException();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args){
        fun3();
    }
}
