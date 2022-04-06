package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyHandlingKeyEventFrame extends Frame implements KeyListener {
    Label keyPressed;
    Label keyTyped;
    Label keyReleased;
    Label time;

    public MyHandlingKeyEventFrame(){
        super("KeyEventDemo");

        keyPressed = new Label("");
        keyTyped = new Label("");
        keyReleased = new Label("");
        time = new Label("");

        setLayout(null);

        keyPressed.setBounds(30, 50, 100, 20);
        keyTyped.setBounds(30, 70, 100, 20);
        keyReleased.setBounds(30, 90, 100, 20);
        time.setBounds(30, 120, 200, 20);

        add(keyPressed);
        add(keyTyped);
        add(keyReleased);
        add(time);

        addKeyListener(this); // adding key listener to this Frame
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        keyTyped.setText("Key Typed");
        time.setText(String.valueOf(new Date(keyEvent.getWhen())));
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        keyPressed.setText("Key Pressed");
        keyReleased.setText("");
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        keyReleased.setText("Key Released");
        keyPressed.setText("");
        keyTyped.setText("");
        time.setText("");
    }
}

public class HandlingKeyEvent {
    public static void main(String[] args){
        MyHandlingKeyEventFrame myHandlingKeyEventFrame = new MyHandlingKeyEventFrame();
        myHandlingKeyEventFrame.setSize(500, 500);
        myHandlingKeyEventFrame.setVisible(true);
    }
}
