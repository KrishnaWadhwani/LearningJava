package com.javacourse.chapter10.Methods.StudentChallenges.OverloadedMethods;

public class Validate_Name_And_Age {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }
    public static void main(String[] args){
        System.out.println(validate("Krishna Wadhwani"));
    }
}
