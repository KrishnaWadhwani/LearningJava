package com.javacourse;

public class Test2 {
    public static void main(String[] args){
        sum(1,2,3,4,5,6,7,4);
    }
    static void sum(int ...a){
        System.out.println(a.length);
    }
}
