package com.javacourse.chapter25.CollectionFramework;

import java.util.*;

// ArrayList allows duplicate

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(20); // Now it will only allow Integer type of Data
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(50, 60, 70, 80, 90, 100)); // this will create arrayList1 with initialized values :-)
        arrayList.add(10);
        arrayList.add(0, 5); // this means 5 will be inserted before 10
        // how ??
        // [10]
        // [5, 10] add method will shift 10 to index 1 and put 5 on index 0
        arrayList.addAll(arrayList1); // this will add arrayList1 elements to arrayList from last index

        arrayList.addAll(1, arrayList1); // this will add elements from index 1

        arrayList1.clear(); // this method is used the clear the list means that this method will empty the list

        System.out.println(arrayList.contains(50)); // here we are checking that if the element is present in the arrayList or not

        System.out.println(arrayList.equals(arrayList1)); // here we are checking if arrayList == arrayList1

        System.out.println(arrayList.get(5)); // it will return the element at 5th index

        System.out.println(arrayList.indexOf(70)); // this will return the index of "70" from the index 0

        System.out.println(arrayList.lastIndexOf(70)); // this will return the index of last "70" in the arrayList from the index 0

        arrayList.set(6, 100);

        Object[] a = arrayList.toArray();

        System.out.println("Converting ArrayList to Array");
        
        for (Object x : a){
            System.out.println((int) x);
        }

        // printing the list
        System.out.println("Printing ArrayList using System.out.println()");
        System.out.println(arrayList);

        // iteration

        // using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("Using for each loop");
        // using for each loop
        // var is introduces in Java 10(JDK 10), Java compiler guesses the type of the variable based on the surround context
        // by using "var" programmer don't have to declare variable type
        for (var x : arrayList) {
            System.out.println(x);
        }

        // Using while iterator,
        // Iterator doesn't have functionality to go back
        System.out.println("Going forth");
        Iterator<Integer> iterator = arrayList.iterator(); // holding the first element of arrayList
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // using ListIterator,
        // ListIterator have functionality to go previous
        System.out.println("Going back");
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // using for loop
        // for(initialization; condition; updation;)
        // so in this case updation is not there only initialization and condition is there
        // Iterator
        for (Iterator<Integer> it = arrayList.iterator(); it.hasNext();){
            //               initialization             ;  condition
            // updation is not there
            System.out.println(it.next());
        }
        // ListIterator
        for (ListIterator<Integer> lit = arrayList.listIterator() ; lit.hasNext();){
            //               initialization                       ;  condition

            System.out.println(lit.next());
        }

        // for each method of ArrayList class

        arrayList.forEach(n -> {
            System.out.println(n);
        });

        arrayList.forEach(System.out::println);

        // checking if the current number is greater than 60 if yes then it will print that number
        System.out.println("If else in .forEach method");
        arrayList.forEach(n -> show(n));
        // for each will scan through all the elements of the list and call show method for every method in the list
    }
    public static void show(int n){
        if (n > 60){
            System.out.println(n);
        }
    }
}
