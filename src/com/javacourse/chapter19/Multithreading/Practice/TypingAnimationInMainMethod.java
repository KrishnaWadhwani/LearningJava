package com.javacourse.chapter19.Multithreading.Practice;

public class TypingAnimationInMainMethod {
    public static void main(String[] args){
        String textToAnimate = "Krishna Wadhwani Is The Best Programmer";
        int delayInMillis = 500;

        for (int i = 0 ; i < textToAnimate.length() ; i++){
            System.out.print(textToAnimate.charAt(i));
            try{
                Thread.sleep(delayInMillis);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}