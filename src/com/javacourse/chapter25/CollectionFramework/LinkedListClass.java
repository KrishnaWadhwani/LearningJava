package com.javacourse.chapter25.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>(List.of(50,60,70,80,90));

        linkedList.add(10);
        linkedList.add(0, 5);
        linkedList.addAll(linkedList1);
        linkedList.add(5, 70);

        linkedList.set(6, 100);

        // these methods are in LinkedList because it is implementing Deque interface
        linkedList.addFirst(3); // this will be inserted at the first
        linkedList.addLast(200); // this will be inserted at the last

        linkedList.forEach(System.out::println);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        // linkedList.forEach(System.out::println);

        // linked list also have descending iterator to go from right to left
        for (Iterator<Integer> iterator = linkedList.descendingIterator() ; iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

        System.out.println(linkedList.peek()); // peek will show the first element
        linkedList.poll(); // poll will remove the first element
    }
}
