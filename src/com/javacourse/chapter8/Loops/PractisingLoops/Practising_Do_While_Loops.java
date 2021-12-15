package com.javacourse.chapter8.Loops.PractisingLoops;

public class Practising_Do_While_Loops {
    public static void main(String[] args){
        int i = 1, n = 100;
        // make "i" as 100 then this will run for 1 time and output 100
        do{
            System.out.println(i);
            i = i * 2;
        }while (i < n);
    }
}
