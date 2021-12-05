package com.javacourse.chapter1.Introduction;

import java.util.Scanner;

public class ReadingWithScannerVideo8 {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        /*int x = scin.nextInt();
        float y = scin.nextFloat();
        String s = scin.next();
        String s1 = scin.nextLine();
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
        System.out.println(s1);*/
        int x, y;
        System.out.println("Enter 2 Numbers");
        x = scin.nextInt();
        y = scin.nextInt();
        int z = x+y;
        System.out.println("Now Enter A Number To Verify That If It Is A Int Or Not");
        boolean t = scin.hasNextInt();
        System.out.println("Result");
        System.out.println("Sum Is: "+z);
        System.out.println("Is Int Or Not: "+t);
    }
}