package com.javacourse.chapter12.Inheritance;

class Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car Accelerated");
    }
    public void changeGear(){
        System.out.println("Car's Gear Changed");
    }
}
class LuxuryCar extends Car{
    private boolean sunRoofOpened = false;
    @Override
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        if (!sunRoofOpened){
            System.out.println("Sun Roof Opened");
            sunRoofOpened = true;
        }
        else{
            System.out.println("Sun Roof Closed");
            sunRoofOpened = false;
        }
    }
}
public class Overriding_2 {
    public static void main(String[] args){
        Car car = new Car();
        car.start();
        car.accelerate();
        car.changeGear();

        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.start(); // coming from super class (Car)
        luxuryCar.accelerate(); // coming from super class (Car)
        luxuryCar.changeGear(); // coming from Sub class (Luxury Car)
        luxuryCar.openRoof(); // coming from Sub class (Luxury Car);
        luxuryCar.openRoof();
        luxuryCar.openRoof();
    }
}
