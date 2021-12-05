package com.javacourse.chapter2.DataTypes_Variables_And_Literals.WrapperClasses;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args){
        /*
            Autoboxing: Automatic conversion of Primitive types to the object of their corresponding wrapper class
            For More: Please Check Java Notebook :-)
        */
        char ch = 'a';
        // Autoboxing of "ch" from char datatype to Character object
        Character a = ch;
        System.out.println(a);
        // Example of ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);
        System.out.println(arrayList.get(0));
    }
}
