package com.javacourse.chapter18.ExceptionHandling;

public class PropagationOfException {
    static int meth1(){
        System.out.println("Meth1");
        return 10/0;
    }
    static void meth2(){
        meth1();
        System.out.println("Meth2");
    }
    static void meth3(){
        meth2();
        System.out.println("Meth3");
    }
    public static void main(String[] args){
        try{
            meth3();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
