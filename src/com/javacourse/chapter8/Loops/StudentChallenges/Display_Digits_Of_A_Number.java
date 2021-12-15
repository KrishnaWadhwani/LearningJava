package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Display_Digits_Of_A_Number {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter Digit: ");
        int n = scin.nextInt();
        int x = 0;
        while (n > 0){
            x = n % 10;
            System.out.println(x);
            n /= 10;
        }
    }
}
