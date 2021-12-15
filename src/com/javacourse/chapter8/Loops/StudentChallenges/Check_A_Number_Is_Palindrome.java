package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Check_A_Number_Is_Palindrome {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        int n = scin.nextInt();
        int nCopy = n;
        int rev = 0;
        int currentDigit;
        while (n > 0){
            currentDigit = n % 10;
            rev = (rev * 10) + currentDigit;
            n /= 10;
        }
        if(rev == nCopy){
            System.out.println("Yes, It's A Palindrome");
        }
        else{
            System.out.println("No, It's Not A Palindrome");
        }
    }
}
