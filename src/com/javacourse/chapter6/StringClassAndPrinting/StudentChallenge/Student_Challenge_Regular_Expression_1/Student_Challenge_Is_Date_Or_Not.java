package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_1;

public class Student_Challenge_Is_Date_Or_Not {
    public static void main(String[] args){
        // Is Date Or Not
        String Date = "01/12/2999";
        String regex = "([0-2][0-9]|[3][01])/([0-9]|[1][0-2])/([12].{2}[0-9])";
        boolean isDateOrNot = Date.matches(regex);
        System.out.println(isDateOrNot);
    }
}
