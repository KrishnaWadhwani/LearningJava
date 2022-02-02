package com.javacourse.chapter15.InnerClasses.AnonymousInnerClasses;

interface My{
    void show();
}
abstract class Your{
    abstract void showYour();
}
class LetsShowOurs{
    public void showOurs(){
        class Inner{
            public void showing(){
                System.out.println("I am showing, first");
            }
        }
        Inner inner = new Inner();
        inner.showing();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){

        // These are not objects of interface or abstract class these are just objects of anonymous class

        My my = new My(){
            @Override
            public void show(){
                System.out.println("I am showing mine");
            }
        };
        my.show();

        Your your = new Your(){
            @Override
            public void showYour(){
                System.out.println("Now show me yours");
            }
        };
        your.showYour();

        LetsShowOurs letsShowOurs = new LetsShowOurs(){
            private void angry(){
                System.out.println("Damn Go to hell, I am not showing");
            }
            @Override
            public void showOurs(){
                angry();
            }
        };
        letsShowOurs.showOurs();

        LetsShowOurs letsShowOurs1 = new LetsShowOurs();
        letsShowOurs1.showOurs();
    }
}
