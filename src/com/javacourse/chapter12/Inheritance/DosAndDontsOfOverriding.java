package com.javacourse.chapter12.Inheritance;

class A{

}
class B extends A{

}
class Super1{
    public A returnType(){ //Super Class Will Only Return Super Class
        return new A();
    }
    public void display(){
        System.out.println("Super Display");
    }
}
class Sub2 extends Super1{
    // Method Overloading
    public void display(int x){ // to method override parameter list must be the same
        System.out.println("Sub Display: "+x);
    }
    public void Display(){
        System.out.println("Bada Display");
    }
    public int display1(){ //Neither Overriding Nor Overloading
        return 0;
    }
    public B returnType(){ //Sub Class Will Only Return Sub Class
        return new B();
    }
    /* Will throw error we cannot have private/protected here
    private void display(){

    }
    */
    @Override
    public void display(){
        System.out.println("Sub Display");
    }
}
public class DosAndDontsOfOverriding {
    public static void main(String[] args){
        Sub2 s = new Sub2();
    }
}
