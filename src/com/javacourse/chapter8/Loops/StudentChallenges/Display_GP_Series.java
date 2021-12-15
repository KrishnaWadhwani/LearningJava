package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Display_GP_Series {
    public static void main(String[] args){
        System.out.println("GP Series Printer");
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter Starting: ");
        int starting = scin.nextInt();
        System.out.println("Enter Gap: ");
        int gap = scin.nextInt();
        System.out.println("Enter Times: ");
        int times = scin.nextInt();
        long currentDigit = starting;
        for(int i = 0 ; i < times; i++){
            currentDigit *= gap;
            System.out.println(currentDigit);
        }
    }
}
