package com.javacourse.TestFiles;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Game{
    private static String bound;
    private static int randomNumber;
    private static int userInput;
    private static int count = 0;
    private static int count1 = 0;
    private static int sumOfTheAverage = 0;
    private static int average = 0;
    private static Random random = new Random();
    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;
    private static Scanner scin = new Scanner(System.in);
    private static final String SCORE_FILE_PATH = "/home/krishna/IdeaProjects/Java Course/src/com/javacourse/TestFiles/Score.txt";
    private static final String AVERAGE_FILE_PATH = "/home/krishna/IdeaProjects/Java Course/src/com/javacourse/TestFiles/Average.txt";

    public static void start(){
        System.out.println("Type \"back\" to go back to Main Menu");
        System.out.print("Enter Bound: ");
        bound = scin.next();
        if (bound.matches("back")){
            mainMenu();
        }
        randomNumber = random.nextInt(Integer.parseInt(bound));

        System.out.println("Guess the number :-) best of luck");
        while (true) {
            System.out.print("Enter the guess("+(count+1)+"): ");
            userInput = scin.nextInt();
            if (userInput == randomNumber) {
                count++;
                System.out.println("Yeah you have guessed it right in " + count + " times");
                if (count < Integer.parseInt(getHiScore())) {
                    writeHiscore(count);
                    System.out.println("New record made by you: "+count);
                }
                setAverage(count);
                count = 0;
                mainMenu();
            } else if (userInput > randomNumber) {
                System.out.println("Decrease the input");
            } else if (userInput < randomNumber) {
                System.out.println("Increase the input");
            }
            count++;
        }
    }
    public static void hiscore(){
        System.out.println("Your High Score: "+getHiScore());
        mainMenu();
    }
    public static void average(){
        System.out.println("Your Average: "+getAverage());
        sumOfTheAverage = 0;
        count1 = 0;
        mainMenu();
    }
    public static void predict(){
        getAverage();
        System.out.println("Prediction about you Average after next game: "+(sumOfTheAverage+average)/++count1);
        mainMenu();
    }
    public static void sum(){
        getAverage();
        System.out.println("Sum of your scores: "+sumOfTheAverage);
        sumOfTheAverage = 0;
        count1 = 0;
        mainMenu();
    }
    public static void count(){
        getAverage();
        System.out.println("Count of your scores: "+count1);
        sumOfTheAverage = 0;
        count1 = 0;
        mainMenu();
    }
    public static String getAverage(){
        try{
            int t = 0;
            FileReader reader = new FileReader(AVERAGE_FILE_PATH);
            String currentNumber = "";
            int[] avg;
            int i = 0;
            while((t = reader.read())!=-1){
                if ((char) t == '\n'){
                    count1++;
                }
            }
            avg = new int[count1];
            reader.close();
            FileReader reader1 = new FileReader(AVERAGE_FILE_PATH);
            while((t = reader1.read())!=-1){
                if ((char) t == '\n'){
                    avg[i] = Integer.parseInt(currentNumber);
                    currentNumber = "";
                    i++;
                }
                else{
                    currentNumber+=(char)t;
                }
            }
            for (int x : avg){
                sumOfTheAverage+=x;
            }
            if (count1!=0){
                average = sumOfTheAverage/count1;
            }
            else{
                System.out.println("Please play the game at-least once to set some records! after that you will get your \"average\" score");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return String.valueOf(average);
    }
    public static void setAverage(int count){
        try(FileWriter writer = new FileWriter(AVERAGE_FILE_PATH, true);){
            writer.append(count+"\n");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static String getHiScore(){
        int t;
        String score = "";
        try{
            fileInputStream = new FileInputStream(SCORE_FILE_PATH);
            while ((t=fileInputStream.read())!=-1){
                score+=(char)t;
            }
            fileInputStream.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return score;
    }
    public static void exit(){
        System.out.println("Thank you for playing perfect guess");
        System.exit(0);
    }
    public static void mainMenu(){
        System.out.print(">>> ");
        String input = scin.next();
        switch (input){
            case "start":
                start();
                break;
            case "hiscore":
                hiscore();
                break;
            case "average":
                average();
                break;
            case "predict":
                predict();
                break;
            case "sum":
                sum();
                break;
            case "count":
                count();
                break;
            case "exit":
                exit();
                break;
            default:
                System.out.println("incorrect input");
                mainMenu();
                break;
        }
    }
    public static void writeHiscore(int score){
        try{
            fileOutputStream = new FileOutputStream(SCORE_FILE_PATH);
            fileOutputStream.write(String.valueOf(score).getBytes());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void showMenuItems(){
        System.out.println("Welcome to perfect guess");
        System.out.println("Here the objective is to find the hidden number by the help of the hints provided");
        System.out.println("Type \"start\" to Start the game");
        System.out.println("Type \"hiscore\" to see the High Score");
        System.out.println("Type \"average\" to see the Average");
        System.out.println("Type \"predict\" to see prediction about 'your Average after next game'");
        System.out.println("Type \"sum\" to see Sum of your scores");
        System.out.println("Type \"count\" to see Count of your scores");
        System.out.println("Type \"exit\" to Exit the game");
    }
    public static void main(String[] args){
        showMenuItems();
        mainMenu();
        scin.close();
    }
}