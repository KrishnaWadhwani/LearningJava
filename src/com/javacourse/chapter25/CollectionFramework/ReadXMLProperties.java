package com.javacourse.chapter25.CollectionFramework;

import java.util.*;
import java.io.*;

public class ReadXMLProperties {
    public static void main(String[] args){
        Properties p = new Properties();
        try{
            p.loadFromXML(new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/Properties/PropertiesClassTextFile.xml"));
            System.out.println(p.getProperty("Brand"));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
