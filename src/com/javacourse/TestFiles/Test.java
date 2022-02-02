package com.javacourse.TestFiles;

import java.util.Arrays;

public class Test{
    public static void main(String[] args){
        String s = "   ";
        System.out.println();
    }
    public static int[] closestNumber(int a[], int v)
    {
        Arrays.sort(a);
        int address = 0;
        int value = 0;
        int difference = a[0];
        for (int i = 0 ; i < a.length; i++){
            if ((a[i]-v)<difference){
                address = i;
                value = a[i];
            }
        }
        return new int [] {address, value};
    }
}