package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.company.Addproducts.*;

public class removeProduct extends JFrame implements ActionListener {
    JLabel l1;
    JButton b;
    JButton button5;
    JTextField t;
    int flag=0;
    public static String name1;

    removeProduct() {
        l1 = new JLabel("  ENTER PRODUCT NAME TO REMOVE: ");
        l1.setFont(new Font("Osward", Font.ITALIC, 23));
        l1.setBounds(40, 60, 450, 100);
        add(l1);

        t = new JTextField(15);
        t.setBounds(500, 85, 400, 50);
        t.setFont(new Font("Arial", Font.BOLD, 14));
        add(t);
        b = new JButton("ENTER");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);

        button5 = new JButton("Menu");
        button5.setBackground(Color.red);
        button5.setForeground(Color.WHITE);
        button5.addActionListener(this);


        setLayout(null);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(350, 500, 250, 80);
        add(b);
        button5.setFont(new Font("Arial", Font.BOLD, 14));
        button5.setBounds(0, 0, 100, 20);
        add(button5);


        setLayout(null);


        setSize(1000, 800);
        setLocation(550, 200);

        getContentPane().setBackground(Color.ORANGE);

        setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button5)
        {

            dispose();
            Main m = new Main();

        }


           if (e.getSource() == b) {







               name1 = t.getText();
               for (Addproducts addproducts : list) {
                   flag=0;

                   if (addproducts.name.equals(name1)) {
                       flag=1;

                       list.remove(addproducts);
                       JOptionPane.showMessageDialog(null, "Product removed Successfully!");
                       break;

                   } else{
                       flag=0;
                   }
               }
               if (flag==0)
               {
                   JOptionPane.showMessageDialog(null, "Product is  not Available!");

               }






               dispose();
               removeProduct r = new removeProduct();
            }



    }


        public static void main (String[]args){

        }

}

