package com.company;

import javax.swing.*;
import java.awt.*;

import static com.company.Main.battingteamname;


public class Live_Match extends JFrame {

    Live_Match() {


        JLabel l1, l2, l3, lthisover;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
        JTextField t, t2, t3,tr1,tr2, tbolwer,tthisover;
        JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;


        l1 = new JLabel("Pakistan");
        l1.setFont(new Font("Osward", Font.PLAIN, 30));
        l1.setBounds(140, 0, 1200, 200);
        l1.setForeground(Color.black);
        add(l1);

        l2 = new JLabel("Overs");
        l2.setFont(new Font("Osward", Font.PLAIN, 30));
        l2.setBounds(430, 0, 1200, 200);
        l2.setForeground(Color.black);
        add(l2);

        l3 = new JLabel("CRR");
        l3.setFont(new Font("Osward", Font.PLAIN, 30));
        l3.setBounds(740, 0, 1200, 200);
        l3.setForeground(Color.black);
        add(l3);

        lthisover = new JLabel("This Over:");
        lthisover.setFont(new Font("Osward", Font.PLAIN, 20));
        lthisover.setBounds(460, 210, 1200, 200);
        lthisover.setForeground(Color.black);
        add(lthisover);


        t = new JTextField(15);
        t.setBounds(140, 125, 200, 35);
        t.setFont(new Font("Arial", Font.BOLD, 25));
        t.setBackground(Color.white);
        t.setForeground(Color.black);
        t.setEditable(false);
        add(t);
        t.setText( "0/0");

        t2 = new JTextField(15);
        t2.setBounds(430, 125, 200, 35);
        t2.setFont(new Font("Arial", Font.BOLD, 25));
        t2.setBackground(Color.white);
        t2.setForeground(Color.black);
        t2.setEditable(false);
        add(t2);
        t2.setText( "0/20");

        t3 = new JTextField(15);
        t3.setBounds(740, 125, 200, 35);
        t3.setFont(new Font("Arial", Font.BOLD, 25));
        t3.setBackground(Color.white);
        t3.setForeground(Color.black);
        t3.setEditable(false);
        add(t3);
        t3.setText( "0.0");

        r1=new JRadioButton("IMAM");
        r1.setBounds(140,220,150,30);
        r1.setBackground(Color.gray);
        add(r1);


        tr1 = new JTextField(15);
        tr1.setBounds(295, 220, 150, 30);
        tr1.setFont(new Font("Arial", Font.BOLD, 25));
        tr1.setBackground(Color.white);
        tr1.setForeground(Color.black);
        tr1.setEditable(false);
        add(tr1);
        tr1.setText( "0/0");


        r2=new JRadioButton("HAFEEZ");
        r2.setBounds(140,300,150,30);
        r2.setBackground(Color.gray);
        add(r2);


        tr2 = new JTextField(15);
        tr2 .setBounds(295, 300, 150, 30);
        tr2 .setFont(new Font("Arial", Font.BOLD, 25));
        tr2 .setBackground(Color.white);
        tr2 .setForeground(Color.black);
        tr2 .setEditable(false);
        add(tr2 );
        tr2 .setText( "0/0");

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        tbolwer = new JTextField(15);
        tbolwer.setBounds(595, 220, 350, 30);
        tbolwer.setFont(new Font("Arial", Font.PLAIN, 20));
        tbolwer.setBackground(Color.white);
        tbolwer.setForeground(Color.black);

        add( tbolwer);
        tbolwer.setText("Nawaz:  "+ "0/0"+"-"+"0");

        tthisover = new JTextField(15);
        tthisover .setBounds(600, 300, 300, 25);
        tthisover .setFont(new Font("Arial", Font.PLAIN, 20));
        tthisover .setBackground(Color.white);
        tthisover .setForeground(Color.black);
        tthisover .setEditable(false);
        add( tthisover );
        tthisover .setText( "0 6 4 2 1 0");



        setLayout(null);
        setSize(1600, 900);
        setLocation(150, 50);
       // getContentPane().setBackground(Color.gray);
        setVisible(true);
    }

    public static void main(String[] args) {
        Live_Match l = new Live_Match();
    }


}
