package com.javacourse.chapter25.CollectionFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class TokenizingDataFromDataTxt {
    private static final String DataFilePath = "/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter25/CollectionFramework/StringTokenizerFiles/Data.txt";
    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<>();
        String stringData = "";
        try(FileInputStream fileInputStream = new FileInputStream(DataFilePath)){
            int t;
            while ((t=fileInputStream.read())!=-1){
                stringData+=(char)t;
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        StringTokenizer tokenizer = new StringTokenizer(stringData, ",");
        while (tokenizer.hasMoreElements()){
            // nextToken -> returns String
            // nextElement -> returns Object
            data.add(Integer.parseInt(tokenizer.nextToken()));
        }
        for (Iterator<Integer> iterator = data.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
