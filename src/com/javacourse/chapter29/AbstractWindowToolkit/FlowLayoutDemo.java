package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyFlowLayoutDemoFrame extends Frame{
    Button b1, b2, b3, b4, b5, b6;
    public MyFlowLayoutDemoFrame(){
        super("FlowLayoutDemo");

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        flowLayout.setHgap(100); // horizontal gap

        setLayout(flowLayout);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class FlowLayoutDemo {
    public static void main(String[] args){
        MyFlowLayoutDemoFrame frame = new MyFlowLayoutDemoFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
