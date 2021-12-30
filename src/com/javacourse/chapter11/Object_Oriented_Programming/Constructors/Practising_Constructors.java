package com.javacourse.chapter11.Object_Oriented_Programming.Constructors;

class Rectangle{
    private double length;
    private double breadth;
    // overloaded constructors
    //non parameterized constructors
    public Rectangle(){
        length = 1;
        breadth = 1;
    }
    //parameterized constructors
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    // for square
    public Rectangle(double s){
        length = breadth = s;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public boolean isSquare(){
        return length == breadth;
    }
    // getters - so it is readonly :-), noooooo, above, constructors are used to write length, breadth lol :-) !!!!
    public double getLength() {
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    // setters
    public void setLength(double l){
        if (l >= 0){
            length = l;
        }
        else{
            length = 0;
        }
    }
    public void setBreadth(double b){
        if (b >= 0){
            breadth = b;
        }
        else{
            breadth = 0;
        }
    }
}
public class Practising_Constructors {
    public static void main(String[] args){
        Rectangle rectangle_1_1 = new Rectangle();
        Rectangle rectangle = new Rectangle(10, 20);
        Rectangle square = new Rectangle(10);

        System.out.println(rectangle.getBreadth());
    }
}
