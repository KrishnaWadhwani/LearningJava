package com.javacourse.chapter7.ConditionalStatements.SwitchStatementsStudentChallenge;

import java.util.Scanner;

public class Menu_Driven_Program {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("-------");
        System.out.println("Enter 2 Numbers: ");
        int x = scin.nextInt();
        int y = scin.nextInt();
        scin.nextLine();
        System.out.println("Write One Option From Menu: ");
        String option = scin.nextLine();
        option = option.toUpperCase();
        switch (option){
            case "ADD":
                System.out.println("Sum Is:" + (x+y));
                break;
            case "SUB":
                System.out.println("Difference Is: " + (x-y));
                break;
            case "MUL":
                System.out.println("Product Is: " + (x*y));
                break;
            case "DIV":
                System.out.println("Division Is: " + (x/y));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
