package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Copy_An_Array {
    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6};
        int [] b = a;
        for (int x : b){
            System.out.println(x);
        }
    }
}
