package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class CheckBoxFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3;

    public CheckBoxFrame(){
        super("Check Box Demo");

        l = new Label("Nothing is Selected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");

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
    public void itemStateChanged(ItemEvent e){
        String s = "";

        if (c1.getState()){
            s = s+" "+c1.getLabel();
        }
        if (c2.getState()){
            s = s+" "+c2.getLabel();
        }
        if (c3.getState()){
            s = s+" "+c3.getLabel();
        }
        if (s.isEmpty()){
            s = "Nothing is Selected";
        }
        l.setText(s);
    }
}

public class CheckBoxApp {
    public static void main(String[] args){
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setSize(400, 400);
        checkBoxFrame.setVisible(true);
    }
}
