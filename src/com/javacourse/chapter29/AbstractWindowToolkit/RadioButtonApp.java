package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class RadioButtonFrame extends Frame implements ItemListener{

    Label l;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    CheckboxGroup checkboxGroup;

    public RadioButtonFrame(){
        super("Radio Button App");

        l = new Label("Nothing is Selected");

        checkboxGroup = new CheckboxGroup();

        c1 = new Checkbox("Java", false, checkboxGroup);
        c2 = new Checkbox("Python", false, checkboxGroup);
        c3 = new Checkbox("C#", false, checkboxGroup);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        String s = "";

        if (c1.getState()){
            s = c1.getLabel();
        }
        if (c2.getState()){
            s = c2.getLabel();
        }
        if (c3.getState()){
            s = c3.getLabel();
        }

        l.setText(s);
    }
}

public class RadioButtonApp {
    public static void main(String[] args){
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setSize(400, 400);
        radioButtonFrame.setVisible(true);
    }
}
