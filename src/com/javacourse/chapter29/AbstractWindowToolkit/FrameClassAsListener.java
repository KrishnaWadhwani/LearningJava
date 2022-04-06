package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FrameClassAsListenerFrame extends Frame implements ActionListener {
    TextField tf;
    Button b;
    int count = 0;

    public FrameClassAsListenerFrame(){
        super("Frame Class As Listener");

        tf = new TextField("0", 20);
        b = new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());

        add(tf);
        add(b);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent){
        count++;
        tf.setText(String.valueOf(count));
    }
}

public class FrameClassAsListener {
    public static void main(String[] args){
        FrameClassAsListenerFrame frame = new FrameClassAsListenerFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
