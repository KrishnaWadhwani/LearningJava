package com.javacourse.chapter18.ExceptionHandling;

import java.util.Scanner;

public class TryAndCatchBlock {
    public static void main(String[] args) {
        int a;
        int b;
        float c;
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scin.nextInt();
        System.out.println("Enter b: ");
        b = scin.nextInt();
        try{
            c = (float)a/b;
            System.out.println("Division Is: "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator Should Not Be 0, Try Again: "+e);
        }
        System.out.println("Bye");
    }
}