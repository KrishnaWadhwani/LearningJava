package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;

public class Number_Is_Odd_Or_Even {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scin.nextInt();
        if(i%2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
}
