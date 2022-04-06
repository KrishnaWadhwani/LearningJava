package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class ColorChangerFrame extends Frame implements AdjustmentListener{
    Scrollbar red, green, blue;
    TextField tf;
    Label label;
    public ColorChangerFrame(){
        super("Color Mixer");
        red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);

        tf = new TextField(20);
        label = new Label("Red: 0 Green: 0 Blue: 0");
        tf.setBounds(50, 100, 300, 50);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);
        label.setBounds(50, 300, 300, 30);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

        setLayout(null);

        add(tf);
        add(red);
        add(green);
        add(blue);
        add(label);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
        tf.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
        label.setText("Red: "+red.getValue()+" Green: "+green.getValue()+" Blue: "+blue.getValue());
    }
}

public class ColorChanger {
    public static void main(String[] args){
        ColorChangerFrame colorChangerFrame = new ColorChangerFrame();
        colorChangerFrame.setSize(400, 400);
        colorChangerFrame.setVisible(true);
    }
}
