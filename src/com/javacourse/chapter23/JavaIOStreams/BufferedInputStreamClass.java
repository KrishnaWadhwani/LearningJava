package com.javacourse.chapter23.JavaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamClass {
    public static void main(String[] args){
        try(
                FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/StudentChallenges/BufferedInputStreamClass.txt");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // Just connect FileInputStream to BufferedInputStream then continue as it is in FileInputStream using the object of BufferedInputStream
        ){
            /*
            Commented this to run mark
            int x;
            while ((x = bufferedInputStream.read())!=-1){
                System.out.print((char) x);
            }

            // markSupported

            System.out.println("FileInputStream(markSupported): "+fileInputStream.markSupported());
            System.out.println("BufferedInputStream(markSupported): "+bufferedInputStream.markSupported());

            */

            // mark

            System.out.print((char)bufferedInputStream.read()); // L
            System.out.print((char)bufferedInputStream.read()); // e
            System.out.print((char)bufferedInputStream.read()); // a
            bufferedInputStream.mark(10); // after reset, it will start from here
            System.out.print((char)bufferedInputStream.read()); // r
            System.out.print((char)bufferedInputStream.read()); // n
            bufferedInputStream.reset(); // it will go back to mark
            System.out.print((char)bufferedInputStream.read()); // r
            System.out.print((char)bufferedInputStream.read()); // n

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
