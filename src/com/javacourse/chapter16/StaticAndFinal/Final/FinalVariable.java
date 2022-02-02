package com.javacourse.chapter16.StaticAndFinal.Final;

public class FinalVariable {
    static final float PI = 3.1425f;

    /*
    Error
    final float MAX;
    MAX = 10;
    */

    final int TEST;

    {
        TEST = 10;
    }

    static final int MAX;

    static{
        MAX = 10;
    }

    /*
    Error
    static final int MAX;

    {
        MAX = 10;
    }
    */

    /*
    Error
    final int JAVA;

    static{
        JAVA = 10;
    }
    */
    final int NORMAL = 10;
    final String NAME;
    public FinalVariable(){
        NAME = "Krishna";
    }
    public static void main(String[] args) {
        System.out.println(PI);

        final int MIN;
        MIN = 10;
        System.out.println(MIN);

        //System.out.println(NORMAL); //Error
    }
}
