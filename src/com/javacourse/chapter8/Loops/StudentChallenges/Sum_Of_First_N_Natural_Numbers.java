package com.javacourse.chapter8.Loops.StudentChallenges;

public class Sum_Of_First_N_Natural_Numbers {
    public static void main(String[] args){
        int sum = 0;
        int n = 10;
        for(int i = 1 ; i <= n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
