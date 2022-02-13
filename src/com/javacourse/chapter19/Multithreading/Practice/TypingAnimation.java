package com.javacourse.chapter19.Multithreading.Practice;

class TypingBot extends Thread{
    String textToAnimate;
    int delayInMilliSeconds;
    public TypingBot(String s, int delayInMilliSeconds){
        this.textToAnimate = s;
        this.delayInMilliSeconds = delayInMilliSeconds;
    }
    @Override
    public void run(){
        for (int i = 0 ; i < textToAnimate.length() ; i++){
            System.out.print(textToAnimate.charAt(i));
            try{
                Thread.sleep(delayInMilliSeconds);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class TypingAnimation {
    public static void startAnimation(String textToAnimate, int waitForMillis){
        TypingBot typingBot = new TypingBot(textToAnimate, waitForMillis);
        typingBot.isDaemon();
        typingBot.start();

        Thread currentThread = Thread.currentThread();
        try{
            currentThread.join(waitForMillis);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        startAnimation("Krishna Wadhwani Is The Best Programmer", 500);
    }
}
