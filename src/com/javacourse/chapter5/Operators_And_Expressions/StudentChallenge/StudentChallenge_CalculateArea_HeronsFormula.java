package com.javacourse.chapter5.Operators_And_Expressions.StudentChallenge;

import java.util.Scanner;

public class StudentChallenge_CalculateArea_HeronsFormula {
    public static void main(String[] args){
        float side1, side2, side3, perimeter, semi_perimeter;
        double area;
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter 1st Side: ");
        side1 = scin.nextFloat();
        System.out.println("Enter 2nd Side: ");
        side2 = scin.nextFloat();
        System.out.println("Enter 3rd Side: ");
        side3 = scin.nextFloat();
        perimeter = side1+side2+side3;
        semi_perimeter = perimeter/2f;
        area = Math.sqrt(semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3));
        System.out.println("So The Area Of Triangle Is: "+area);
    }
}
