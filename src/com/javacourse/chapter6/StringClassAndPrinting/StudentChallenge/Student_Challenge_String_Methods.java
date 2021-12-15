package com.javacourse.chapter6.StringClassAndPrinting.StudentChallenge;

public class Student_Challenge_String_Methods {
    public static void main(String[] args){
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String username = str.substring(0, i);
        String domainName = str.substring(i+1, str.length());
        System.out.println("username: "+username);
        System.out.println("domain Name: "+domainName);
        System.out.println("G-Mail: "+domainName.startsWith("gmail"));
        System.out.println("HotMail: "+domainName.startsWith("hotmail"));
        System.out.println("Yahoo: "+domainName.startsWith("yahoomail"));
    }
}
