package com.javacourse.chapter12.Inheritance;

class Rectangle{
    int length;
    int breadth;
    public Rectangle(){
        length = breadth = 1;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}
class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        height = 1;
    }
    public Cuboid(int h){
        int f;
        height = h;
    }
    public Cuboid(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    int volume(){
        return length * breadth * height;
    }
}
public class super_test {
    public super_test(int x){
        System.out.println("super_test: "+x);
    }
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid(10); // this will call parameterised constructor of cuboid and non-parameterised constructor of rectangle
        System.out.println(cuboid.volume());
        Cuboid cuboid1 = new Cuboid(10, 3, 14);
        System.out.println(cuboid1.volume());
        super_Test super_test = new super_Test(5);
    }
}
class super_Test extends super_test{
    public super_Test(int x){
        super(x);
    }
}