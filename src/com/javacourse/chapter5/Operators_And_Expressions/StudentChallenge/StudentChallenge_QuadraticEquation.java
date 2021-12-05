package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

import java.util.Scanner;

public class StudentChallenge_QuadraticEquation {
    public static void main(String[] args) {
        float a, b, c;
        double r1, r2;
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter the value of \"a\": ");
        a = scin.nextFloat();
        System.out.println("Enter the value of \"b\": ");
        b = scin.nextFloat();
        System.out.println("Enter the value of \"c\": ");
        c = scin.nextFloat();
        r1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        r2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Root: "+r1);
        System.out.println("Root: "+r2);
    }
}
