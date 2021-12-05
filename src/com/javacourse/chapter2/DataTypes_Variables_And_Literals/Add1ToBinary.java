package com.javacourse.chapter2.DataTypes_Variables_And_Literals;

public class Add1ToBinary {
    public static void main(String[] args) {
        int b = 0b11111000+1; // replace the binary it will add 1
        System.out.println(Integer.toBinaryString(b));
    }
}
