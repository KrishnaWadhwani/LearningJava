package com.javacourse.chapter19.Multithreading;

public class Practice_Multithreading_ThreadMethod extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args){

        Practice_Multithreading_ThreadMethod thread = new Practice_Multithreading_ThreadMethod();
        thread.start();

        int i = 1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
