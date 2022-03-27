package com.javacourse.chapter25.CollectionFramework;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<>(20, 0.25F);

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // here we duplicated 10, but it is not inserted :-)

        System.out.println(hashSet);
    }
}
