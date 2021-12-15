package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Fibonacci Series Printer");
        System.out.println("Enter Number Of Terms");
        int n = scin.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0 ; i < n ; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
