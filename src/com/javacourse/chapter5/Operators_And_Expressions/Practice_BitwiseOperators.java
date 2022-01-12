package com.javacourse.chapter5.Operators_And_Expressions;

public class Practice_BitwiseOperators {
    public static void main(String[] args){
        /*int x = 10, y = 6, z;
        z = x&y;
        System.out.println(z);*/
        /*      (&)(AND)     */
        /*int x = 0b1010;
        int y = 0b0110;
        int z;
        z = x&y; // 0010
        System.out.println(z);*/
        /*        (|)(OR)        */
        /*int x = 0b1010;
        int y = 0b0110;
        int z;
        z = x|y;
        System.out.println(z);*/
        /*         (^)(XOR)         */
        /*int x = 0b1010;
        int y = 0b0110;
        int z;
        z = x^y;
        System.out.println(z);*/
        /*         << (Left Shift Operation)         */
        /*int x = 0b1000;
        int y = x<<2;
        System.out.println(y);*/
        /*        >> (Right Shift Operation)        */
        /*int x = -0b1000;
        int y = x>>1;
        System.out.println(y);*/
        /*        >>> (Unsigned Right Shift)         */
        /*int x = -0b1000;
        int y = x>>>1;
        ConvertToBinary.convertToBinary(y); // Just For Fun :-)
        System.out.println("x: "+String.format("%s", Integer.toBinaryString(x)));
        System.out.println("y: "+String.format("%32s", Integer.toBinaryString(y)));*/
        /*           (~)NOT           */
        int x = 0b1010;
        int y = ~x;
        System.out.println(y);
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
    }
}
