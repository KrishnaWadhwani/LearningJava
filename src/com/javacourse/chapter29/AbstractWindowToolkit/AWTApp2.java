package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;

class MyFrame extends Frame{ //isA method
    Label label;
    TextField textField;
    Button button;

    public MyFrame(){
        super("My App");
        setLayout(new FlowLayout());
        label = new Label("Name");
        textField = new TextField(20);
        button = new Button("Submit");

        add(label);
        add(textField);
        add(button);
    }
}

public class AWTApp2 {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
