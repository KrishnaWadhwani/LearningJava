package com.javacourse.chapter18.ExceptionHandling.TryWithResources;

import java.util.Scanner;
import java.io.*;

public class TryWithResources {
      static void Divide() throws Exception{
        try(FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter18/ExceptionHandling/TryWithResources/TryWithResourcesText.txt"); Scanner scin = new Scanner(fileInputStream)){
            int a = scin.nextInt();
            int b = scin.nextInt();
            int c = scin.nextInt();
            int d = scin.nextInt();
            System.out.println(a/b);
        }
    }
    public static void main(String[] args){
        try{
            Divide();
        }
        catch (Exception e){
            System.out.println("File Not Found");
        }
    }
}
