package com.javacourse.chapter18.ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args){
        int[] A = {30, 20, 10, 40, 0};

        try{
            float c = (float)A[0]/A[3];
            System.out.println("Division Is: "+c);

            System.out.println(A[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator Should Not Be 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }

        System.out.println("Bye");
    }
}
