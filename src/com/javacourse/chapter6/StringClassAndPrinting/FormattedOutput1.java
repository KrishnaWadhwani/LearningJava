package com.javacourse.chapter6.StringClassAndPrinting;

public class FormattedOutput1 {
    public static void main(String[] args){
        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String s = "Java Program";
        System.out.printf("%d\n", x); // %d showing decimal form of 10
        System.out.printf("%o\n", x); // %o showing octal form of 10
        System.out.printf("%x\n", x); // %x showing hexadecimal form of 10
        System.out.printf("%f\n", y); // %f showing double form of 12.56
        System.out.printf("%e\n", y); // %e showing scientific form of 12.56
        System.out.printf("%g\n", y); // %g showing float form of 12.56
        System.out.printf("%c\n", z);
        System.out.printf("%s\n", s);
        System.out.printf("%3$s %2$f %1$d", x, y, s); //1$ 2$ are just indexing for more info please check notebook
    }
}