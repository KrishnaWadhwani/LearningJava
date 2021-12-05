package com.javacourse.chapter6.StringClassAndPrinting;

public class Practising_String_Methods_1 {
    public static void main(String[] args){
        String str = new String("Int.ell.iJ");
        String str1 = "       IntelliJ       ";
        int len = str.length();
        System.out.println(len);
        String str2 = str.toUpperCase();
        System.out.println(str2);
        String str3 = str.toLowerCase();
        System.out.println(str3);
        String str4 = str.trim();
        System.out.println(str4); // See the spaces are gone
        String str5 = str.substring(3);
        System.out.println(str5); //elliJ
        String str6 = str.substring(3, 6); // 6-1=5 output will be from 3rd to 5th index
        System.out.println(str6); //ell
        String str7 = str.replace('l', 'F');
        System.out.println(str7); //InteffiJ
        System.out.println(str.indexOf("."));
    }
}
