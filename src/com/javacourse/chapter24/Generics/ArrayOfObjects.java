package com.javacourse.chapter24.Generics;

public class ArrayOfObjects {
    public static void main(String[] args){
        Object[] object = new Object[3]; // here we can store any type of data
                                         // Customer, Student, String, Integer, etc...

        String[] s = new String[3]; // -> here we can only store String type of data

        object[0] = "Hi";
        object[1] = "Bye";
        object[2] = 10;
        for (Object objects : object){
            System.out.println(objects);
        }
        String str;
        for (int i = 0 ; i < 3 ; i++){
            str=(String)object[i]; // this will give error on the third data -> "10"
            System.out.println(str);
        }
    }
}
