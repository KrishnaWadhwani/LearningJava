package com.javacourse.chapter10.Methods;

public class Practising_Object_Passing {
    static void change(int[] a, int index, int value){
        a[index]=value;
    }
    static void change2(int x, int value){
        x = value;
    }
    public static void main(String[] args){
        int A[] = {2,4,6,8,10};
        change(A, 2, 20);
        for (int x : A){
            System.out.println(x);
        }
        int x = 10;
        change2(x, 20);
        System.out.println("Value Of Primitive Datatype \"x\": "+x);
    }
}
