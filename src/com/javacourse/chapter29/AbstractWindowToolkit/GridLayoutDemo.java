package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;

class MyGridLayoutFrame extends Frame{
    Button b1, b2, b3, b4, b5, b6, b7;
    public MyGridLayoutFrame(){

        setLayout(new GridLayout(3, 3)); // 3 rows 2 columns

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");
        b7 = new Button("Seven");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
}

public class GridLayoutDemo {
    public static void main(String[] args){
        MyGridLayoutFrame myGridLayoutFrame = new MyGridLayoutFrame();
        myGridLayoutFrame.setSize(500, 500);
        myGridLayoutFrame.setVisible(true);
    }
}
