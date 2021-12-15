package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class Insert_An_Element {
    public static void main(String[] args){
        int[] a = new int[10];
        a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;a[5]=6;
        int size = 6;
        int numberToInsert = 10;
        int atIndex = 5;
        for (int i = size; i > atIndex; i--){
            a[i] = a[i - 1];
        }
        a[atIndex] = numberToInsert;
        System.out.println(Arrays.toString(a));
    }
}
