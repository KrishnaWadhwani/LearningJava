package com.javacourse.chapter6.StringClassAndPrinting;

public class Regular_Expression_Matching_Symbols {
    public static void main(String[] args){
        /* . */
        String str1 = "f";
        String str2 = "8";
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        /* [] */
        String str3 = "b";
        System.out.println(str3.matches("[abc]"));
        /* [^](except from) */
        String str4 = "a";
        System.out.println(str4.matches("[^abc]"));
        /* [-](range) */
        String str5 = "a";
        System.out.println(str5.matches("a-z0-9"));
        /* [][] */
        String str6 = "h3";
        System.out.println(str6.matches("[a-z][0-9]"));
        /* | (or) */
        String str7 = "a";
        System.out.println(str7.matches("a|b"));
        /* abc (must be) */
        String str8 = "abc";
        System.out.println(str8.matches("abc"));
    }
}