package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyTextAreaFrame extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    public MyTextAreaFrame(){
        super("TextArea");
        l = new Label("No Text Entered");
        ta = new TextArea(10, 30);
        tf = new TextField(20);
        b = new Button("Submit");
        b.addActionListener(this);

        setLayout(new FlowLayout());

        add(ta);
        add(l);
        add(tf);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class TextAreaClass {
    public static void main(String[] args){
        MyTextAreaFrame textAreaFrame = new MyTextAreaFrame();
        textAreaFrame.setSize(500, 500);
        textAreaFrame.setVisible(true);
    }
}
