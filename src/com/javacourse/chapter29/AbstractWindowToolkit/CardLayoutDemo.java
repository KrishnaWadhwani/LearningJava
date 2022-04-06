package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyCardLayoutDemoFrame extends Frame implements ItemListener {

    Button b1, b2, b3;

    TextField t1, t2, t3;

    Panel p1, p2, cp;

    Panel mainP;

    Checkbox c1, c2;

    CardLayout cl;

    public MyCardLayoutDemoFrame(){
        super("Card Layout");

        CheckboxGroup checkboxGroup = new CheckboxGroup();

        c1 = new Checkbox("One", false, checkboxGroup);
        c2 = new Checkbox("Two", false, checkboxGroup);

        c1.addItemListener(this);
        c2.addItemListener(this);

        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        mainP = new Panel();
        mainP.setLayout(new CardLayout());
        cl = new CardLayout();
        mainP.setLayout(cl);

        mainP.add("One", p1);
        mainP.add("Two", p2);

        add(cp, BorderLayout.NORTH);
        add(mainP, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if(c1.getState()){
            cl.first(mainP);
        }
        else {
            cl.last(mainP);
        }
    }
}
public class CardLayoutDemo {
    public static void main(String[] args){
        MyCardLayoutDemoFrame myCardLayoutDemoFrame = new MyCardLayoutDemoFrame();
        myCardLayoutDemoFrame.setSize(400, 400);
        myCardLayoutDemoFrame.setVisible(true);
    }
}
