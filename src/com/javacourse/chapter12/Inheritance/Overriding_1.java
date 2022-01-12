package com.javacourse.chapter12.Inheritance;

class TV{
    public void switchOn(){
        System.out.println("TV Switched On");
    }
    public void changeChannel(){
        System.out.println("TV Channel Changed");
    }
}
class SmartTV extends TV{
    @Override
    public void switchOn(){
        System.out.println("Smart TV Switched On");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV Channel Changed");
    }
    public void browse(){
        System.out.println("Opened Chrome :-)");
    }
}
public class Overriding_1 {
    public static void main(String[] args){
        TV tv = new TV();
        tv.switchOn();
        tv.changeChannel();
        
        SmartTV smartTV = new SmartTV();
        smartTV.switchOn();
        smartTV.browse();

        TV tv1 = new SmartTV();
        tv1.changeChannel();
    }
}
