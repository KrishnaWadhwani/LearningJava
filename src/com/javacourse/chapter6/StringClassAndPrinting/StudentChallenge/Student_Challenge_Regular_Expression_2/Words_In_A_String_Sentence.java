package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge.Student_Challenge_Regular_Expression_2;

public class Words_In_A_String_Sentence {
    public static void main(String[] args){
        String s = "Kri sh na";
        String[] words = s.split("\\s");
        System.out.println(words.length);
    }
}
