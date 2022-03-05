package com.javacourse.chapter23.JavaIOStreams.StudentChallenges;

import java.io.CharArrayWriter;

public class CharArrayWriterClass {
    public static void main(String[] args){
        try(CharArrayWriter charArrayWriter = new CharArrayWriter()){
           charArrayWriter.write('A');
           charArrayWriter.write('B');
           charArrayWriter.write('C');
           charArrayWriter.write('D');

           char[] chars = charArrayWriter.toCharArray();
           for (int x : chars){
               System.out.println((char) x);
           }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
