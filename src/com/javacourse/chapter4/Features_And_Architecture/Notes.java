package com.javacourse.chapter4.Features_And_Architecture;

public class Notes {
    public static void main(String[] args){
        /*
            First.java -> First.class -> JVM -> Operating System -> Hard Ware
            For More Info Check Process2.png
        */
        /*
            Interpreter Read Line By Line And Translate It To Machine Code If We Again want to compile we need interpreter again
            Compiler Read Line By Line And Save A File Which Is = Machine Code So We Don't Need Compiler Again We Just Use The Generated File And Program Will Run
        */
        /*
            We Need an interpreter again and again
            We Need a compiler only once
        */
        /*
                 javac compiles
                here and create
                a class file      java First.java
            First.java -> First.class -> JVM
            See "Process.png" for more info
        */
        /*
            First.java -> First.class
            First.class do not have machine code it has byte code
        */
        /*
            Byte code is not an executable program but it is an error-free program
        */
        /*
            When we calls "java" Main.java, we are actually Calling JVM
        */
        /*
            JVM - Interpreter
                - JIT Compiler(Just in time) compiler
        */
        /*
            The program will make System calls to make work done(To run the program)
        */
        // Class Loader Subsystem
        // Loading
        /*
            Application ClassLoader: Classes Written By Us Are Loaded By Application ClassLoader

            Bootstrap ClassLoader: Classes Needed For Our Program To Run Are Loaded By Bootstrap ClassLoader

            From GFG: (A Bootstrap Classloader is a Machine code which kickstarts the operation when the JVM calls it. It is not a java class. Its job is to load the first pure Java ClassLoader)

            Extension ClassLoader: Is A Child Of Bootstrap ClassLoader And Loads The Extensions Of Core Java Classes From Respective JDK
            It loads files from jre/lib/ext directory or any other directory pointed by the system property java
        */
        // Linking
        /*
            Verify: It Check If Byte Code(*.class) Is Valid Or Not And It Also Checks That If The Byte Code Is Secure Or Not
            Prepare: This Will Allocate Memory For Static Variable
            * Static Variables Are Not Stored In Stacks Or Heaps They Are Stored In Method Area In JVM Memory
            Resolve: Check Where Method Are Located
        */
        // Initialization
        /*
            Initializaion: Static Blocks Will Be Executed
        */
    }
}
