package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Armstrong_Number_Or_Not {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a digit to check weather it is armstrong or not: ");
        int n = scin.nextInt();
        int nCopy = n;
        int x = 0;
        int y = 0;
        while (n > 0){
            x = n % 10;
            y += x*x*x;
            n /= 10;
        }
        if(y == nCopy){
            System.out.println("Yes, It's An Armstrong Number");
        }
        else{
            System.out.println("No, It's Not An Armstrong Number");
        }
    }
}
