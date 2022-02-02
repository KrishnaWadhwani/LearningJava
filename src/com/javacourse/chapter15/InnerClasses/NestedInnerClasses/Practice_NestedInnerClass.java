package com.javacourse.chapter15.InnerClasses.NestedInnerClasses;

class Outer{
    int x = 10;
    Inner i = new Inner(); // both are same
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println("x: "+x+" y: "+y);
        }
    }
    public void outerDisplay(){
        Inner i = new Inner(); // both are same
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class Practice_NestedInnerClass {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner innerObject = new Outer().new Inner(); // First Create Object Of Outer Then Object Of Inner Class
        // Only Members of Inner Class Are Accessible
        innerObject.innerDisplay();
        System.out.println(innerObject.y);

    }
}
