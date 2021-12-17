package com.javacourse.chapter10.Methods.StudentChallenges.VarArgs;

public class Maximum_Of_Numbers_Using_VarArgs {
    static int max(int ...x){
        int max = 0;
        for (int a : x){
            if (a > max){
                max = a;
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(max(10,20,9,6,5,4,0,7,5,7));
    }
}
