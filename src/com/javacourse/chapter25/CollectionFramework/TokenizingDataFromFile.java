package com.javacourse.chapter25.CollectionFramework;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class TokenizingDataFromFile {
    public static void main(String[] args){
        try{
            // taking data from the file
            String data = "";
            FileInputStream fileInputStream = new FileInputStream("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/StringTokenizerFiles/Student.txt");
            int t;
            while ((t=fileInputStream.read())!=-1){
                data+=(char)t;
            }
            // closing the data input stream
            fileInputStream.close();

            // using StringTokenizer we are tokenizing the elements
            StringTokenizer stringTokenizer = new StringTokenizer(data, "=");
            while (stringTokenizer.hasMoreElements()){
                System.out.println(stringTokenizer.nextElement());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
