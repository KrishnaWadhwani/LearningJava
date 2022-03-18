package com.javacourse.chapter24.Generics;

public class BoundedTypeGenericMethod {
    public static <E extends Number> void boundedTypeMethod(E... list){
        int sum = 0;
        for (E x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        boundedTypeMethod(10, 20, 20.23f);
    }
}
