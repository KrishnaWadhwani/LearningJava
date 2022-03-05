package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile1 {
    public static void main(String[] args){
        try(FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source2.txt")
        ){
            int x;
            while ((x = fileInputStream.read())!=-1){
                if (x>=65 && x<=90){ // if ASCII code of "x" lies between 65 and 90 it means that it is in capital letters
                    fileOutputStream.write(x+32); // by adding 32 we will make it smaller
                }
                else{
                    fileOutputStream.write(x);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
