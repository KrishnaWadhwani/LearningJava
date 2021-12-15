package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_2;

public class Remove_Special_Character_From_A_String {
    public static void main(String[] args){
        String s = "a!b@c#1$2%3";
        s = s.replaceAll("\\W", "");
        System.out.println(s);
    }
}
