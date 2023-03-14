/*package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.company.Addproducts.*;
//import static com.company.Addproducts.list;

public class calculateBill extends JFrame implements ActionListener {
    JLabel label1,label2;
    JButton button1,button2,button3;
    JTextField textField1,textField2;
    public static String Name;
    public static int Quantity;
    public static  int Bill;
    public static   int TotalBill=0;
    int flag=0;
    calculateBill()
    {
        label1 = new JLabel("PRODUCT NAME: ");
        label1.setFont(new Font("Osward", Font.BOLD, 23));
        label1.setBounds(130, 60, 450, 100);
        add(label1);

        textField1 = new JTextField(15);
        textField1.setBounds(500, 85, 400, 50);
        textField1.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField1);


         label2= new JLabel("  QUANTITY: ");
        label2.setFont(new Font("Osward", Font.BOLD, 23));
        label2.setBounds(130, 170, 450, 100);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(500, 200, 400, 50);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);
        button1 = new JButton("Menu");
        button1.setBackground(Color.red);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);


        button2 = new JButton("ADD");
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);

        button3 = new JButton("Calculate Bill");
        button3.setBackground(Color.blue);
        button3.setForeground(Color.WHITE);
        button3.addActionListener(this);


        setLayout(null);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(0, 0, 100, 20);
        add(button1);


        button2.setFont(new Font("Arial", Font.ITALIC, 14));
        button2.setBounds(640, 300, 100, 50);
        add(button2);

        button3.setFont(new Font("Arial", Font.ITALIC, 20));
        button3.setBounds(350, 500, 250, 80);
        add(button3);









        setSize(1000, 800);
        setLocation(550, 200);

        getContentPane().setBackground(Color.ORANGE);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button1)
        {
            dispose();
            Main m = new Main();
        }
        if (e.getSource()==button2)
        {

            Name = textField1.getText();
            String Quantity1=textField2.getText();
            Quantity = Integer.parseInt(Quantity1);

            for (Addproducts addproducts : list) {
                flag=0;

                if (addproducts.name.equals(Name)&&addproducts.quantity>=Quantity) {
                    flag=1;


                    Bill= addproducts.pricep*Quantity;
                    addproducts.quantity = addproducts.quantity-Quantity;

                    TotalBill = TotalBill + Bill;


                    break;

                }

                else
                {
                    flag=0;
                }
            }





            if (flag==0)
            {

                JOptionPane.showMessageDialog(null, "Product is  not Available!");
            }



            dispose();
            calculateBill cb = new calculateBill();

        }


        if (e.getSource()==button3)
        {

            JOptionPane.showMessageDialog(null,TotalBill);
            TotalBill=0;

        }



    /*    Name = textField1.getText();
         String Quantity1=textField2.getText();
         Quantity = Integer.parseInt(Quantity1);

        for (Addproducts addproducts : list) {
            flag=0;

            if (addproducts.name.equals(Name)&&addproducts.quantity>=Quantity) {
                flag=1;


              Bill= addproducts.pricep*Quantity;
              addproducts.quantity = addproducts.quantity-Quantity;

                TotalBill = TotalBill + Bill;


                break;

            }

            else
            {
                flag=0;
            }
        }





        if (flag==0)
        {

            JOptionPane.showMessageDialog(null, "Product is  not Available!");
        }




    }
}
*/
