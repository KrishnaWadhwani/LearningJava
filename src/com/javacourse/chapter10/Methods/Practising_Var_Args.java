package com.javacourse.chapter10.Methods;

public class Practising_Var_Args {
    public static void show(int ...A){
        for (int x : A){
            System.out.println(x);
        }
    }
    static void showList(int start, String ...S){
        for (int i = 0 ; i < S.length ; i++){
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String ...args) {
        show();
        show(1, 2, 3, 4, 5, 6, 7, 8, 8, 9);
        show(new int[]{1, 2, 3, 4, 5, 6, 7}); //Anonymous Array
        showList(1, "Jhon", "Krishna", "Test", "Java", "Suresh", "Champa", "Ramesh");
    }
}
