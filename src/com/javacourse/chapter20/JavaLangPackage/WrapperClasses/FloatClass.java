package com.javacourse.chapter20.JavaLangPackage.WrapperClasses;

public class FloatClass {
    public static void main(String[] args) {
        Float a = 12.3f;
        Float b =  Float.valueOf("123.5");

        Float c = Float.valueOf((float)123.5); // is same as
        Float d = Float.valueOf(123.5f); // this
    }
}
