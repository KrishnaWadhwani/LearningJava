package com.javacourse.chapter30.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;

    public MyFrame(){
        super("First Swing App");

        l = new JLabel("Clicked "+(count)+" Times");
        b = new JButton("Click");

        setLayout(new FlowLayout());

        add(l);
        add(b);

        b.addActionListener(this);
        //b.setIcon(new ImageIcon("/home/krishna/IdeaProjects/Java Course/src/com/javacourse/chapter30/Swing/DownloadButton.png"));

        l.setToolTipText("Counter");
        getRootPane().setDefaultButton(b);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        l.setText("Clicked "+(count)+" Times");
    }
}

public class FirstSwingApp {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
