package com.javacourse.chapter19.Multithreading;

class TestThread extends Thread {
    public TestThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        int count = 1;
        while (true){
            count++;
            if (count%60==0){
                System.out.println(count/60);
            }
            try {
                Thread.sleep(1000); // 1 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {

        TestThread t = new TestThread("MyThread");
        System.out.println("Id: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("Is Alive: "+t.isAlive());

        t.start();
    }
}
