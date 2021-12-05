package com.javacourse.chapter6.StringClassAndPrinting;

public class Practising_String_Methods_3 {
    public static void main(String[] args){
        String str1 = "Pyramid";
        String str2 = "Pyramid";
        String str3 = "pyramid";
        String str4 = new String("Pyramid");
        String str5 = "the great wall of china";
        /*equals*/
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        /*equalsIgnoreCase*/
        System.out.println(str1.equalsIgnoreCase(str3));
        /*==*/
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        /*compareTo*/
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str1));
        /*contains*/
        System.out.println(str5.contains("wall"));
        /*concat*/
        System.out.println(str1.concat(str5));
        /* + */
        System.out.println(str1+str5);
        /*valueOf*/
        String x = String.valueOf(-29520);
        System.out.println(x);
    }
}
