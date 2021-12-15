package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;

public class Find_Radix_Of_A_Number_Given_In_A_String {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter A Number");
        String number = scin.nextLine();
        if(number.matches("[01]+")){
            System.out.println("Binary Radix: 2");
        }
        else if(number.matches("[0-7]+")){
            System.out.println("Octal Radix: 8");
        }
        else if(number.matches("[0-9]+")){
            System.out.println("Decimal Radix: 10");
        }
        else if(number.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Radix: 16");
        }
        else{
            System.out.println("Alien Radix (Jaadduuuuuuuu..........)");
        }
    }
}
