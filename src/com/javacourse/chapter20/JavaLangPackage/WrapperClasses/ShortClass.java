package com.javacourse.chapter20.JavaLangPackage.WrapperClasses;

public class ShortClass {
    public static void main(String[] args){
        short s = 15;
        Short a = Short.valueOf((short) 15);
        Short b = Short.valueOf(s);
        Short c = Short.valueOf("123");
    }
}
