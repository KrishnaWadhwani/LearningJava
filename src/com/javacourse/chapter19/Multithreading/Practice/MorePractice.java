package com.javacourse.chapter19.Multithreading.Practice;

import java.util.Scanner;

class WordChecker extends Thread{
    Scanner scin = new Scanner(System.in);
    public void getWord(){
        System.out.println("com.javacourse.chapter23.JavaIOStreams.TestFiles.Test");
    }
    @Override
    public void run(){
        scin.nextLine();
        while (true){
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            getWord();
        }
    }
}

public class MorePractice{
    public static void main(String[] args){
        WordChecker wordChecker = new WordChecker();
        wordChecker.start();
    }
}