package com.javacourse.chapter18.ExceptionHandling;

public class PrintStackTrace {
    public static void main(String[] args){
        try{
            int c = 1/0;
            System.out.println(c);
        }
        catch (Exception e){

        }
    }
}
