package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Reverse_A_Number {
    // for detailed info please check the notebook or debug the code from line number 8
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        int n = scin.nextInt();
        int rev = 0;
        int currentDigit = 0;
        while (n > 0){
            currentDigit = n % 10;
            rev = (rev*10) + currentDigit; // below is the working of this
            // how number is being reversed
            // input = 237
            // (0 * 10) + 7;
            // (7 * 10) + 3;
            // (73 * 10) + 2;
            // = 732
            n /= 10;
        }
        System.out.println(rev);
    }
}
