package com.javacourse.chapter20.JavaLangPackage.WrapperClasses.FloatWrapper;

public class FloatWrapper {
    public static void main(String[] args){
        float a = 12.5f;
        Float b = 12.5f;
        Float infinite = 55.5f/0;
        Float negativeInfinite = -55.5f/0;
        // NaN -> Not A Number
        Float NaN = (float)Math.sqrt(-1);

        System.out.println(b.equals(a));
        // Check if number is infinite
        System.out.println(infinite.isInfinite()); // divide by 0 means infinite
        System.out.println(Float.POSITIVE_INFINITY == infinite); // divide by 0 means infinite
        System.out.println(Float.NEGATIVE_INFINITY == negativeInfinite); // divide by 0 means infinite

        // Check If NaN
        System.out.println(NaN.isNaN());
        System.out.println(NaN != Float.NaN); // It will only give right value by using != (Not Equals)

        System.out.println(Float.NaN == Float.NaN); // -> False
        System.out.println(Float.NaN != Float.NaN); // -> True

    }
}
