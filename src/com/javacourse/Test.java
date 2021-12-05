package com.javacourse;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static ArrayList<String> words;
    public static int spaces = 0;
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);
        String s = scin.nextLine();
        System.out.println(countSpaces(s));
        addWordsInArrayList(s);
        printWords();
    }
    public static int countSpaces(String s){
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).matches(" ")){
                spaces++;
            }
        }
        return spaces;
    }
    public static void addWordsInArrayList(String s){
        String currentWord = "";
        words = new ArrayList<String>(s.length());
        String currentLetter;
        for(int j = 0; j < spaces+1; j++){
            for (int i = 0; i < s.length(); i++){
                currentLetter = String.valueOf(s.charAt(i));
                if(!(currentLetter.matches(" "))) {
                    currentWord += currentLetter;
                }
                else{
                    words.add(currentWord);
                    currentWord = "";
                }
            }
        }
    }
    public static void printWords(){
        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i)+"\n");
        }
    }
}
