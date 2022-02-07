package com.javacourse.chapter18.ExceptionHandling;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions Of A Rectangle Cannot Be Negative";
    }
}

public class ThrowsDemo {
    static int area(int l, int b) throws NegativeDimensionException
    {
        if (l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area Is: "+area(10, 5));
    }
    public static void main(String[] args)
    {
        try{
            meth1();
        }
        catch (NegativeDimensionException e){
            e.printStackTrace();
        }
    }
}
