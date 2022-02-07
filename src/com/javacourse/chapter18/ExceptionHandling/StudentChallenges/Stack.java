package com.javacourse.chapter18.ExceptionHandling.StudentChallenges;

class StackOverFlowException extends Exception{
    @Override
    public String toString(){
        return "StackOverFlow";
    }
}

class StackUnderFlowException extends Exception{
    @Override
    public String toString(){
        return "StackUnderFlow";
    }
}

class StackImplementation{

    private int top = -1;
    int[] stack;
    private final int SIZE;
    private int popValue;

    public StackImplementation(int size){
        this.SIZE = size;
        stack = new int[size];
    }

    public void push(int element) throws StackOverFlowException {
        if (top == SIZE - 1){
            throw new StackOverFlowException();
        }
        else{
            top++;
            stack[top] = element;
        }
    }

    public int pop() throws StackUnderFlowException {
        if (top == -1){
            throw new StackUnderFlowException();
        }
        else{
            popValue = stack[top];
            top--;
        }
        return popValue;
    }

}

public class Stack {
    // Last In First Out
    public static void main(String[] args){
        StackImplementation stack = new StackImplementation(5);
        try{

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            // remove these for error
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
        catch (StackOverFlowException | StackUnderFlowException | ArithmeticException e){
            System.out.println(e);
        }

    }
}
