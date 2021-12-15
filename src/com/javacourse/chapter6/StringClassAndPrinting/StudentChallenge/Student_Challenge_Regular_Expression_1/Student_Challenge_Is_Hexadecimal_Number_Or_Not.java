package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_1;

public class Student_Challenge_Is_Hexadecimal_Number_Or_Not {
    public static void main(String[] args){
        // Is Hexadecimal Number Or Not
        String hexaDecimal = "09AF";
        System.out.println(hexaDecimal.matches("[0-9A-F]+")); // "+" is for 1 or more
    }
}
