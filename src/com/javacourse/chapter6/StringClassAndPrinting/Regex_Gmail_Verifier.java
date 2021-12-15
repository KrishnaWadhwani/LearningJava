package com.javacourse.chapter6.StringClassAndPrinting;

public class Regex_Gmail_Verifier {
    public static void main(String[] args){
        String mail = "kwswhwmw@gmail.com";
        System.out.println(mail.matches("\\w*@gmail.com"));
    }
}
