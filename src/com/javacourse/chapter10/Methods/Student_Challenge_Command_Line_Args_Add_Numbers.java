package com.javacourse.chapter10.Methods;

public class Student_Challenge_Command_Line_Args_Add_Numbers {
    public static void main(String[] args){
        double sum = 0;
        for (String x : args) {
            if (x.matches("[0-9]+")) {
                sum += Double.parseDouble(x);
            }
        }
        System.out.println(sum);
    }
}
