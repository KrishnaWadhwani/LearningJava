package com.javacourse.chapter13.AbstractClasses.StudentChallenges;

//THERE ARE 2 TYPES OF CLASSES

abstract class Shape { // 1st -> Abstract Class
    abstract public double perimeter();
    abstract public double area();
}

class Concrete{ // 2nd -> Concrete Class
    public void thisIsJustAConcreteClass(){
        System.out.println("This Is Just A Concrete Class");
    }
}

class Triangle extends Shape{

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1AndSide2AndSide3(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double perimeter, halfOfPerimeter;

    @Override
    public double perimeter(){
        perimeter = side1+side2+side3;
        return perimeter;
    }

    @Override
    public double area(){
        perimeter();
        halfOfPerimeter = perimeter/2;
        return heronsFormula(halfOfPerimeter);
    }

    public double heronsFormula(double halfOfPerimeter){
        // √s(s-a)(s-b)(s-c) here s = perimeter/2;
        return Math.sqrt(halfOfPerimeter*(halfOfPerimeter-side1)*(halfOfPerimeter-side2)*(halfOfPerimeter-side3));
    }

}
class Rectangle extends Shape{

    private double length, breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLengthAndBreadth(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter(){
        return 2 * (length + breadth);
    }

    @Override
    public double area(){
        return length * breadth;
    }

}

public class ClassShape {
    public static void main(String[] args){
        Triangle triangle = new Triangle(1, 2, 3);
        Rectangle rectangle = new Rectangle(10, 20);

        triangle.area();
        triangle.perimeter();

        rectangle.area();
        rectangle.perimeter();
    }
}
