package com.javacourse.chapter7.ConditionalStatements.StudentChallenge;

import java.util.Scanner;

public class Young_Or_Not {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scin.nextInt();
        if(age<14){
            System.out.println("Boii, Enjoy your life you are just a kid");
        }
        else if(age>=14&&age<=55){
            System.out.println("Haha, You are a young person");
        }
        else{
            System.out.println("Its time to retire, if you want to, else it depends on you that you are young or not, bill gates, jeff bezos, elon musk, ratan tata are still working :-)");
        }
    }
}
