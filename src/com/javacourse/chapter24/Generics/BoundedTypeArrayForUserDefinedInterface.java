package com.javacourse.chapter24.Generics;

interface Human { // Yes, we can also use interfaces here :-)

}

class Father implements Human{

}

class Child implements Human{

}

@SuppressWarnings("unchecked")
class BoundedTypeArrayForInterface<T extends Human>{ // And for using interfaces we don't need to write "implements" here, we must write "extends"
    T[] a = (T[]) new Object();
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

public class BoundedTypeArrayForUserDefinedInterface {
    public static void main(String[] args){
        BoundedTypeArrayForInterface<Father> boundedTypeArrayForInterface = new BoundedTypeArrayForInterface<>();
    }
}
