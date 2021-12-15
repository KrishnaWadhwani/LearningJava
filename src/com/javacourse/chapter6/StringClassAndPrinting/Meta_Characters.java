package com.javacourse.chapter6.StringClassAndPrinting;

public class Meta_Characters {
    public static void main(String[] args){
        String str1 = "abcdef";
        String str2 = "abbbcbbcbbababbabbcbcbcbaaaaa";
        String str3 = "aaacb";
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[abc]*"));
        System.out.println(str3.matches("[abc]+"));
        System.out.println(str3.matches("[abc]{5,8}")); // 5 - min   8 - max
        System.out.println(str3.matches("[abc]{6}"));
    }
}
