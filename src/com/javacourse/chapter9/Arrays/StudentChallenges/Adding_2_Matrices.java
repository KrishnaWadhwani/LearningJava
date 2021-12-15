package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Adding_2_Matrices {
    public static void main(String[] args){
        int [][] a = {{3,5,9},{7,6,2},{4,3,5}};
        int [][] b = {{1,5,2},{6,8,4},{3,9,7}};
        int [][] c = new int[a.length][a[0].length]; // 3 * 3
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < a[i].length ; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < a[i].length ; j++){
                System.out.print("["+c[i][j]+"]");
            }
            System.out.println();
        }
    }
}
