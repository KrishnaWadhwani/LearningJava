package com.javacourse.chapter25.CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
// It is better to not use this class
public class HashTableLegacyClass {
    public static void main(String[] args){
        Hashtable<Integer, String> hashtable = new Hashtable<>(); // this class was not generic first
        // later when the concept of generic came then this class was converted to generic

        hashtable.put(1, "A");
        hashtable.put(2, "B");
        hashtable.put(3, "C");
        hashtable.put(4, "D");
        hashtable.put(5, "E");

        String s = (String)hashtable.get(3);

        hashtable.compute(2, (k, v)->v+"Z"+k);
        hashtable.computeIfAbsent(2, (k)->"ThisIsAKey"+k);

        Enumeration enumeration = hashtable.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println(hashtable);
    }
}
