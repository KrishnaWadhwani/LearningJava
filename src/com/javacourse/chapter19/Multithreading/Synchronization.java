package com.javacourse.chapter19.Multithreading;

class MyData{
    // display is now a monitor
    public void display(String str){
        //synchronized (this){
            // critical section & monitor
            for (int i = 0 ; i < str.length() ; i++){
                System.out.print(str.charAt(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        //}
    }
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Hello World");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d = d;
    }
    @Override
    public void run(){
        d.display("Welcome");
    }
}

public class Synchronization {
    public static void main(String[] args){
        MyData data = new MyData();

        MyThread1 t1 = new MyThread1(data);
        MyThread2 t2 = new MyThread2(data);

        t1.start();
        t2.start();

    }
}
