package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InnerClassAsListenerFrame extends Frame{

    TextField tf;
    Button b;
    int count = 0;

    public InnerClassAsListenerFrame(){
        super("Frame Class As Listener");

        tf = new TextField("0", 20);
        b = new Button("Click");
        Handler handler = new Handler();
        b.addActionListener(handler);

        setLayout(new FlowLayout());

        add(tf);
        add(b);
    }
    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}

public class InnerClassAsListener {
    public static void main(String[] args){
        InnerClassAsListenerFrame frame = new InnerClassAsListenerFrame();
        frame.setSize(new Dimension(400, 400));
        frame.setVisible(true);
    }
}
