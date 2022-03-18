package com.javacourse.chapter24.Generics.JustExploring;

public class Experiment {
    public static void main(String[] args){
        GenericForExperiment<String> genericForExperiment = new GenericForExperiment();
        genericForExperiment.setEa("Krishna Wadhwani");
        System.out.println(genericForExperiment.getEa());
    }
}
