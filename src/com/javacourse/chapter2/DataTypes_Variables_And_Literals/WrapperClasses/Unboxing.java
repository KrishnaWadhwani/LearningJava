package com.javacourse.chapter2.DataTypes_Variables_And_Literals.WrapperClasses;

import java.util.ArrayList;

public class Unboxing {
    public static void main(String[] args){
        /*
            Unboxing - Conversion of Wrapper Classes To Corresponding Primitive Type
            For More: Please Check Java Notebook :-)
        */
        Character ch = 'a';
        // Unboxing - Character object to primitive data type
        char a = ch;
        System.out.println(a);
        //Example of ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24); // Autoboxing happening here :-) int to Integer;
        // Unboxing because get method returns an Integer Object
        int num = arrayList.get(0);
        System.out.println(num);
    }
}
