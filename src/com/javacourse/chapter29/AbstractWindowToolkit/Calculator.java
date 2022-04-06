package com.javacourse.chapter29.AbstractWindowToolkit;

import java.awt.*;
import java.awt.event.*;

class CalculatorFrame extends Frame{
    TextField screen;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button bPlus;
    Button bMinus;
    Button bDivide;
    Button bMultiply;
    Button bEquals;
    Button bBackspace;

    public CalculatorFrame(){

        super("Calculator");

        screen = new TextField(20);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bPlus = new Button("+");
        bMinus = new Button("-");
        bDivide = new Button("/");
        bMultiply = new Button("*");
        bEquals = new Button("=");
        bBackspace = new Button("⟵");

        setLayout(null);

        Font font = new Font("SansSerif", Font.PLAIN, 50);
        Font font1 = new Font("SansSerif", Font.PLAIN, 30);
        screen.setBounds(0, 10, 400, 100);
        screen.setFont(font);
        screen.setEditable(false);
        screen.setBackground(new Color(255, 255, 255));

        // key board
        // 1st row
        b7.setBounds(0, 100, 100, 100);
        b8.setBounds(100, 100, 100, 100);
        b9.setBounds(200, 100, 100, 100);
        bPlus.setBounds(300, 100, 100, 100);

        // 2nd row
        b4.setBounds(0, 200, 100, 100);
        b5.setBounds(100, 200, 100, 100);
        b6.setBounds(200, 200, 100, 100);
        bMinus.setBounds(300, 200, 100, 100);

        // 3rd row
        b1.setBounds(0, 300, 100, 100);
        b2.setBounds(100, 300, 100, 100);
        b3.setBounds(200, 300, 100, 100);
        bMultiply.setBounds(300, 300, 100, 100);

        // 4th row
        b0.setBounds(0, 400, 100, 100);
        bDivide.setBounds(100, 400, 100, 100);
        bEquals.setBounds(200, 400, 100, 100);
        bBackspace.setBounds(300, 400, 100, 100);

        Handler handler = new Handler();

        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        bPlus.addActionListener(handler);

        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        bMinus.addActionListener(handler);

        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        bMultiply.addActionListener(handler);

        b0.addActionListener(handler);
        bDivide.addActionListener(handler);
        bEquals.addActionListener(handler);
        bBackspace.addActionListener(handler);

        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        bPlus.setFont(font1);

        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        bMinus.setFont(font1);;

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        bMultiply.setFont(font1);

        b0.setFont(font1);
        bDivide.setFont(font1);
        bEquals.setFont(font1);
        bBackspace.setFont(font1);

        add(screen);
        add(b7);
        add(b8);
        add(b9);
        add(bPlus);

        add(b4);
        add(b5);
        add(b6);
        add(bMinus);

        add(b1);
        add(b2);
        add(b3);
        add(bMultiply);

        add(b0);
        add(bDivide);
        add(bEquals);
        add(bBackspace);

        addWindowListener(new WindowCloser());
    }
    class Handler implements ActionListener {
        String calc;
        String[] operators;
        String[] operands;

        int calculated;

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try{
                if(actionEvent.getActionCommand().matches("=")){
                    operands = calc.split("[+*/-]");
                    operators = calc.split("[0-9]+");

                    calculated = Integer.parseInt(operands[0]);

                    for (int i = 1 ; i < operands.length ; i++){
                        if (operators[i].equals("+")){
                            calculated+=Integer.parseInt(operands[i]);
                            calc = String.valueOf(calculated);
                        }
                        if (operators[i].equals("-")){
                            calculated-=Integer.parseInt(operands[i]);
                            calc = String.valueOf(calculated);
                        }
                        if (operators[i].equals("*")){
                            calculated*=Integer.parseInt(operands[i]);
                            calc = String.valueOf(calculated);
                        }
                        if (operators[i].equals("/")){
                            calculated/=Integer.parseInt(operands[i]);
                            calc = String.valueOf(calculated);
                        }
                        screen.setText(String.valueOf(calculated));
                    }
                }
                else if(actionEvent.getActionCommand().matches("⟵")){
                    calc = calc.substring(0, calc.length() - 1);
                    screen.setText(calc);
                }
                else{
                    calc=screen.getText()+actionEvent.getActionCommand();
                    screen.setText(calc);
                }
            }
            catch (Exception ignored){}
        }
    }

    class WindowCloser extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
    }

}
public class Calculator {
    public static void main(String[] args){
        CalculatorFrame calculatorFrame = new CalculatorFrame();
        calculatorFrame.setSize(400, 500);
        calculatorFrame.setVisible(true);
    }
}
