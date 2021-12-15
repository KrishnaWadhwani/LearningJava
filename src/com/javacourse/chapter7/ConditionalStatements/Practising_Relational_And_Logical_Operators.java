package com.javacourse.chapter7.ConditionalStatements;

public class Practising_Relational_And_Logical_Operators {
    public static void main(String[] args){
        int a = 5, b = 10, c = 15;
        System.out.println(a < b); // Relational Operator
        System.out.println(a > c); // Relational Operator
        System.out.println(a >= c); // Relational Operator
        System.out.println(a == c); // Relational Operator
        System.out.println(a <= c); // Relational Operator
        System.out.println(a<b && a<c); // True: Both Are True    (Logical Operator) (&&)
        System.out.println(a<b && a>c); // False: Both Should Be True   (Logical Operator) (&&)
        System.out.println(a<b || a>c); // True: One Of The Condition Is True  (Logical Operator) (&&)
    }
}
