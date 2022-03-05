package com.javacourse.chapter23.JavaIOStreams;

import java.io.FileOutputStream;

public class JavaFileIOTryWithResourcesWithOutputStream {
    public static void main(String[] args) {
        //try with resources will automatically close FileOutputStream
        //.close();
        try(FileOutputStream fileOutputStream = new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter23/JavaIOStreams/Files/JavaFileIOTryWithResources")){
            String message = "Hello, I am Krishna Wadhwani, currently learning to code :-), I guess you also, [Same Pinch]";
            fileOutputStream.write(message.getBytes());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
