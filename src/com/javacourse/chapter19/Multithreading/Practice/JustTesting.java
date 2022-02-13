package com.javacourse.chapter19.Multithreading.Practice;

class Timer extends Thread{
    int seconds = 0;
    int minutes = 0;
    @Override
    public void run(){
        System.out.println("Program Is Running For: ");
        while (true){
            seconds++;
            if(seconds % 60 == 0){
                minutes++;
                seconds = 0;
            }
            System.out.println(minutes+" Minutes "+seconds+" Seconds");

            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class JustTesting {
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.start();
    }
}
