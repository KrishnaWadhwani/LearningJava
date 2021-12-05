package com.javacourse.chapter1.Introduction;

import java.util.Scanner;

public class Exercise_WriteYourFirstProgramVideo9 {
    public static void main(String[] args){
        String name;
        Scanner scin = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        name = scin.nextLine();
        System.out.println("Your Name: "+name);
    }
}
