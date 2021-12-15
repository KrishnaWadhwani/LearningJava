package com.javacourse.chapter6.StringClassAndPrinting;

public class Regular_Expression_Meta_Characters {
    public static void main(String[] args){
        /* \\w */
        String str1 = "a";
        System.out.println(str1.matches("\\w")); //Alphabets or digits
        /* \\d */
        String str2 = "5";
        System.out.println(str1.matches("\\d")); //Digits
        /* \\D */
        String str3 = "b";
        System.out.println(str3.matches("\\D")); //Not a digit
        /* \\W */
        String str4 = "$";
        System.out.println(str4.matches("\\W")); //Neither Alphabet Nor Digit
        /* \\s */
        String str5 = " ";
        System.out.println(str5.matches("\\s")); //Space
        /* \\S */
        String str6 = "ab";
        System.out.println(str6.matches("\\S")); //Not A Space
    }
}
