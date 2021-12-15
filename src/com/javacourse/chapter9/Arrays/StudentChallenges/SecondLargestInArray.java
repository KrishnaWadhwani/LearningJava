package com.javacourse.chapter9.Arrays.StudentChallenges;

public class SecondLargestInArray {
    public static void main(String[] args){
        int[] a = {4,5,6,3,2,1,51,5,100,32,1,52,3,2,155,2,1,6,9,8,5,6,3,2,1,4,7,89,6,5,2,3,21};
        int max1, max2;
        max1 = max2 = a[0];
        for (int i = 0 ; i < a.length ; i++){
            if (a[i]>max1){
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2){
                max2 = a[i];
            }
        }
        System.out.println("Second Largest Is: "+max2);
    }
}
