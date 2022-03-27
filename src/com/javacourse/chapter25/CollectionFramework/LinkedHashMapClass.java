package com.javacourse.chapter25.CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5, .75F, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3, "C");
        linkedHashMap.put(4, "D");
        linkedHashMap.put(5, "E");
        /*linkedHashMap.put(6, "F");
        linkedHashMap.put(9, "I");
        linkedHashMap.put(8, "H");*/

        linkedHashMap.get(2);
        linkedHashMap.get(5);
        linkedHashMap.get(1);

        linkedHashMap.put(6, "F");

        // now the access order is true

        linkedHashMap.forEach((k, v)-> System.out.println(k+" "+v));
        // it will show the values in order of least used to most used
    }
}
