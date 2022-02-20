package com.javacourse.TestFiles;

import java.util.Scanner;

public class LengthOfLongestSubstring {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        String s = scin.nextLine();
        int f = 0;
        for (int i = 0 ; i < s.length() - 1 ; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                f = 0;
            }
            else{
                f++;
                System.out.println(f);
            }
        }
    }
}
