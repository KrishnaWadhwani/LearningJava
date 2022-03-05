package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args){
        try(FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source2.txt")
        ){
            String copiedText = "";
            int x;
            while ((x = fileInputStream.read())!=-1){
                copiedText+=(char)x;
            }

            fileOutputStream.write(copiedText.toLowerCase().getBytes());
        }
        catch (Exception e){

        }
    }
}
