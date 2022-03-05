package com.javacourse.chapter23.JavaIOStreams.Serialization;

import java.io.*;

public class SerializationObjectInputStream {
    public static void main(String[] args){
        try{
            FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/Serialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        }
        catch (Exception e){

        }
    }
}
