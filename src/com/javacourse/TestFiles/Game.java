package com.javacourse.TestFiles;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        int score = 1;
        Scanner scin = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter bound: ");
        int f = scin.nextInt();
        int t = random.nextInt(f);
        int userIn;
        System.out.println("Game has started");
        while (true){
            userIn = scin.nextInt();
            if (
                    userIn>t){
                score++;
                System.out.println(userIn+" is greater than the hidden number");
            }
            if (userIn<t){
                score++;
                System.out.println(userIn+" is lesser than the hidden number");
            }
            if (userIn==t){
                System.out.println("you have won: "+score);
                System.exit(214);
            }
        }
    }
}
