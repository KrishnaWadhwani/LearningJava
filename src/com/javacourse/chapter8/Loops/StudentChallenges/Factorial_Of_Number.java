package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static void main(String[] args){
        /*
            5 * 4 * 3 * 2 * 1
        */
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = scin.nextInt();
        long factorial = 1;
        for(int i = 1 ; i <= n; i++){
            factorial*=i;
        }
        System.out.println("Factorial Is: "+factorial);
    }
}
