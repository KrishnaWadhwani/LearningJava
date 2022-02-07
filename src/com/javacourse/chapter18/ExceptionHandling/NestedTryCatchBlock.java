package com.javacourse.chapter18.ExceptionHandling;

public class NestedTryCatchBlock {
    public static void main(String[] args){
        int[] A = {30, 20, 10, 40, 0};
        try{
            int c = A[0]/A[3];
            System.out.println("Division Is: "+c);
            try{
                System.out.println(A[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Denominator Should Be 0");
        }
    }
}
