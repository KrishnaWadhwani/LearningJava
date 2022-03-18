package com.javacourse.chapter24.Generics.JustExploring;

public class GenericMethods {
    public static <E> void genericMethod(E v){ // here method param takes input from user so to use Generic here we should have to write it here
        System.out.println(v.getClass().getName());
    }
    public static void main(String[] args){
        genericMethod("Krishna");
    }
}
