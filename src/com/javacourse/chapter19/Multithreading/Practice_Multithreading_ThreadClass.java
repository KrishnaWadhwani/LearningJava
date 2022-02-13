package com.javacourse.chapter19.Multithreading;

class MyThread extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class Practice_Multithreading_ThreadClass{
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();

        int i = 1;
        while (true){
            System.out.println(i+" World");
            i++;
        }
    }
}