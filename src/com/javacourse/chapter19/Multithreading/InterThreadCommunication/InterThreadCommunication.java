package com.javacourse.chapter19.Multithreading.InterThreadCommunication;

class MyData{
    int value;
    boolean flag = true;

    synchronized public void set(int v){
        while (flag!=true){
            try{
                wait();
            }
            catch (Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }
    synchronized public int get(){
        int x = 0;
        while (flag!=false){
            try{
                wait();
            }
            catch (Exception e){}
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread{
    MyData data;
    public Producer(MyData d){
        data = d;
    }
    @Override
    public void run(){
        int count = 0;
        while (true){
            data.set(count);
            System.out.println("Producer: "+count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData data;
    public Consumer(MyData d){
        data = d;
    }
    @Override
    public void run(){
        int value;
        while (true){
            value = data.get();
            System.out.println("Consumer: "+value);
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args){
        MyData data = new MyData();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();

    }
}
