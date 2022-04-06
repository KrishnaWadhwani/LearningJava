package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyMenuFrame extends Frame{
    Menu file, sub;
    MenuItem open, save, close, closeAll;
    CheckboxMenuItem auto;
    TextField tf;
    public MyMenuFrame(){
        super("Menu Demo");

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeAll);

        MenuBar bar = new MenuBar();
        bar.add(file);
        setMenuBar(bar);

        tf = new TextField(20);

        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeAll.addActionListener((ActionEvent ae) -> tf.setText("Close All"));

        auto.addItemListener((ItemEvent ie) -> {
            if(auto.getState()){
                tf.setText("Auto On");
            }
            else{
                tf.setText("Auto Off");
            }
        });
    }
}

public class MenusClass {
    public static void main(String[] args){
        MyMenuFrame frame = new MyMenuFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
