package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.Addproducts.*;

public class view extends JFrame implements ActionListener {
JPanel panel = new JPanel();
JButton b;

   view() {
       panel.setBackground(Color.white);
       add(panel);

       panel.setBounds(0,0,1000,700);




       b = new JButton("EXIT");
       b.setBackground(Color.RED);
       b.setForeground(Color.BLUE);

        b.addActionListener(this);

       setLayout(null);
       b.setFont(new Font("Arial", Font.BOLD, 20));
       b.setBounds(380, 701, 200, 60);
     add(b);



       for (Addproducts addproducts : list) {
           JLabel j1 = new JLabel(String.valueOf(addproducts));




           panel.add(j1);



       }



       setSize(1000, 800);
       setLocation(550, 200);
       setVisible(true);

       for(Addproducts addproducts:list)
       {
           System.out.println(addproducts);}
   }



    public static void main(String[] args) {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b)
        {  dispose();
            new Main().setVisible(true);
        }
    }

}

