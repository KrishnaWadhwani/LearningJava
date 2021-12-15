package com.javacourse.chapter9.Arrays;

import java.util.Arrays;

public class Practising_2D_Arrays {
    public static void main(String[] args){

        int A[][] = new int[5][5];

        int B[][]={{1,2,3,4}, {2,4,6,8}, {3,5,7,9}}; // 3 * 4

        int C[][];
        C = new int[5][5];

        int [][]D = new int[5][5];

        int []E[] = new int[5][5];

        int[] F, G[];
        F = new int[5];
        G = new int[5][5];

        int[] H,I,J,K,L[]; //Here L is 2 Dimensional Array, And H,I,J,K Are 1 Dimensional

        // Displaying Elements Of A 2D Array With [] :-) Using For Loop

        for (int i = 0 ; i < B.length; i++){
            for (int j = 0 ; j < B[i].length; j++){
                System.out.print("["+B[i][j]+"]");
            }
            System.out.println();
        }

        // Printing Using For Each Loop

        for (int x[] : B){
            for (int y : x){
                System.out.print("["+y+"]");
            }
            System.out.println("");
        }
        System.out.println("Printing The Length Of \"B\"");
        // Printing The Length Of "B"
        System.out.println(B.length);
        // Jagged Array
        System.out.println("Jagged Array");
        int M[][];
        M = new int[3][];
        M[0] = new int[5];
        M[1] = new int[3];
        M[2] = new int[8];
        for (int i = 0 ; i < M.length ; i++){
            for (int j = 0 ; j < M[i].length; j++){
                M[i][j] = i+j;
            }
        }
        for (int i = 0 ; i < M.length ; i++){
            for (int j = 0 ; j < M[i].length; j++){
                System.out.print("["+M[i][j]+"]");
            }
            System.out.println();
        }
    }
}
