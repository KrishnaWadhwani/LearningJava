package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyListBoxFrame extends Frame {
    List l;
    Choice c;
    TextArea ta;

    public MyListBoxFrame(){
        super("ListBox");

        l = new List(4, true);
        c = new Choice();
        ta = new TextArea(20, 30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());

        add(l);
        add(c);
        add(ta);

        Handler handler = new Handler();

        l.addItemListener(handler);
        l.addActionListener(handler);
        c.addItemListener(handler);

    }

    class Handler implements ItemListener, ActionListener{
        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            String[] list = l.getSelectedItems();
            String txt = "";
            if (itemEvent.getSource() == l){
                for (String x : list){
                    txt+=x+"\n";
                }
                ta.setText(txt);
            }
            else{
                ta.setText(c.getSelectedItem());
            }
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String[] list = l.getSelectedItems();

            String txt = "";

            for (String x : list){
                txt+=x+"\n";
            }
            ta.setText(txt);
        }
    }
}

public class ListBoxClass {
    public static void main(String[] args){
        MyListBoxFrame myListBoxFrame = new MyListBoxFrame();
        myListBoxFrame.setSize(500, 500);
        myListBoxFrame.setVisible(true);
    }
}
