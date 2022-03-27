package com.javacourse.chapter25.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeClass {
    public static void main(String[] args){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offerLast(10);
        arrayDeque.offerLast(20);
        arrayDeque.offerLast(30);
        arrayDeque.offerLast(40);

        arrayDeque.pollLast(); // Last In First Out (LIFO) -> Stack

        // now poll last will remove elements from last of the array
        // [10, 20, 30, 40] // in this case 40 will be out

        // here arrayDeque is acting like a Queue, First In First Out(FIFO)
        arrayDeque.pollFirst(); // offerLast will insert from last
        // pollFirst will remove elements from the first element

        // 10 came first, 10 went out first
        // deleting(pollFirst) <- [10, 20, 30, 40] <- inserting(offer last)


        // Vice-Versa of the above
        // inserting first and deleting first it is a stack
        // inserting first and deleting last it is a queue
        /*
        arrayDeque.offerFirst(1);
        arrayDeque.offerFirst(2);
        arrayDeque.offerFirst(3);
        arrayDeque.offerFirst(4);
        */

        arrayDeque.forEach(System.out::println);
    }
}
