package com.javacourse.chapter19.Multithreading.Practice;

// consumer -> true
// producer -> false

class Data{
    boolean flag = false; // starts with producer
    int count = 0;

    synchronized public int getCount() { // consumer
        while (flag == false){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }



        // runs when flag == true
        flag = false;
        notify();
        return count;
    }

    synchronized public void setCount(int count) { // producer
        while (flag == true){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }



        // runs when flag == false
        flag = true;
        this.count = count;
        notify();
    }
}

class Producer extends Thread{
    Data data;
    int count = 0;
    public Producer(Data data) {
        this.data = data;
    }
    @Override
    public void run(){
        while (true){
            count++;
            System.out.println("Producer: "+count);
            data.setCount(count);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread{
    Data data;
    public Consumer(Data data){
        this.data = data;
    }
    @Override
    public void run(){
        while (true){
            System.out.println("Consumer: "+data.getCount());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Shop{
    public static void main(String[] args){
        Data data = new Data();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}