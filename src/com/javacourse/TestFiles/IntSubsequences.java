package com.javacourse.TestFiles;

import java.util.Scanner;

public class IntSubsequences {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        int t = scin.nextInt();
        while (t != 0){
            int N = scin.nextInt();
            int X = scin.nextInt();
            String s = scin.next();
            int count = 0;
            String output = "Yes";
            for (int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i)=='0'){
                    count++;
                    if (count == X){
                        output = "No";
                    }
                }
                else{
                    count = 0;
                }
            }
            System.out.println(output);
            t--;
        }
    }
}
