package com.javacourse.chapter2.DataTypes_Variables_And_Literals;

public class CheckBinaryBitsOfAnInteger {
    public static void main(String[] args){
        int x = -5;// 32 bits
        System.out.println(Integer.toBinaryString(x)); // will show the leading bits
        // toBinaryString is only available in int and long so for byte and short we have to convert them into int or long
    }
}
