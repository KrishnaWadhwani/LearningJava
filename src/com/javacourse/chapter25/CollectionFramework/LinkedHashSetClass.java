package com.javacourse.chapter25.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(10);

        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("E");
        linkedHashSet.add("K");
        linkedHashSet.add("B");
        linkedHashSet.add("G");

        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
