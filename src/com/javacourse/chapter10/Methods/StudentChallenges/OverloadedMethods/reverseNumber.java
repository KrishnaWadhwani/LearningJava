package com.javacourse.chapter10.Methods.StudentChallenges.OverloadedMethods;

public class reverseNumber {
    static String reverse(int n){
        int x;
        String output = "";
        while (n > 0){
            x = n % 10;
            output+=x;
            n /= 10;
        }
        return output;
    }
    static void reverse(int[] a){
        int[] b = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length - 1; i++, j--){
            b[i] = a[j];
            System.out.print("["+b[i]+"]");
        }
        a = b;
        b = null;
    }
    public static void main(String[] args){
        System.out.println(reverse(234));
        reverse(new int [] {1,2,3,4,5,6,7,8,9,0});
    }
}
