package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileReader;

public class FileReaderClass {
    public static void main(String[] args){
        try(FileReader fileReader = new FileReader("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/JavaFileIO.txt")) {
            int x;
            while ((x = fileReader.read())!=-1){
                System.out.print((char) x);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
