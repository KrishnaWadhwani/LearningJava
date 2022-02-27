package com.javacourse.chapter22.LambdaExpressions;

import java.util.Arrays;

interface Lambda {
    int add(int... a);
}

interface ShortLambdaExpression {
    int add(int a, int b);
}

public class ParametersInLambdaExpression{
    public static void main(String[] args){

        // method 1 of using lambda, passing params in lambda
        Lambda lambda1 = (a) -> {
            int sum = 0;
            for (int x : a){
                sum+=x;
            }
            return sum;
        };
        System.out.println(lambda1.add(10,20,30,40,50,60,70,80,90,100));

        // method 2 of using lambda, passing params in lambda
        ShortLambdaExpression lambda2 = (a, b) -> a+b;
        System.out.println(lambda2.add(10, 20));
    }
}