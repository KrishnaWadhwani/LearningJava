package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class Reverse_Copy_An_Array {
    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6,7,8,55,4,6,7,6,7,100,10,8};
        int [] b = new int[a.length];
        int length = a.length - 1;
        for (int i = 0 ; i < a.length - 1 ; i++){
            b[i] = a[length-i];
        }
        b[a.length-1]=a[0];
        System.out.println(Arrays.toString(b));
    }
}
