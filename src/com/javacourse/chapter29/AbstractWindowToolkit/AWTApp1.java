package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;

public class AWTApp1 {
    public static void main(String[] args){
        // hasA method
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());

        Button button = new Button("OK");
        Label l = new Label("Name");
        TextField field = new TextField(20);

        f.add(l);
        f.add(field);
        f.add(button);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
