package com.javacourse.chapter19.Multithreading.Practice;

class Typewriter extends Thread{
    String s;
    int delay;
    public Typewriter(String s, int delay){
        this.s = s;
        this.delay = delay;
    }
    @Override
    public void run(){
        for (int i = 0 ; i < s.length() ; i++){
            System.out.print(s.charAt(i));
            try{
                Thread.sleep(delay);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class TypewriterMultipleLines{
    public static void main(String[] args){
        Typewriter typewriter = new Typewriter("Krishna Wadhwani Is A Good Boy And He Is A Nice Coder Also :-)", 200);
        typewriter.start();
        try{
            typewriter.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        Typewriter typewriter1 = new Typewriter("\nKrishna Wadhwani", 200);
        typewriter1.start();
        try{
            typewriter1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        Typewriter typewriter2 = new Typewriter("\nKrishna Wadhwani", 200);
        typewriter2.start();
        try{
            typewriter2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}