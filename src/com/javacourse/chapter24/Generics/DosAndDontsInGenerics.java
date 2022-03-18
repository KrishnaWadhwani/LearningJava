package com.javacourse.chapter24.Generics;

class Class1{}
interface Interface1{}
interface Interface2{}

@SuppressWarnings("unchecked")
class MyArray4<T extends Class1 & Interface1 & Interface2>{
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

public class DosAndDontsInGenerics{
    static void fun(MyArray<?> obj){ // method fun doesn't know which type of object you are passing
        // obj.append("Hello"); // it will not allow to store this String value because we have defined <?> above
        obj.append(null); // it will only allow null
        // we cannot store any other value
    }
    public static void main(String[] args){
        MyArray<String> ma1 = new MyArray<String>();
        fun(ma1);
    }
}
