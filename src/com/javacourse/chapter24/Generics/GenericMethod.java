package com.javacourse.chapter24.Generics;

public class GenericMethod {
    // here E = elements, it's just for understanding purpose
    static <E> void show(E[] list){ // we have to write <E> before return type, now this method is generic
        // now in this example list is an array of type E[]
        // for this we have to create object (continue reading comments)
        for(E x: list){
            System.out.println(x);
        }
    }
    // now see
    static <E> void printElements(E... list){ // now here we are using varargs
        // for using this now we don't have to pass the array also
        for (E x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        show(new String[]{"Hi", "Go", "Bye"});
        show(new Integer[]{10, 20, 30, 40});
        System.out.println();
        //check this out
        printElements("Krishna", "is", "the", "best", "coder");
        printElements(10, 20, 30, 40, 50); // it is automatically taking type of the data
    }
}
