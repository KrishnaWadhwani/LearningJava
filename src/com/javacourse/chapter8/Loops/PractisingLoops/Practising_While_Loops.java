package com.javacourse.chapter8.Loops.PractisingLoops;

public class Practising_While_Loops {
    public static void main(String[] args){
        int i = 1, n = 100;
        // make "i" as 100 then this will not run
        while (i < n){
            System.out.println(i);
            i = i * 2;
        }
    }
}
