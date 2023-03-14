package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ENTER_INFO extends JFrame {

    ENTER_INFO() {
        JLabel l1, l2, l3;
        JButton b1;
        JTextField t1, t2, t3;



      /*  JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("c2.jpg");
        JLabel label = new JLabel(icon);

        label.setSize(700, 400);
        label.setLocation(300,900);

        add(label);

        pack();
        setVisible(true);*/


        l1 = new JLabel("Team 1");
        l1.setFont(new Font("Osward", Font.ITALIC, 35));
        l1.setBounds(100, 60, 1200, 200);
        l1.setForeground(Color.black);
       add(l1);

        l2 = new JLabel("Team 2");
        l2.setFont(new Font("Osward", Font.ITALIC, 35));
        l2.setBounds(100, 200, 1200, 200);
        l2.setForeground(Color.black);
        add(l2);

        l3 = new JLabel("Overs");
        l3.setFont(new Font("Osward", Font.ITALIC, 35));
        l3.setBounds(100, 340, 1200, 200);
        l3.setForeground(Color.black);
      add(l3);


        t1 = new JTextField(15);
        t1.setBounds(100, 200, 400, 40);
        t1.setFont(new Font("Arial", Font.BOLD, 14));
        add(t1);
        t2 = new JTextField(15);
        t2.setBounds(100, 340, 400, 40);
        t2.setFont(new Font("Arial", Font.BOLD, 14));
        add(t2);
        t3 = new JTextField(15);
        t3.setBounds(100, 490, 400, 40);
        t3.setFont(new Font("Arial", Font.BOLD, 14));
        add(t3);

        b1 = new JButton("OK");
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBounds(250, 590, 100, 60);
        add(b1);





setLayout(null);
        setSize(1600, 900);
        setLocation(150, 50);
        getContentPane().setBackground(Color.gray);
        setVisible(true);
    }


    public static void main(String[] args) {
        ENTER_INFO e = new ENTER_INFO();
    }
}