package com.javacourse.chapter25.CollectionFramework;

import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args){
        // We can take reference of those interfaces which are implemented by TreeSet

        TreeSet<Integer> treeSet = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        treeSet.add(25);
        System.out.println(treeSet.ceiling(55));
        System.out.println(treeSet);
    }
}
