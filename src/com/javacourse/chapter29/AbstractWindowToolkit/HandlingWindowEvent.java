package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyWindowEventHandlingFrame extends Frame implements WindowListener {

    Label l;

    public MyWindowEventHandlingFrame(){
        super("Window Event Handling");
        l = new Label("                       ");
        setLayout(new FlowLayout());
        addWindowListener(this);
        add(l);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        l.setText("Window Deactivated");
    }
}

public class HandlingWindowEvent {
    public static void main(String[] args){
        MyWindowEventHandlingFrame myWindowEventHandlingFrame = new MyWindowEventHandlingFrame();
        myWindowEventHandlingFrame.setSize(400, 400);
        myWindowEventHandlingFrame.setVisible(true);
    }
}
