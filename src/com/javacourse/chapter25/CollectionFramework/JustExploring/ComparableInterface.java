package com.javacourse.chapter25.CollectionFramework.JustExploring;

import java.util.TreeSet;

class Name implements Comparable{
    String name;
    public Name(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Object o){
        Name n = (Name) o;
        if (this.name.length() < n.name.length()){
            return -1;
        }
        else if(this.name.length() > n.name.length()){
            return 1;
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return name;
    }
}

public class ComparableInterface {
    public static void main(String[] args){
        TreeSet<Name> treeSet = new TreeSet<>();
        treeSet.add(new Name("Krishna"));
        treeSet.add(new Name("Sonu"));
        treeSet.add(new Name("Harish"));

        System.out.println(treeSet);
    }
}
