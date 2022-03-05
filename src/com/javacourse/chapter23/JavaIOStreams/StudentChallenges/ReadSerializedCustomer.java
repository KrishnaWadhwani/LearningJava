package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadSerializedCustomer {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/SerializeACustomer.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ){
            // rendering object into array
            int length = objectInputStream.readInt();
            Customer[] list = new Customer[length];

            for (int i = 0; i < length ; i++){
                list[i] = (Customer) objectInputStream.readObject();
            }

            // code for searching the object
            Scanner scin = new Scanner(System.in);
            System.out.println("Enter the name of Customer");
            String name = scin.nextLine();

            for (int i = 0 ; i < length ; i++){
                if (name.equalsIgnoreCase(list[i].name)){
                    System.out.println(list[i]);
                }
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
