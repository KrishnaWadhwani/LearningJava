package com.javacourse.chapter25.CollectionFramework;

import java.util.Properties;
import java.io.*;

public class PropertiesClass {
    public static void main(String[] args){
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i3");
        p.setProperty("OS", "Linux");
        p.setProperty("Model", "Inspiron");

        try{
            p.store(new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/Properties/PropertiesClassTextFile.txt"), "Laptop");
            p.storeToXML(new FileOutputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/Properties/PropertiesClassTextFile.xml"), "Laptop");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
