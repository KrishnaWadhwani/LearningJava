package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaFileIOWithOutputStream {
    public static void main(String[] args){
        // we can use this with try-with resources also
        try{
            FileOutputStream fos = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/JavaFileIO.txt");
            String str = "Learn Java Programming";

            byte[] b = str.getBytes();
            // writes 1 byte at a time in file
            for (byte x : b){
                fos.write(x);
            }
            fos.write("\n".getBytes()); // just changing line, nothing else
            // writes in a single shot
            fos.write(str.getBytes());

            fos.write("\n".getBytes()); // just changing line, nothing else

            fos.write(str.getBytes(), 6, str.length() - 6);

            fos.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
