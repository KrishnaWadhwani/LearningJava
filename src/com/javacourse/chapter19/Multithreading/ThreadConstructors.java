package com.javacourse.chapter19.Multithreading;

class MyRun implements Runnable{
    @Override
    public void run(){

    }
}

class MyThread3 extends Thread{
    public MyThread3(String name){
        super(name);
    }
    @Override
    public void run(){

    }
}

public class ThreadConstructors {
    public static void main(String[] args) throws Exception{
        Thread thread = new Thread("Name");
        Thread thread1 = new Thread(new MyRun());

        MyThread3 t = new MyThread3("MyThread");

    }
}
