package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class Delete_An_Element_From_Array {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8};
        int indexToDelete = 4;
        for (int i = indexToDelete ; i < a.length - 1; i++){
            a[i] = a[i+1];
        }
        a[a.length - 1] = 0;
        System.out.println(Arrays.toString(a));
    }
}
