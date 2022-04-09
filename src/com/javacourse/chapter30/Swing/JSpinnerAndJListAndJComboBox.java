package com.javacourse.chapter30.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJSpinnerAndJListAndJComboBoxFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox cb;
    JList list;
    JSpinner sp1, sp2;
    JTextField tf;
    JScrollPane sp;
    public MyJSpinnerAndJListAndJComboBoxFrame(){
        super("Spinner Demo");
        String[] countries = {"India", "US", "UK", "Canada", "Australia"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(countries);
        list = new JList(months);
        list.setVisibleRowCount(5);
        sp = new JScrollPane(list);

        tf = new JTextField(15);

        sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        sp2 = new JSpinner(new SpinnerListModel(days));

        setLayout(new FlowLayout());

        add(cb);
        add(sp1);
        add(sp2);
        add(sp);
        add(tf);

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        tf.setText(String.valueOf(cb.getSelectedItem()));
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        tf.setText((String)list.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if(changeEvent.getSource() == sp1){
            tf.setText(String.valueOf(sp1.getValue()));
        }
        else{
            tf.setText((String)sp2.getValue());
        }
    }
}

public class JSpinnerAndJListAndJComboBox {
    public static void main(String[] args){
        MyJSpinnerAndJListAndJComboBoxFrame frame = new MyJSpinnerAndJListAndJComboBoxFrame();
        frame.setSize(new Dimension(500, 500));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
