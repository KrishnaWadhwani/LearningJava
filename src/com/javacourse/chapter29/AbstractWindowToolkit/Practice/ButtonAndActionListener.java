package com.javacourse.chapter29.AbstractWindowToolkit.Practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrameClass extends Frame implements ActionListener{

    Button button;
    String message;
    TextField field;
    Label label;

    public MyFrameClass(){
        button = new Button("Send");
        button.addActionListener(this);
        field = new TextField(20);
        label = new Label();
        setLayout(new FlowLayout());

        add(label);
        add(field);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        message = field.getText();
        label.setText( message);
    }
}

public class ButtonAndActionListener {
    public static void main(String[] args){
        MyFrameClass myFrame = new MyFrameClass();
        myFrame.setSize(400, 400);
        myFrame.setVisible(true);
    }
}
