package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_2;

public class Remove_Spaces_From_A_String {
    public static void main(String[] args){
        String s = "   K  r i s h n  a   ";
        s = s.replaceAll("\\s", "");
        // "\\s" -> space
        System.out.println(s);
    }
}
