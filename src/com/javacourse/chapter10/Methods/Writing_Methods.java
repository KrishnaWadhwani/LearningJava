package com.javacourse.chapter10.Methods;

public class Writing_Methods {
    static void inc(int x){
        x++;
        System.out.println("formal param: "+x);
    }
    static int max(int x, int y){
        if (x > y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args){
        int a = 15, b = 15;
        Writing_Methods wp = new Writing_Methods(); // make object of the class, to call non-static methods
        System.out.println(wp.max(a, b)); // printing result
        System.out.println(max(a, b));
        inc(a);
        System.out.println("actual param: "+a);
    }
}
