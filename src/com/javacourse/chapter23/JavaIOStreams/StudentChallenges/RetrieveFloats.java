package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class RetrieveFloats {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/StoreAndRetrieveFloats.txt");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ){
            int size = dataInputStream.readInt();
            float f[] = new float[size];
            for (int i = 0 ; i < f.length ; i++){
                f[i] = dataInputStream.readFloat();
                System.out.println(f[i]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
