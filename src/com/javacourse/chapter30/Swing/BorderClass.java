package com.javacourse.chapter30.Swing;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyBorderClassFrame extends JFrame {
    JLabel label;
    JTextField name;
    JButton button;

    JPanel panel;

    public MyBorderClassFrame(){
        label = new JLabel("Name");
        name = new JTextField(20);
        button = new JButton("OK");
        panel = new JPanel();

        panel.add(label);
        panel.add(name);
        panel.add(button);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER, TitledBorder.CENTER);
        panel.setBorder(br);

        setLayout(new FlowLayout());

        add(panel);
    }
}
public class BorderClass {
    public static void main(String[] args){
        MyBorderClassFrame frame = new MyBorderClassFrame();
        frame.setSize(new Dimension(700, 500));
        frame.setVisible(true);
    }
}
