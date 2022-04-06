package com.javacourse.chapter29.AbstractWindowToolkit.Practice;

import java.awt.*;

class MyFrame extends Frame{
    Button button;
    Label label;
    TextArea textArea;
    public MyFrame(){
        super("Application Submitter");

        setLayout(new FlowLayout());

        button = new Button("Submit Application");
        label = new Label("Application");
        textArea = new TextArea();

        add(label);
        add(textArea);
        add(button);
    }
}
public class PracticeAWTApp {
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame();
        myFrame.setSize(400, 400);
        myFrame.setVisible(true);
    }
}
