package com.javacourse.chapter9.Arrays.StudentChallenges;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
