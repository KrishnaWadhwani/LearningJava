package com.javacourse.chapter19.Multithreading;

class Daemon extends Thread{
    @Override
    public void run(){
        int count = 1;
        while (true){
            System.out.println(count++ + "Daemon");
        }
    }
}

public class DaemonClass {
    public static void main(String[] args){
        Daemon daemon = new Daemon();
        daemon.setDaemon(true);
        daemon.start();

        /*try {
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }*/

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
