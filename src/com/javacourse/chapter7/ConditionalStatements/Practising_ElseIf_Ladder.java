package com.javacourse.chapter7.ConditionalStatements;

public class Practising_ElseIf_Ladder {
    public static void main(String[] args){
        int a = 5, b = 10, c = 15;
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
