package com.javacourse.chapter10.Methods.StudentChallenges.VarArgs;

public class Sum_Of_Elements_Using_VarArgs {
    static int sum(int ...x){
        int sum = 0;
        for (int a : x){
            sum+=a;
        }
        return sum;
    }
    public static void main(String ...args){
        System.out.println(sum(10,20,30,40));
    }
}
