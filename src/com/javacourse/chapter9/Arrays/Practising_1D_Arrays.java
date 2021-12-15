package com.javacourse.chapter9.Arrays;

public class Practising_1D_Arrays {
    public static void main(String[] args){
        //Declaring Values Of Array
        float A[] = new float[10];
        int B[] = {1,2,3,4,5};
        int C[];
        C = new int[10];
        C[0] = 1; // Assigning Value In C[];
        C[1] = 4; // Assigning Value In C[];
        int[] D = new int[10];
        B[2] = 15; // Instead Of 3 it has been changed to 15
        // Printing Values Of Array
        for (int i = 0 ; i < A.length ; i++){
            System.out.println(A[i]);
        }
        System.out.println("Values Of B");
        for (int i = 0 ; i < B.length ; i++){
            System.out.println(B[i]);
        }
        // Using For Each Loop
        System.out.println("Using For Each Loop");
        for (int x : B){
            System.out.println(x);
        }
        //updating the value of array
        for (int x : B){
            System.out.println(x++); // "++" will not update the value :-) of array and x
        }
        System.out.println("using for loop to update the value of array");
        for (int i = 0 ; i < B.length ; i++){
            System.out.println(++B[i]); //B[i]++ will update the values of array but not of which loop is printing, ++B[i] (pre increment) will update the value of array and of which loop is printing
        }
        // Printing The Length Of An Array
        System.out.println("Length Of An Array");
        System.out.println("Length Of Array B: "+B.length);
    }
}
