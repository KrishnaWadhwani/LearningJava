package com.javacourse.chapter21.AnnotationsAndJavaDoc;

import java.lang.annotation.Annotation; // Just A Redundant import
import java.util.Scanner;

@interface MyAnnotation {
    // Meta-Data
    // Elements cannot use "throws"
    // String AnnotationsCannotThrows() throws Exception;
    String name(); // name of programmer
    String project();  // name of project
    String date() default "today"; // date on which this class or method is written
    String version() default "10"; // version of the class or method

    /*
    * Format of defining element
    * [datatype] elementName();
    * It cannot have parameters
    * It cannot "throws" any exceptions
    * We can use default
    * */

}

public class DefiningOurOwnAnnotation {
    @MyAnnotation(name = "Krishna", project = "Java Course", date = "11/3/2001", version = "10.1")
    public static void main(String[] args) {
        int x;
    }
    public void JustATestMethod(){

    }
}
