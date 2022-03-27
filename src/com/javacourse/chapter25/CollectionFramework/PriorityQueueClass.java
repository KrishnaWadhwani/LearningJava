package com.javacourse.chapter25.CollectionFramework;

import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Comparator;


// Defining Comparator

class MyComparator implements Comparator<Integer>{
    // this comparator will make larger value priority high and smaller value priority less
    @Override
    public int compare(Integer o1, Integer o2){
        if(o1<o2){
            return 1;
        }
        if (o1>o2){
            return -1;
        }
        return 0;
    }
}

public class PriorityQueueClass {
    public static void main(String[] args){
        // after defining comparator
        // we have to pass it here in PriorityQueue constructor
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new MyComparator());
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(3);

        System.out.println("Root element"); // the element which have the highest priority in this case we have defined a comparator so the larger values have higher priority

        System.out.println(priorityQueue.peek());

        System.out.println("Priority Queue");

        // iterator through PriorityQueue
        for(Iterator<Integer> iterator = priorityQueue.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        priorityQueue.poll();

        System.out.println("After Deletion");

        priorityQueue.forEach(System.out::println);

    }
}
