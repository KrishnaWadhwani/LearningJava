package com.javacourse.chapter9.Arrays.StudentChallenges;

public class Increase_Size_Of_An_Array {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9}; // we want to increase the size of this array, debug the code from here to see detailed information
        int[] b = new int[20]; // made a new array :-)
        // copying, array "a" to "b"
        for (int i = 0 ; i < a.length ; i++){
            b[i] = a[i];
        }
        a = b; // then a = b, here we have changed the reference of array b to a
        /*
         {1,2,3,4,5,6,7,8,9} this array is garbage collected
        */
        b = null; // now b = null :-) removed the object created in heap
        a[11] = 4; // just fun :-) assigning 4 to a[11]
        // printing Array "a"
        for (int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }
}
