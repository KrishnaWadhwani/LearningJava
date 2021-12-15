package com.javacourse.chapter7.ConditionalStatements;

public class PracticeSwitch {
    // click on debug and go to java visualizer and see how switch statement is working
    public static void main(String[] args){
        int n = 3; // create a breakpoint here
        switch (n) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                break;
            default:
                System.out.println("Not Valid");
                break;
        }
    }
}
