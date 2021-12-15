package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Max_Of_Array {
    public static void main(String[] args){
        int[] a = {4,5,6,3,2,1,51,5,100,32,1,52,3,2,155,2,1,6,9,8,5,6,3,2,1,4,7,89,6,5,2,3,21};
        int max = a[0];
        for (int i = 0 ; i < a.length ; i++){
            if (max<a[i]){
                max = a[i];
            }
        }
        System.out.println("Largest: "+max);
    }
}
