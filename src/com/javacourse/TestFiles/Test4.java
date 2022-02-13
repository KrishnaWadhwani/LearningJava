package com.javacourse.TestFiles;

class My extends Thread{
    int i = 1;
    @Override
    public void run(){
        while (true){
            i++;
        }
    }
}

class My1 extends Thread{
    int i = 1;
    @Override
    public void run(){
        while (true){
            i++;
        }
    }
}

public class Test4{
    public static void main(String[] args){
        My my = new My();
        My1 my1 = new My1();

        my.start();
        my1.start();

        int i = 1;

        while (true){
            i++;
            System.out.println(i+my.i+my1.i);
        }
    }
}