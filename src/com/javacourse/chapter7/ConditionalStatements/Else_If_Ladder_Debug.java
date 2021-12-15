package com.javacourse.chapter7.ConditionalStatements;

public class Else_If_Ladder_Debug {
    // click on debug and go to java visualizer and see how else if ladder is working
    public static void main(String[] args) {
        int n = 3; //create breakpoint here
        if (n == 1) {
            System.out.println("ONE");
        } else if (n == 2) {
            System.out.println("TWO");
        } else if (n == 3) {
            System.out.println("THREE");
        } else {
            System.out.println("Not Valid");
        }
    }
}
