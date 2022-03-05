package com.javacourse.chapter23.JavaIOStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileClass {
    public static void main(String[] args){
        File file = new File("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/TestFiles/");
        System.out.println(file.isDirectory()); // if it is a directory or not
        String[] list = file.list();

        for (String x : list){
            System.out.println(x);
        }

        File[] files = file.listFiles();
        for (File x : files){
            x.setReadOnly();
            System.out.println(x.getName()+" "+x.getPath());
            try {
                // it will not able to open the file cause the file is readonly
                FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/TestFiles/PrivateData.txt");
                x.setWritable(true);
                x.setReadable(true);
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
