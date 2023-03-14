package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.company.Addproducts.*;


public class Main extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1,b2,b3,b4;
    JTextField t;
    Main()
    {


        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("91XjzlfZ20L.jpg");
        JLabel label = new JLabel(icon);
        add(label);

        pack();
        setVisible(true);




        t = new JTextField(15);
        t.setBounds(300, 85, 400, 50);
        t.setFont(new Font("Arial", Font.BOLD, 25));
        t.setBackground(Color.white);
        t.setForeground(Color.black);

        label.add(t);
       t.setEditable(false);
        t.setText("       ZANTEK SUPER MARKET");

     l1 = new JLabel("Developer: ZAIN IJAZ * FA20_BCS_107");
        l1.setFont(new Font("Osward", Font.BOLD, 25));
        l1.setBounds(10,700,500,40);
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);

        label.add(l1);




        b1 = new JButton("Add Products");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b2 = new JButton("View Products");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b3 = new JButton("Remove Product");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b4 = new JButton("Calculate Bill");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        setLayout(null);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(90,250,250,80);
        label.add(b1);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(90,500,250,80);
        label.add(b3);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(600,250,250,80);
        label.add(b2);
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setBounds(600,500,250,80);
        label.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);




        setSize(1000,800);
       setLocation(550,200);

      //getContentPane().setBackground(Color.ORANGE);

        setVisible(true);



    }




    public void actionPerformed(ActionEvent e)
    {
if (e.getSource()==b1)
{ setVisible(false);
   dispose();
    new Addproducts().setVisible(true);

}
/*else if (e.getSource()==b2)
{setVisible(false);

    dispose();
 view v  = new view();


}
else if (e.getSource()==b3)
{
    dispose();
    removeProduct r = new removeProduct();

}
else if (e.getSource()==b4)
{setVisible(false);
    calculateBill cb = new calculateBill();
}


*/
    }



    public static void main(String[] args)
    {


new Main().setVisible(true);




    }






    }

