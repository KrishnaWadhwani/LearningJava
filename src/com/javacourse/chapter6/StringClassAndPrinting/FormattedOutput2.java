package com.javacourse.chapter6.StringClassAndPrinting;

import java.util.Scanner;

public class FormattedOutput2 {
    public static void main(String[] args){
        int a = -10;
        float x = 123.45f;
        float y = 3.45f;
        String str = "Java";
        System.out.printf("%5d\n", a); // Here 5 Is Width
        System.out.printf("%(d\n", a);
        System.out.printf("%+d\n", a);
        System.out.printf("%06.2f\n", x);
        System.out.printf("%06.2f\n", y);
        System.out.printf("%-20s\n", str);
        System.out.printf("%1$(20d", a);
    }
}