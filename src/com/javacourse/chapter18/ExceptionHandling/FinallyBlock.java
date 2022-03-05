package com.javacourse.chapter18.ExceptionHandling;

public class FinallyBlock {
    public static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally {
            System.out.println("Final Message");
        }
    }
    public static void main(String[] args) throws Exception{
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            // just trying out //
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("com.javacourse.chapter23.JavaIOStreams.TestFiles.Test");
            }
            System.out.println("Final Message");
        }
        meth1();
    }
}
