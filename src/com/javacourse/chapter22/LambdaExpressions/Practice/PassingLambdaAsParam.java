package com.javacourse.chapter22.LambdaExpressions.Practice;

interface MyLambda {
    int add(int... a);
}

class UseLambda{
    public void display(MyLambda myLambda, int... a){
        myLambda.add(a);
    }
}

class Demo {
    int sum = 0;
    public int method(){
        UseLambda useLambda = new UseLambda();
        useLambda.display((a)->{
            for (int x : a){
                sum+=x;
            }
            return sum;
        }, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        return sum;
    }
}

public class PassingLambdaAsParam {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.method());
    }
}
