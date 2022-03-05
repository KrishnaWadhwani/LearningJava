package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileInputStream;

public class JavaFileIOWithInputStream {
    public static void main(String[] args){
        try(FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/JavaFileIO.txt")){
            // read all bytes at same time
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            String str = new String(b);
            System.out.println(str);

            // read bytes letter by letter using do while loop
            int x;
            do{
                x = fileInputStream.read();
                if (x!=-1){
                    System.out.print((char)x);
                }
            }while (x!=-1);

            // read bytes letter by letter using while loop
            int y;
            while ((y=fileInputStream.read())!=-1){
                System.out.print((char) y);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
