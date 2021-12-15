package com.javacourse.chapter8.Loops.StudentChallenges;

public class NestedLoopPattern4 {
    public static void main(String[] args){
        int count = 0;
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= 5 ; j++) {
                count++;
                System.out.format("%02d ", count); //%[argument_index$][flags][width][precision]conversion
                //for more info please check notebook date: 1/Dec/2021
            }
            System.out.println("");
        }
    }
}
