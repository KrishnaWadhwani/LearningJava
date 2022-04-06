package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyTextFieldFrame extends Frame{
    Label l1, l2;
    TextField tf;

    public MyTextFieldFrame(){
        super("TextField");
        l1 = new Label("No Text is Entered Yet");
        l2 = new Label("Enter key is not yet hit");
        setLayout(new FlowLayout());

        tf = new TextField(20);
        Handler h = new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);

        tf.setEchoChar('*');
        add(l1);
        add(tf);
        add(l2);
    }
    class Handler implements TextListener, ActionListener{
        @Override
        public void textValueChanged(TextEvent textEvent) {
            l1.setText(tf.getText());
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            l2.setText(tf.getText());
        }
    }
}

public class TextFieldAndTextEvent {
    public static void main(String[] args){
        MyTextFieldFrame myTextFieldFrame = new MyTextFieldFrame();
        myTextFieldFrame.setSize(400, 400);
        myTextFieldFrame.setVisible(true);
    }
}
