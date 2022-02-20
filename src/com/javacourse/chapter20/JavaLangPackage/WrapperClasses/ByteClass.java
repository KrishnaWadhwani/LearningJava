package com.javacourse.chapter20.JavaLangPackage.WrapperClasses;

public class ByteClass {
    public static void main(String[] args){
        Byte a = 15;
        Byte b = Byte.valueOf("15");

        byte b1 = 15;
        Byte c = Byte.valueOf(b1);
        Byte e = Byte.valueOf((byte) 15);


    }
}
