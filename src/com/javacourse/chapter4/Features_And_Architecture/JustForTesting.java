package com.javacourse.chapter4.Features_And_Architecture;

import java.util.Random;
import java.util.Scanner;

public class JustForTesting {
    public static int captcha;
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        String heading = "Welcome to table writer";
        System.out.println(heading);
        System.out.println("--Please Select--");
        System.out.println("[I]terative or [R]ecursive");
        String input = scin.nextLine();
        System.out.println("Table of: ?");
        int of = scin.nextInt();
        System.out.println("Table of "+of+" from: ?");
        int x = scin.nextInt();
        System.out.println("Table of "+of+" from: "+x+" to: ?");
        int upto = scin.nextInt();
        System.out.println("Table of "+of+" from: "+x+" to: "+upto);
        System.out.println("First Verify That You Are Not A Robot");
        Random rand = new Random();
        captcha = rand.nextInt(10000);
        System.out.println("Captcha: "+captcha);
        System.out.println("Type The Captcha: ");
        int captchaGet = scin.nextInt();
        if(String.valueOf(captcha).matches(String.valueOf(captchaGet))){
            if(String.valueOf(captcha).matches(String.valueOf(captchaGet))){
                if(input.matches("I") || input.matches("i")){
                    writeTableIterative(of, upto, x);
                }
                else if(input.matches("R") || input.matches("r")){
                    writeTableRecursive(of, upto, x);
                }
            }
        }
        else {
            System.out.println("Sorry Wrong Captcha");
        }
    }
    public static void writeTableRecursive(int of, int upto, int x){
        System.gc(); // Just calling garbage collector
        if (x != upto+1) {
            System.out.println(of*x);
            x++;
            writeTableRecursive(of, upto, x);
        }
    }
    public static void writeTableIterative(int of, int upto, int x){
        System.gc(); // Just calling garbage collector
        for(int i = x; i<=upto; i++){
            System.out.println(of*i);
        }
    }
}