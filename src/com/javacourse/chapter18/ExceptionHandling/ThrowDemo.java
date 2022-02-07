package com.javacourse.chapter18.ExceptionHandling;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            throw new Exception();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}