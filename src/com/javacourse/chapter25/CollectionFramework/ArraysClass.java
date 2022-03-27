package com.javacourse.chapter25.CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;

class MyNewComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2){
        if (i1<i2){
            return 1;
        }
        if (i1>i2){
            return -1;
        }
        return 0;
    }
}
public class ArraysClass {
    public static void main(String[] args){
        int[] a = {2,4,6,8,1,3,5,7};
        int[] b = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(a, b));
        // return 0 if both the arrays are equal
        // -value means that the second array is greater than the first array 'value' times
        // +value means that the first array is greater than the second array 'value' times

        int[] c = Arrays.copyOf(a, a.length);
        Arrays.fill(c, 10); // this method will fill entire array with the same value
        Arrays.sort(c); // this method will sort the array
        // if we sort elements like this without giving any comparator then comparable interface will be used
        // for sorting comparison of elements is very important
        System.out.println(Arrays.binarySearch(a, 2)); // binary search can only work on sorted arrays
        for (int x : c){
            System.out.println(x);
        }
        // mismatch() method will tell from which index elements are started mismatching



        // Using Comparator

        Integer[] newArray = {10, 20, 30, 40};
        Arrays.sort(newArray, new MyNewComparator()); // comparator is a generic class that's why it cannot handle int, so we made and Integer array

        for (Integer x : newArray){
            System.out.println(x);
        }

    }
}
