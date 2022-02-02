package com.javacourse.chapter14.Interfaces;

interface Doo{
    int X = 10;
    // this will throw error
    // private void meth1();
    void meth2();
    public static void tareekaAKAmethod(){
        System.out.println("tareeka");
    }
    private void privateMethod(){
        System.out.println("Private Method");
    }
    default void defaultMethod(){
        System.out.println("Default Method");
        privateMethod();
    }
}

interface DOo extends Doo{
    void meth4();
}

class DoO implements DOo{

    @Override
    public void meth2() {

    }

    @Override
    public void meth4() {

    }
}

public class DosAndDontsOfInterfaces {
    public static void main(String[] args){
        System.out.println(Doo.X);
        DoO doO = new DoO();
        doO.defaultMethod(); // we are able to access this
    }
}
