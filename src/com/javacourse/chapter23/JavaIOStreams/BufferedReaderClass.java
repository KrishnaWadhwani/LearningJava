package com.javacourse.chapter23.JavaIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderClass {
    public static void main(String[] args){
        try(
                // These both are used for characters
                // when we really have unicode these are very useful
                // If we have just bytes -> means ASCII codes we can use BufferedInputStream
                FileReader fileReader = new FileReader("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/BufferedReaderClass.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){

            System.out.print((char)bufferedReader.read()); // L
            System.out.print((char)bufferedReader.read()); // e
            System.out.print((char)bufferedReader.read()); // a
            bufferedReader.mark(10); // after reset, it will start from here
            System.out.print((char)bufferedReader.read()); // r
            System.out.print((char)bufferedReader.read()); // n
            bufferedReader.reset(); // it will go back to mark
            System.out.print((char)bufferedReader.read()); // r
            System.out.print((char)bufferedReader.read()); // n

            System.out.println(bufferedReader.readLine()); // read the whole file

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
