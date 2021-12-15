package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;

public class Find_Type_Of_Website_And_The_Protocol_Used {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter a website url: ");
        String url = scin.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        System.out.println("--Type Of Protocol--");
        System.out.println(protocol);
        if(protocol.matches("https")){
            System.out.println("Hypertext Transfer Protocol Secure");
        }
        else if(protocol.matches("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else if(protocol.matches("ftp")){
            System.out.println("File Transfer Protocol");
        }
        System.out.println("--Type Of Website--");
        String ext = url.substring(url.lastIndexOf(".")+1, url.length());
        System.out.println(ext);
        if(ext.matches("com")){
            System.out.println("Commercial");
        }
        else if(ext.matches("org")){
            System.out.println("Organization");
        }
        else if(ext.matches("gov")){
            System.out.println("Government");
        }
        else if(ext.matches("net")){
            System.out.println("Network");
        }
        else if(ext.matches("biz")){
            System.out.println("Business");
        }
        else{
            System.out.println("Sorry Not Able To Recognize");
        }
    }
}
