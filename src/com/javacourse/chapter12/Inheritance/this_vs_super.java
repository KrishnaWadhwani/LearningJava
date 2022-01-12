package com.javacourse.chapter12.Inheritance;

class thisRectangle{
    int length;
    int breadth;
    public thisRectangle(){
        length = breadth = 1;
    }
    public thisRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Scanner{
    int value = 0;
    public void nextInt(int i){
        value = i;
    }
}
class thatRectangle{
    int length;
    int breadth;
    public thatRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class superRectangle extends thatRectangle{
    int height = 10;
    int length = 13;
    public superRectangle(int length, int breadth){
        super(length, breadth);
    }
    public void display(){
        System.out.println("this: "+this.length);
        System.out.println("super: "+super.length);
        System.out.println("super: "+super.breadth);
        System.out.println("this: "+this.height);
    }
}
public class this_vs_super{
    public static void main(String[] args){
        superRectangle rectangle = new superRectangle(10, 30);
        rectangle.display();
    }
}