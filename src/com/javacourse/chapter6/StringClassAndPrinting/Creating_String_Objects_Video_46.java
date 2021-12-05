package com.javacourse.chapter6.StringClassAndPrinting;

public class Creating_String_Objects_Video_46 {
    public static void main(String[] args){
        /*-----------String Literal------------*/
        String str1 = "Java Program";
        String str1a = "Java Program";
        String str1b = new String("Java Program");
        String str1c = "Java Program";
        System.out.println(str1==str1a);
        System.out.println(str1==str1b);
        System.out.println(str1==str1c);
        System.out.println(str1);
        /*-----------String------------*/
        String str2 = new String("JAVA");
        System.out.println(str2);
        /*-----------char-----------------*/
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        String str3a = new String(c,1,4);
        System.out.println(str3);
        System.out.println(str3a);
        /*--------byte-----------------*/
        byte b[] = {65,66,67,68};
        String str4 = new String(b,2,2);
        System.out.println(str4);
    }
}