package com.javacourse.chapter24.Generics;

class A{

}
class B extends A{

}
class C extends A{

}

@SuppressWarnings("unchecked")
class BoundedTypeArray<T extends A>{ // this will only support those classes which are inheriting from "A" or "A"
    T[] a = (T[]) new Object[10];
    int length = 0;
    public void append(T v){
        a[length++] = v;
    }
    public void display(){
        for (int i = 0 ; i < length ; i++){
            System.out.println(a[i]);
        }
    }
}

public class BoundedTypeArrayForUserDefinedClass {
    public static void main(String[] args){
        BoundedTypeArray<C> boundedTypeArray = new BoundedTypeArray<>();
        // Yes, this is allowed :-) here we are passing "C"
    }
}
