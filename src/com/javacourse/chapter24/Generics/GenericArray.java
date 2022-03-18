package com.javacourse.chapter24.Generics;

@SuppressWarnings("unchecked")
class MyArray<T>{
    T[] a = (T[]) new Object[10];
    int length = 0;
    public void append(T val){
        a[length++] = val;
    }
    public void display(){
        for (int i = 0 ; i < length ; i++){ // we are using this loop instead of for each loop because for each loop will iterate to the end of the array and if someone used this array only up-to index 3 then it will show 0's for remaining, and when we are using for loop up-to length it will only iterate to used index :-)
            System.out.println(a[i]);
        }
    }
}

public class GenericArray {
    public static void main(String[] args){
        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(10);
        myArray.append(20);
        myArray.append(30);

        myArray.display();
    }
}