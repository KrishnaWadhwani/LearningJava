package com.javacourse.chapter6.StringClassAndPrinting;

public class Practising_String_Methods_2 {
    public static void main(String[] args){
        String str1 = "Mr. Shahrukh Khan";
        String str2 = "www.udemy.com";
        /*starts with*/
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("mr."));
        System.out.println(str1.startsWith("Shah", 4));
        /*ends with*/
        System.out.println(str1.endsWith("Khan"));
        /*char at*/
        System.out.println(str1.charAt(4));
        for(int i = 0 ; i < str1.length(); i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println("");
        /*index of*/// searches from left to right
        System.out.println(str2.indexOf(".",4));
        /*last index of*/// searches from right to left
        System.out.println(str2.lastIndexOf("."));
    }
}
