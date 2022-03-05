package com.javacourse.chapter23.JavaIOStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamClass {
    public static void main(String[] args){
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20)){
            byteArrayOutputStream.write('A');
            byteArrayOutputStream.write('B');
            byteArrayOutputStream.write('C');
            byteArrayOutputStream.write('D');

            byte[] b = byteArrayOutputStream.toByteArray();
            for (byte x : b){
                System.out.println((char) x);
            }

            byteArrayOutputStream.writeTo(new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/ByteArrayOutputStream.txt"));

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
