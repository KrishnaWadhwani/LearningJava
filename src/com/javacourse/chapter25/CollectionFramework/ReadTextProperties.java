package com.javacourse.chapter25.CollectionFramework;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class ReadTextProperties {
    public static void main(String[] args){
        Properties p = new Properties();
        try{
            p.load(new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/Properties/PropertiesClassTextFile.txt"));
            System.out.println(p.getProperty("Processor"));
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
