package com.javacourse.chapter16.StaticAndFinal.Static;

class StaticBlocksTest{
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }
}
public class StaticBlocks {
    static{
        System.out.println("Block 1");
    }
    public static void main(String[] args){
        System.out.println("Main");
        StaticBlocksTest test = new StaticBlocksTest();
    }
    static{
        System.out.println("Block 2");
    }
}
