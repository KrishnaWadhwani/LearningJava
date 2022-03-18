package com.javacourse.chapter24.Generics;

@SuppressWarnings("unchecked")
class BoundedTypeGeneric<T extends Number>{
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

public class BoundedTypes {
    public static void main(String[] args){
        // This will give error because :-) String is not inheriting from Number - BoundedTypeGeneric<String> boundedTypeGeneric = new BoundedTypeGeneric<>();
        BoundedTypeGeneric<Float> boundedTypeGeneric = new BoundedTypeGeneric<>();
        // Now here, Float is inheriting from Number class
        boundedTypeGeneric.append(10.53f);
        boundedTypeGeneric.append(11.67f);
        boundedTypeGeneric.append(123.4635235f);

        boundedTypeGeneric.display();
    }
}
