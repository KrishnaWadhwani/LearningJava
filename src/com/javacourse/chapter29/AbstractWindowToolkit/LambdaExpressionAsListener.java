package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LambdaExpressionAsListenerFrame extends Frame{

    TextField tf;
    Button b;
    int count = 0;

    public LambdaExpressionAsListenerFrame(){
        super("Frame Class As Listener");

        tf = new TextField("0", 20);
        b = new Button("Click");
        b.addActionListener((ActionEvent ae) -> {
            tf.setText(String.valueOf(++count));
        });

        setLayout(new FlowLayout());

        add(tf);
        add(b);
    }
}

public class LambdaExpressionAsListener {
    public static void main(String[] args){
        LambdaExpressionAsListenerFrame lambdaExpressionAsListenerFrame = new LambdaExpressionAsListenerFrame();
        lambdaExpressionAsListenerFrame.setSize(400, 400);
        lambdaExpressionAsListenerFrame.setVisible(true);
    }
}
