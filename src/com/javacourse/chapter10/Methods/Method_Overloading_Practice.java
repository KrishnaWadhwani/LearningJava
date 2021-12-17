package com.javacourse.chapter10.Methods;

public class Method_Overloading_Practice {
    static int max (int x, int y){
        return x > y ? x : y;
    }
    static byte max (byte x, byte y){
        return x > y ? x : y;
    }
    static float max(float x, float y){
        return x > y ? x : y;
    }
    static double max(double x, double y){
        return x > y ? x : y;
    }
    static int max(int x, int y, int z){
        return (x > y && x > z) ? x : (y > z ? y : z);
    }
    public static void main(String[] args){
        System.out.println(max(10, 5, 20));
        byte x = 10, y = 5;
        System.out.println(max(x, y));
    }
}
