package com.javacourse.chapter10.Methods.StudentChallenges.OverloadedMethods;

public class CalculateArea {
    static double calculateArea(double l, double b){
        return l * b;
    }
    static double calculateArea(double r){
        return Math.PI*r*r;
    }
    static double calculateArea(double a, double b, double h){
        return ((a+b)*h)/2;
    }
    public static void main(String[] args){
        calculateArea(2);
    }
}
