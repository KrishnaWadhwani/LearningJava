package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;

public class Leap_Year_Or_Not {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scin.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("It's A Leap Year");
                }
                else{
                    System.out.println("Not A Leap Year");
                }
            }
            else{
                System.out.println("It's A Leap Year");
            }
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}