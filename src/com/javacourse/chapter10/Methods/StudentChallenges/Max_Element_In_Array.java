package com.javacourse.chapter10.Methods.StudentChallenges;

public class Max_Element_In_Array {
    public static int maxElementOfArray(int[] a){
        int max = 0;
        for (int i = 0 ; i < a.length ; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(maxElementOfArray(new int[] {1,9,3,4,5,6,7,8,2}));
    }
}
