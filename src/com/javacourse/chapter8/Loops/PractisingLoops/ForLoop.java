package com.javacourse.chapter8.Loops.PractisingLoops;

public class ForLoop {
    public static void main(String[] args) {
        int j = 0;
        // incrementing loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // decrementing loop
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // initialization is optional
        for(; j<=10; j++){
            System.out.println(j);
        }
        // more than 1 variable
        for(int i = 1, f = 0; i<=10; i++, j=j*2){
            System.out.println(i+"  "+j);
        }
        // infinite for loop
        for(;;){
            System.out.println(j);
            j++;
        }
    }
}