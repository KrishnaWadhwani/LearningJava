package com.javacourse.chapter24.Generics;

// if you run this code this will give Exception(Runtime error) :-)
// a class containing main method should not be a generic class
// write a separate class for generics
public class ArrayOfObjectsGenerics<T> {
    T data[] =(T[]) new Object[3];
    public static void main(String[] args){
        ArrayOfObjectsGenerics<String> gd = new ArrayOfObjectsGenerics();
        gd.data[0] = "Hi";
        gd.data[1] = "Bye";
        // gd.data[2] = new Integer(10);
        String str = gd.data[0];
        System.out.println(str);
    }
}
