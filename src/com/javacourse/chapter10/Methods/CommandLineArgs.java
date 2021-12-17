package com.javacourse.chapter10.Methods; // remove this package name to run it from terminal else it will give class not found error

public class CommandLineArgs {
    public static void main(String[] args){
        for (String s : args){
            System.out.println(s);
        }
    }
}
