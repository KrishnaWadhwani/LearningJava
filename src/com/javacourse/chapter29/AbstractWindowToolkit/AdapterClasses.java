package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyAdapterClassesFrame extends Frame{
    public MyAdapterClassesFrame(){
        super("Adapter Demo");

        //addWindowListener(new MyWindowAdapter());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    class MyWindowAdapter extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
}

public class AdapterClasses {
    public static void main(String[] args){
        MyAdapterClassesFrame myAdapterClassesFrame = new MyAdapterClassesFrame();
        myAdapterClassesFrame.setSize(500, 500);
        myAdapterClassesFrame.setVisible(true);
    }
}
