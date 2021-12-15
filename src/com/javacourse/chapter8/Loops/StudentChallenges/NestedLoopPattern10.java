package com.javacourse.chapter8.Loops.StudentChallenges;

public class NestedLoopPattern10 {
    public static void main(String[] args){
        int oddNumbers = 1;
        for (int i = 1 ; i <= 5 ; i++){
            repeat("*", " ", oddNumbers);
            oddNumbers+=2;
            System.out.println("");
        }
    }
    public static void repeat(String x, String x1, int y){
        for (int i = 0 ; i < y ; i++){
            System.out.print(x+x1);
        }
    }
}
