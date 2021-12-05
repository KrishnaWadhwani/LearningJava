package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

import java.util.Scanner;

public class StudentChallenge_CalculateArea_1 {
    public static void main(String[] args){
        float base, height, area;
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter The Base Of Triangle: ");
        base = scin.nextFloat();
        System.out.println("Enter The Height Of Triangle: ");
        height = scin.nextFloat();
        area = (base*height)/2f;
        System.out.println("So The Area Of Triangle Is: "+area);
    }
}
