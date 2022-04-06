package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;

class MyBorderLayoutFrame extends Frame{
    Button b1, b2, b3, b4, b5, b6;
    public MyBorderLayoutFrame(){
        super("Border LayoutDemo");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
//        add(b6);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(new Button("Monday"));
        panel.add(new Button("Tuesday"));
        panel.add(new Button("Wednesday"));

        add(panel, BorderLayout.EAST);
    }
}

public class BorderLayoutDemo {
    public static void main(String[] args){
        MyBorderLayoutFrame myBorderLayoutFrame = new MyBorderLayoutFrame();
        myBorderLayoutFrame.setSize(400, 400);
        myBorderLayoutFrame.setVisible(true);
    }
}
