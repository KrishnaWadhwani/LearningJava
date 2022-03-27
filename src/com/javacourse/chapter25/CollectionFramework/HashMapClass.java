package com.javacourse.chapter25.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args){
        HashMap<String, Integer> StudentRollNumbers = new HashMap<>(Map.of(
                "Krishna", 39,
                "Ramesh", 40,
                "Drake", 41
        ));

        StudentRollNumbers.get("Krishna");
    }
}
