package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class Uncompleted_Rotating_Array_Right_Shift {
    public static void main(String[] args){
        // Not able to complete :-)
        int[] a = {4,5,6,3,7};
        int last = a[a.length - 1];
        for (int i = a.length - 2; i>=0 ; i--){
            a[i+1] = a[i];
        }
        a[0] = last;
        System.out.println(Arrays.toString(a));
    }
}
