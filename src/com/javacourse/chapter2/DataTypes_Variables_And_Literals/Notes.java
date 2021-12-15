package com.javacourse.chapter2.DataTypes_Variables_And_Literals;

public class Notes {
    public static void main(String[] args){
        /*
            To Calculate Size Of Data Type Easy Method: -(2^bits)/2 to (2^bits)/2 - 1
            See For Integer:
            Look At The Integer Docs: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html
            1) Calculate Bits: byte*bits 4*8=32 | -(2^32)/2 to (2^32)/2 - 1
            Q) What is 4 here??
            Ans) Byte, In Integer
            Q) What is 8 here??
            Ans) 1 Byte = 8 Bits
            Then We Multiplied Them(4*8) And Found The Ans Which = 32
            Then The Formula: -(2^bits)/2 to (2^bits)/2 - 1
            And So We Got Integer Range: -2147483648 to 2147483647

            Know About Any Class With The Help Of javap <source>
            Example: javap java.lang.Integer
        */
        /*
            Why Float is called float??
            In memory, the decimals are not stored they are removed from that point It means we float them so it is called float
        */
        /*
            WORA - WRITE ONCE RUN ANYWHERE
        */
        /*
            Java runs on JVM So It Can Run Anywhere JVM Is Like A Computer Inside Computer
            But In C/C++, When C/C++ Compiles Let's Say C++ compiled for windows OS so it will generate system calls for windows OS that cannot run on Linux/macOS
        */
        /*
            How Java Is Platform Independant
            It makes byte code which can interpreted by JVM
            And then JVM Will Interpret it, And Run It On Respective OS
        */
        /*
            JVM Is Responsible For Executing Java Programs
            It Provides An Interpreter For Execution Of Java Programs
        */
        /*
            When We Load Compiled Class File In Memory It Is Called Class Loading
            It is called class loading cause in java everything is inside class
        */
        /*
            Class Loading Is Done By Class Loader
        */
        /*
            What class loader will do it takes the compiled program/class to the Memory
        */
        /*
            In memory, classes are not stored but methods are stored
        */
        /*
            Class Loader Load's Class For Running In Memory
       */
       /*
            Variable Are Created In Stack
       */
      /*
            Whenever we say "new" every object is created inside heap
      */
      /*
            Whenever a method is called its new stack frame is created
      */
      /*
            Class Loader Will Bring The Program From Disk To Main Memory

            The area where programs are kept is called is method area in java

            Code will be executed by Interpreter/JIT(Just In Time Compiler)

            Normal Variable, References Are Created In Stack

            Objects are created in heap

            Literals are kept inside String pool
      */
      /*
            Heap is used to save data at runtime
      */
      /*
        JVM Execution Engine Has An Interpreter And A JIT CompilerWhat An Interpreter Do Is, It Compiles Code Everytime And Run It
        And To Make Java Fast What JIT Compiler Do Is JIT Compiler Will Convert That  Bytecode Which Is Repeating, Into Machine Code And Run It Again And Again
      */
      /*
            JVM Execution Engine Has A Garbage Collector Also Which Remove Unused Objects From Heap
      */
      /*
            For Each Thread A PC Register Is Made
            Suppose There Are 2 Thread There Will Be 2 PC Registers Also
      */
      /*
            JVM Execution Engine Has A Garbage Collector Also Which Remove Unused Objects From Heap
      */
    }
}
