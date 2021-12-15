package com.javacourse.chapter7.ConditionalStatements.SwitchStatementsStudentChallenge;

import java.util.Scanner;

public class Display_Type_Of_Website {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter Website Url: ");
        String url = scin.nextLine();
        String ext = url.substring(url.lastIndexOf(".")+1, url.length());
        switch (ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
            default:
                System.out.println("Sorry Not Able To Recognize");
                break;
        }
    }
}
