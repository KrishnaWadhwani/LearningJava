package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Search_An_Element {
    public static void main(String[] args){
        int[] a = {4,5,6,3,2,1,51,5,100,32,1,52,3,2,155,2,1,6,9,8,5,6,3,2,1,4,7,89,6,5,2,3,21};
        int element_to_search = 100;
        for (int i = 0 ; i < a.length; i++){
            if (a[i]==element_to_search){
                System.out.println("Element Found At: "+i);
                System.exit(0);
            }
        }
        System.out.println("Element Not Found");
    }
}
