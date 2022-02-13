package com.javacourse.chapter19.Multithreading;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class Practice_ImplementsRunnable_UsingClass {
    public static void main(String[] args){
        MyRunnable t = new MyRunnable();
        Thread thread = new Thread(t);
        thread.start();

        int i = 1;
        while (true){
            System.out.println(i+" World");
            i++;
        }
    }
}
