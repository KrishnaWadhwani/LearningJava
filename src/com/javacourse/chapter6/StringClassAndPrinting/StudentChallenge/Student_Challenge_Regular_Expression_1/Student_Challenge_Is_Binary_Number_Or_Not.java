package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_1;

public class Student_Challenge_Is_Binary_Number_Or_Not {
    public static void main(String[] args){
        // Is Binary Or Not
        String binaryNumber = "0100100101001001000100001000";
        System.out.println(binaryNumber.matches("[01]+")); // "+" is for 1 or more
    }
}
