package com.javacourse.chapter19.Multithreading;

public class Practice_ImplementsRunnable_UsingMethod implements Runnable{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args){
        Practice_ImplementsRunnable_UsingMethod runnable = new Practice_ImplementsRunnable_UsingMethod();
        Thread thread = new Thread(runnable);
        thread.start();
        int i = 1;
        for (;true; i++){
            System.out.println(i+" World");
        }
    }
}
