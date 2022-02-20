package com.javacourse.TestFiles;

import java.util.Scanner;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        int[] t = Stream.of(scin.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
