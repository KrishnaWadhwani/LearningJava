package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileWriter;

public class FileWriterClass {
    public static void main(String[] args){
        // write using write();
        try(FileWriter fileWriter = new FileWriter("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/FileWriter.txt")){
            String toWrite = "Krishna Wadhwani";
            /*
            method using byte array and while loop

            byte[] b = toWrite.getBytes();
            for (byte x : b){
                fileWriter.write(x);
            }
            */

            // easy method
            fileWriter.write(toWrite);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
