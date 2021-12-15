package com.javacourse.chapter8.Loops.StudentChallenges;

import java.util.Scanner;

public class Display_Number_In_Words {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("---Number To Words Convertor Online :-)---");
        System.out.println("Enter The Number: ");
        long n = scin.nextLong();
        String nString = String.valueOf(n);
        for (int i = 0 ; i < nString.length(); i++){
            switch (nString.charAt(i)){
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                case '0':
                    System.out.print("Zero ");
                    break;
                default:
                    System.out.print("? ");
            }
        }
    }
}
