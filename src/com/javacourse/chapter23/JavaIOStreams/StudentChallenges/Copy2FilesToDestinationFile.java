package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copy2FilesToDestinationFile {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source1.txt");
                FileInputStream fileInputStream2 = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/Source2.txt");

                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/DestinationFile.txt");

                SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream, fileInputStream2);

                // it will start reading the data from fileInputStream first and then when it finishes it will start reading the data from fileInputStream2
        ){
            int b;
            while ((b = sequenceInputStream.read())!=-1){ // after fileInputStream2 it will become -1
                fileOutputStream.write(b);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
