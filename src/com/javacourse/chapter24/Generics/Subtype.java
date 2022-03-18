package com.javacourse.chapter24.Generics;

// // // // // // // // // // // // // //
//     ---------------------------     //
//     Written By Krishna Wadhwani     //
//     ---------------------------     //
// // // // // // // // // // // // // //

class MyArray2 extends MyArray<String>{

}
             // see bar below both the <T>'s
             // taking param here // and then passing it here
class MyArray3<T> extends MyArray<T>{ // MyArray3 is just a copy-paste of MyArray because we are taking "T" in and passing it to MyArray
            // |                  |
}
public class Subtype{
    public static void main(String[] args){
        MyArray2 myArray2 = new MyArray2();
        // myArray2.append(10); // this is error
        // because MyArray2 is extending from MyArray for Strings, not for Integers
        myArray2.append("Krishna Wadhwani");
        myArray2.append("is the best coder");
        myArray2.append("you know this :-)");
    }
}