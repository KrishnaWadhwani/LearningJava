package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class Rotating_Array_Left_Shift {
    public static void main(String[] args){
        int[] a = {4,5,6,3};
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1 ; i++){
            a[i]=a[i+1];
        }
        a[a.length-1] = temp;
        System.out.println(Arrays.toString(a));
    }
}
