package com.javacourse.chapter20.JavaLangPackage.WrapperClasses;

public class IntegerClass {
    public static void main(String[] args){
        Integer i = new Integer(10); // Integer constructor have been deprecated since '9'
        // better use this method
        Integer integer = Integer.valueOf(10);

        Integer b = 10;

    }
}
