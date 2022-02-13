package com.javacourse.chapter19.Multithreading;

class MyTestThread extends Thread{
    @Override
    public void run(){
        int count = 1;
        while (true){
            System.out.println(count++ + "MyTestThread");
        }
    }
}

public class Yield {
    public static void main(String[] args){
        MyTestThread thread = new MyTestThread();
        thread.start();
        int count = 1;
        while (true){
            System.out.println(count++ + "Main");
        }
    }
}
