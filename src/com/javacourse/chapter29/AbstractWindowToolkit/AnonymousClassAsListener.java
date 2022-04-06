package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AnonymousFrame extends Frame{

    TextField tf;
    Button b;
    int count = 0;

    public AnonymousFrame(){
        super("Frame Class As Listener");

        tf = new TextField("0", 20);
        b = new Button("Click");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tf.setText(String.valueOf(++count));
            }
        });

        setLayout(new FlowLayout());

        add(tf);
        add(b);
    }
}

public class AnonymousClassAsListener {
    public static void main(String[] args){
        AnonymousFrame anonymousFrame = new AnonymousFrame();
        anonymousFrame.setSize(400, 400);
        anonymousFrame.setVisible(true);
    }
}
