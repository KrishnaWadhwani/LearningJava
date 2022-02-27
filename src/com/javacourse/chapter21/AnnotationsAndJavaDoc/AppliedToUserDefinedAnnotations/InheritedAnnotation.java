package com.javacourse.chapter21.AnnotationsAndJavaDoc.AppliedToUserDefinedAnnotations;

import java.lang.annotation.*;

@Inherited // if we use this annotation on a super class then this annotation will be applied on subclasses of that super class
@Retention(RetentionPolicy.RUNTIME) // this is declared to make this annotation visible to JVM and print in main method

@interface InheritedAnnotationDemo {
    String className() default "SuperClassName";
}


// for example: I have used this annotation on this super class and in the main method I have printed the annotations used on Sub class, run this program and check this annotation will be printed
@InheritedAnnotationDemo(className = "Super")
class Super {
    String className;
    public Super(String className) {
        this.className = className;
    }
    public void superMethod(){
        System.out.println("Just A Super Method");
    }
}

class Sub extends Super {
    String className;
    public Sub(String className){
        super(className);
        this.className = className;
    }
    @Override
    public void superMethod(){
        System.out.println("Just A Sub Method");
    }
}

public class InheritedAnnotation {
    public static void main(String[] args){
        Class s = Sub.class;
        // Using reflection API to see annotations applied to Sub class
        for (Annotation annotation : s.getAnnotations()) {
            // here InheritedAnnotation will be printed with the value Super :-) try by running this program
            System.out.println(annotation);
        }
    }
}
