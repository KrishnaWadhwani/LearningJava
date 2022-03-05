package com.javacourse.chapter23.JavaIOStreams;

import java.io.RandomAccessFile;

public class RandomAccessFileClass {
    public static void main(String[] args){

        // ABCDEFGHIJKLMNOPQRSTUVWXYZ
        // 0123

        // the second param is the mode in which we want to open the file, here "rw" means read & write both
        // r -> read
        // w -> write
        // rw -> read write
        // to use this we should have the perfect idea of the file where is this and that
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/RandomAccessFileClass.txt", "rw");) {
            System.out.println((char) randomAccessFile.read()); // A
            System.out.println((char) randomAccessFile.read()); // B
            System.out.println((char) randomAccessFile.read()); // C
            // now the pointer is pointing on "D", now we will perform write operation
            randomAccessFile.write('d'); // After writing "d" the file pointer has moved to "E", that's why in the next line it will write "E"
            System.out.println((char) randomAccessFile.read()); // E
            randomAccessFile.skipBytes(3); // it will skip 3 bytes, so the current pointer is on "F" so from "F" it will skip 3 bytes "F", "G", "H", now the pointer is on "I"
            System.out.println((char) randomAccessFile.read()); // I
            // now I want to print "d", "d" is on 3rd index
            randomAccessFile.seek(3); // now the pointer is on index 3 means it is on "d"
            // lets print
            System.out.println((char) randomAccessFile.read()); // now after reading the file pointer is on "E"
            System.out.println(randomAccessFile.getFilePointer()); // it will tell where the file pointer is currently pointing, it is on 4
            randomAccessFile.seek(randomAccessFile.getFilePointer()+2); // we can move file pointer like this also
            System.out.println((char) randomAccessFile.read()); // the file pointer is on 4 -> "E" now 4+2=6+1=7 now it is on 7 -> "G"
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
