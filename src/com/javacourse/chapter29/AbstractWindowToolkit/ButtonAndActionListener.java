package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyFrameClass extends Frame implements ActionListener{
    int count = 0;
    Label label;
    Button button;

    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("    "+count);
    }

    public MyFrameClass(){
        super("Counter");
        label = new Label("    "+count);
        button = new Button("Click");
        button.addActionListener(this);

        setLayout(new FlowLayout());
        add(label);
        add(button);
    }
}

public class ButtonAndActionListener {
    public static void main(String[] args){
        MyFrameClass frame = new MyFrameClass();
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
