package com.javacourse.chapter10.Methods.StudentChallenges.VarArgs;

public class Calculate_Discount {
    static double discount(double ...p){
        double sum = 0;
        for (double x : p){
            sum += x;
        }
        if (sum < 500){
            return sum*0.10;
        }
        else if (sum >= 500 && sum <= 1000){
            return sum * 0.15;
        }
        else {
            return sum * 0.20;
        }
    }
    public static void main(String[] args){
        System.out.println(discount(100));
    }
}
