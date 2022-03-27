package com.javacourse.chapter25.CollectionFramework;

import java.util.*;

public class StringTokenizerClass {
    public static void main(String[] args){
        // String Tokenizing is a process where a String is broken into several parts
        String data = "name=Krishna;address=Haryana;country=India;dept=CSE";
        // this data variable is having key value pair in a String
        // key and the value are separated by "="
        // a pair is separated by ";"
        // in this String "name" is a token
        // "Krishna" is a token
        // "address" is a token
        // "India" is a token
        // and so on

        // "=" and ";" are called as delimiters
        // if a String is having some data separated by delimiters then we can take out the data in the form of tokens
        // "\n" works as a delimiter in between Strings

        StringTokenizer stringTokenizer = new StringTokenizer(data, "=;"); // 2nd param is of delimiters each char here is treated as a delimiter
        String s;
        while (stringTokenizer.hasMoreElements()){
            s = stringTokenizer.nextToken();
            System.out.println(s);
        }
    }
}
