package com.javacourse.chapter21.AnnotationsAndJavaDoc;

/** @author Mr. Charles Babbage
 *  @version 19.38.2
 *  @since 1822
 *  Hello I Am Charles Babbage, This is the world's first computer
 **/

public class Computer {
    /**
     * @value bits 64, bits supported by this computer
     **/
    static byte bits = 64;

    /**
     * Parameterized Constructor
     * @param OS OS Supported by this computer
     * @param memory Total Memory in this computer
     * @param bits Bits in this computer
     */

    public Computer(String OS, int memory, byte bits){}

    /**
     * This method releases memory for other programs to run
     * @param memory Memory to free
     * @throws OutOfMemoryError If given memory is less or too much high then this exception will be thrown
     */

    public void releaseMemory(int memory) throws OutOfMemoryError{}

    /**
     * This method checks that if the given version of Java is supported by the computer or not
     * @param javaVersion Input java number
     * @return will always return true, in the respect of Java
     */

    public boolean supportsJava(int javaVersion){
        return true;
    }

    /***
     * This method will return the computer name
     * @param name computer name
     * @return the given name by user
     */

    public String getComputerName(String name){
        return name;
    }

    /**
     * @deprecated
     * @since 9
     * @return true
     */

    public boolean deprecatedMethod(){
        return true;
    }

}