package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;
public class Grades_For_Given_Marks {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter marks for three subjects");
        int m1 = scin.nextInt();
        int m2 = scin.nextInt();
        int m3 = scin.nextInt();
        float avg = (float) (m1+m2+m3)/3;
        System.out.println("Average: "+avg);
        if(avg>=70){
            System.out.println("A (IIT)");
        }
        else if(avg>=60){
            System.out.println("B (NIT)");
        }
        else if(avg>=50){
            System.out.println("C (NSIT)");
        }
        else if(avg>=40){
            System.out.println("D (Tharra Collage)");
        }
        else{
            System.out.println("E (Beta Tumse Na Ho Paega)");
        }
    }
}
