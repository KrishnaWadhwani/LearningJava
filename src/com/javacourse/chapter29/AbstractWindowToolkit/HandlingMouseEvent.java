package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class MyMouseHandlingEventFrame extends Frame implements MouseListener, MouseMotionListener{
    Label label, label2;

    public MyMouseHandlingEventFrame(){
        super("Mouse Event Demo");
        label = new Label("");
        label2 = new Label("");

        setLayout(null);
        label.setBounds(10, 50, 100, 20);
        label2.setBounds(10, 80, 100, 20);
        add(label);
        add(label2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        label.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        label.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        label.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        label.setText("Mouse Moved");
        label2.setText("("+mouseEvent.getX()+", "+mouseEvent.getY()+")");
    }
}

public class HandlingMouseEvent {
    public static void main(String[] args){
        MyMouseHandlingEventFrame myMouseHandlingEventFrame = new MyMouseHandlingEventFrame();
        myMouseHandlingEventFrame.setSize(500, 500);
        myMouseHandlingEventFrame.setVisible(true);
    }
}
