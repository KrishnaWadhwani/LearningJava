package com.javacourse.chapter5.Operators_And_Expressions;

public class PracticeArithmeticOperators {
    public static void main(String[] args){
        int a = 14, b = 5;
        int c = a/b;
        float d = (float)a/b;
        int d1 = a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(d1);
        /*-------------------*/
        float e = 14.3F, f = 3.2F;
        float g = e%f;
        System.out.println(g);
        /*-------------------*/
        byte h = 10;
        short i = 15;

        int j = h+i;
        System.out.println(j);
        /*-------------------*/
        float k = 12.3F;
        long l = 123L;

        // long m = k*l; // will give error cause output will be float

        float m = k*l;
        System.out.println(m);
        /*------------------*/

        float n = 12.3f;
        double o = 123D;

        // float p = n*o;

        double p = n*o;
        System.out.println(p);

        /*---------------------*/
        char q = 40;
        int r = 30;

        int s = a-b;
        System.out.println(s);
    }
}
