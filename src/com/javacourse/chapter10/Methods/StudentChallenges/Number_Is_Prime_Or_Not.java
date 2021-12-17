package com.javacourse.chapter10.Methods.StudentChallenges;

public class Number_Is_Prime_Or_Not {
    static boolean isPrimeOrNot(int x) {
        for (int i = 1; i < x / 2; i++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrimeOrNot(3));
    }
}
