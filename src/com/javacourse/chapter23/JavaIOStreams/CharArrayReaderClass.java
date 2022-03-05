package com.javacourse.chapter23.JavaIOStreams;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderClass {
    public static void main(String[] args){
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        try(CharArrayReader charArrayReader = new CharArrayReader(c)) {
            int x;

            while ((x = charArrayReader.read())!=-1){
                System.out.println((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
