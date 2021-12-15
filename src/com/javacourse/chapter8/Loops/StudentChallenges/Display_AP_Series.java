package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Display_AP_Series {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("AP Series Printer");
        System.out.println("Enter Starting: ");
        int starting = scin.nextInt();
        System.out.println("Enter Gap: ");
        int gap = scin.nextInt();
        System.out.println("Enter Times: ");
        int times = scin.nextInt();
        int currentDigit = starting;
        System.out.println("AP Series");
        System.out.println("|=========|");
        for(int i = 0 ; i < times; i++){
            System.out.print(currentDigit+", ");
            currentDigit += gap;
        }
    }
}
