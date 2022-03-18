package com.javacourse.chapter24.Generics;

@SuppressWarnings("unchecked")
class NoParamArray<T>{
    T[] a = (T[]) new Object[10];
    int length = 0;
    public void append(T v){
        a[length++] = v;
    }
    public void display(){
        for(int i = 0 ; i < length ; i++){
            System.out.println(a[i]);
        }
    }
}

public class NoParameters{
    public static void main(String[] args){
        NoParamArray noParamArray = new NoParamArray(); // if we don't mention generic type here

        // it will take all of these as Object, so we can store anything here :-)
        noParamArray.append("Hi");
        noParamArray.append(10);
        noParamArray.append("Bye");

        noParamArray.display();
    }
}
