package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Find_Sum_Of_All_Elements_In_Array {
    public static void main(String[] args){
        int[] a = {7,8,9,6,4,2,3,1,5,4,6,8,7,4,5,6,3,2,1,4,5,6,9,8,7};
        int sum = 0;
        // printing sum of array using for each loop
        for (int x : a){
            sum+=x;
        }
        System.out.println("For Each Loop: "+sum);
        sum = 0; // making sum = 0; so that I can use it again because it will have the sum of array :-)
        for (int i = 0 ; i < a.length ; i++){
            sum+=a[i];
        }
        System.out.println("For Loop: "+sum);
    }
}
