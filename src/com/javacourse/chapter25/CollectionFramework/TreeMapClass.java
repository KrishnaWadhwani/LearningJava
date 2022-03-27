package com.javacourse.chapter25.CollectionFramework;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapClass {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        treeMap.put(4, "E");
        treeMap.put(5, "F");

        System.out.println(treeMap);

        System.out.println(treeMap.ceilingEntry(5)); // this will give the entry at "5" -> 5=F
        System.out.println(treeMap.ceilingEntry(5).getValue()); // this will give the value at "5" -> F

        // What if 5 is not present there??
        // it will give the next greater value
        // ceil means it will give greater than or equal value, equal value -> value is present, greater value -> value is not present

        System.out.println(treeMap.firstEntry().getValue());

        // Get value from TreeMap

        System.out.println(treeMap.get(3));

        // Most commonly method used are
        // get() and put()

        Entry<Integer, String> entry = treeMap.firstEntry();
        System.out.println(entry.getKey()+" "+ entry.getValue());

    }
}
