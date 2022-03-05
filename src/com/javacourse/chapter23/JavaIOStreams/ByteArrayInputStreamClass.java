package com.javacourse.chapter23.JavaIOStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamClass {
    public static void main(String[] args){
        byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);

        // read one byte at a time
        int x;
        while ((x=byteArrayInputStream.read())!=-1){
            System.out.print((char)x);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read complete byte array
        String s = new String(byteArrayInputStream.readAllBytes());
        System.out.println(s);

        // check if markIsSupported
        System.out.println(byteArrayInputStream.markSupported());

    }
}
