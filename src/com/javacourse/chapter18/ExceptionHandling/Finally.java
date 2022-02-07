package com.javacourse.chapter18.ExceptionHandling;

import java.io.*;
import java.util.*;

public class Finally {
    static FileInputStream fileInputStream;
    static Scanner scin;

    static void Divide() throws Exception {
        fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter18/ExceptionHandling/TryWithResources/TryWithResourcesText.txt");
        try{
            scin = new Scanner(fileInputStream);
            int a = scin.nextInt();
            int b = scin.nextInt();
            int c = scin.nextInt();
            int d = scin.nextInt();
            System.out.println(a/c); // make c -> b so that ArithmeticException Do Not Occur
        }
        finally {
            fileInputStream.close();
            scin.close(); // comment this to make the code executable
        }
    }

    public static void main(String[] args) throws Exception{
        try{
            Divide();
        }
        catch (Exception e){
            System.out.println(e);
        }
        int x = scin.nextInt();

        System.out.println(x);

    }
}
