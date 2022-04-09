package com.javacourse.chapter30.Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class MyTabbedPaneFrame extends JFrame{

    JSplitPane sp;
    JList list;
    JLabel lbl;

    public MyTabbedPaneFrame(){
        super("Tabbed Demo");
        // data is also called model
        String[] colors = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK"};

        list = new JList(colors);
        list.setSelectedIndex(0);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                String str = (String) list.getSelectedValue();

                switch (str){
                    case "RED":
                        lbl.setBackground(Color.RED);
                        break;
                    case "GREEN":
                        lbl.setBackground(Color.GREEN);
                        break;
                    case "BLUE":
                        lbl.setBackground(Color.BLUE);
                        break;
                    case "YELLOW":
                        lbl.setBackground(Color.YELLOW);
                        break;
                    case "MAGENTA":
                        lbl.setBackground(Color.MAGENTA);
                        break;
                    case "ORANGE":
                        lbl.setBackground(Color.ORANGE);
                        break;
                    case "BLACK":
                        lbl.setBackground(Color.BLACK);
                        break;
                }
            }
        });

        JScrollPane p1 = new JScrollPane(list);
        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.RED);

        JScrollPane p2 = new JScrollPane(lbl);

        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label", p2);

        add(tp);
    }
}

public class TabbedPaneClass {
    public static void main(String[] args){
        MyTabbedPaneFrame frame = new MyTabbedPaneFrame();
        frame.setSize(new Dimension(800, 800));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
