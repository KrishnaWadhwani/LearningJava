package com.javacourse.chapter16.StaticAndFinal.StudentChallenge;

class ThisClassCanOnlyCreate5Objects{
    private static ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects = null;
    static int counter = 0;
    static int max = 5;

    private ThisClassCanOnlyCreate5Objects(){
        counter+=1;
    }

    public static ThisClassCanOnlyCreate5Objects getInstance(){
        if (counter<=(max - 1)){
            thisClassCanOnlyCreate5Objects = new ThisClassCanOnlyCreate5Objects();
        }
        else{
            System.out.println("Max Number Of Objects Reached, Boi!");
        }
        return thisClassCanOnlyCreate5Objects;
    }
}
public class CounteredSingleton {
    public static void main(String[] args) {
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects0 = ThisClassCanOnlyCreate5Objects.getInstance();
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects1 = ThisClassCanOnlyCreate5Objects.getInstance();
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects2 = ThisClassCanOnlyCreate5Objects.getInstance();
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects3 = ThisClassCanOnlyCreate5Objects.getInstance();
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects4 = ThisClassCanOnlyCreate5Objects.getInstance();
        ThisClassCanOnlyCreate5Objects thisClassCanOnlyCreate5Objects5 = ThisClassCanOnlyCreate5Objects.getInstance();
        if (thisClassCanOnlyCreate5Objects4 == thisClassCanOnlyCreate5Objects5){
            System.out.println("Same 4 = 5");
        }
        if (thisClassCanOnlyCreate5Objects0 == thisClassCanOnlyCreate5Objects5){
            System.out.println("Same 0 = 5");
        }

        System.out.println("Counter: "+ThisClassCanOnlyCreate5Objects.counter);
    }
}
