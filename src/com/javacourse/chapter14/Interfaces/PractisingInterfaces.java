package com.javacourse.chapter14.Interfaces;

interface Test{
    void meth1();
    void meth2();
}

class My implements Test{

    @Override
    public void meth1(){
        System.out.println("Meth1 Of Class My");
    }

    @Override
    public void meth2(){
        System.out.println("Meth2 Of Class My");
    }

    public void meth3(){
        System.out.println("Meth3 Of Class My");
    }

}

public class PractisingInterfaces {
    public static void main(String[] args){
        Test test = new My();
        test.meth1();
        test.meth2();

        My my = new My();
        my.meth1();
        my.meth2();
        my.meth3();
    }
}
