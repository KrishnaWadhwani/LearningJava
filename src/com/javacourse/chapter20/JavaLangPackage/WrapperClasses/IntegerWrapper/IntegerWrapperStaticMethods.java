package com.javacourse.chapter20.JavaLangPackage.WrapperClasses.IntegerWrapper;

public class IntegerWrapperStaticMethods {
    public static void main(String[] args) {
        int m1 = 10;
        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf(123);
        Integer m4 = Integer.valueOf("1010", 2); // Converting Number From Binary To Integer
        Integer m5 = Integer.valueOf("A7", 16); // Converting Number From Hexadecimal To Integer
        Integer m6 = Integer.bitCount(10);
        Integer m7 = Integer.decode("0xA7"); //(Same As Value Of) Convert Number From Other Number Systems To Decimal Just By Using 0x, 0, etc..

        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);

        System.out.println(Integer.parseInt("123")); // (Same As ValueOf) Convert String To Integer, If Given String Is Not A Number Than This Method Will Throw "NumberFormatException"

        System.out.println(Integer.reverseBytes(128) == Integer.MIN_VALUE);

        // Find the sign of number
        System.out.println(Integer.signum(10000));

        // Integer to binary
        System.out.println(Integer.toBinaryString(40));
    }
}
