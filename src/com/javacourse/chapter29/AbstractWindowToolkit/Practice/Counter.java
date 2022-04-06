package com.javacourse.chapter29.AbstractWindowToolkit.Practice;

import java.awt.*;
import java.awt.event.*;

class CounterFrame extends Frame implements ActionListener {
    Button b;
    Label l;

    int count = 0;
    public CounterFrame(){
        b = new Button("Completed Another One ++");
        b.addActionListener(this);

        l = new Label("Videos Completed Yet: "+count);

        setLayout(new FlowLayout());

        add(b);
        add(l);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        l.setText("Videos Completed Yet: "+(++count));
    }
}

public class Counter {
    public static void main(String[] args){
        CounterFrame counterFrame = new CounterFrame();
        counterFrame.setSize(400, 70);
        counterFrame.setVisible(true);
    }
}
