package com.company;


import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Addproducts extends JFrame implements ActionListener {
    public static ArrayList<Addproducts> list = new ArrayList<>();
  public static JLabel l1, l2, l3, l4, label;
  public   static JTextField t1, t2, t3;

  JButton b;
    JButton button1;
   String name;
   int pricep;
   int quantity;

  /* public  Addproducts( String name ,int pricep , int quantityq ){


       this.name=name;
      this.pricep=pricep;
      this.quantity=quantityq;

     }
   public String toString() {
         return "     [ (Product name:   " +name+ ") " + " (Product Price:   "+pricep+") " + " (Product Quantity:  "+quantity +") ] ";
   }
*/

    Addproducts() {


        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("inventory-management.jpeg");
        JLabel label = new JLabel(icon);
        add(label);

        pack();
        setVisible(true);



       l1 = new JLabel("PRODUCT NAME: ");
        l1.setFont(new Font("Osward", Font.BOLD, 35));
        l1.setBounds(50, 60, 500, 100);
        l1.setForeground(Color.black);
        label.add(l1);
        l2 = new JLabel("PRODUCT PRICE: ");
        l2.setFont(new Font("Osward", Font.BOLD, 35));
        l2.setBounds(50, 200, 500, 50);
        l2.setForeground(Color.black);
        label.add(l2);
        l3 = new JLabel("QUANTITY: ");
        l3.setFont(new Font("Osward", Font.BOLD, 35));
        l3.setBounds(50, 300, 500, 100);
        l3.setForeground(Color.black);
        label.add(l3);


        t1 = new JTextField(15);
        t1.setBounds(430, 85, 400, 50);
        t1.setFont(new Font("Arial", Font.BOLD, 14));
        label.add(t1);
        t2 = new JTextField(15);
        t2.setBounds(430, 200, 400, 50);
        t2.setFont(new Font("Arial", Font.BOLD, 14));
        label.add(t2);
        t3 = new JTextField(15);
        t3.setBounds(430, 320, 400, 50);
        t3.setFont(new Font("Arial", Font.BOLD, 14));
        label.add(t3);
        b = new JButton("ENTER");
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        button1 = new JButton("Menu");
        button1.setBackground(Color.red);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);


        setLayout(null);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(350, 500, 250, 80);
        label.add(b);

        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(0, 0, 100, 20);
        label.add(button1);


        setLayout(null);
        setSize(1000, 800);
        setLocation(550, 200);

        //getContentPane().setBackground(Color.green);

        setVisible(true);





    }


    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == button1) {
            dispose();
            Main m = new Main();

        }


        String  name = t1.getText();
        String price = t2.getText();
       int pricep = Integer.parseInt(price);
        String quantity = t3.getText();
        int quantityq = Integer.parseInt(quantity);

        //Addproducts addproducts = new Addproducts(name,pricep,quantityq);
      //  list.add(addproducts);

        if (e.getSource() == b) {


            new Addproducts().setVisible(true);
            setVisible(false);


            try{

               /* if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{*/
                  /*  conn c1 = new conn();
                    String q1 = "insert into ADD_PRODUCT values('"+name+"',"+pricep+","+quantityq+")";
                    //c1.s.executeUpdate(q1);*/
                PreparedStatement stmp = null;
                ResultSet rs= stmp.executeQuery("insert into add_product values('pizza',1233,43");
while(rs.next())
    System.out.println("hi");
//Scanner srr=new Scanner();
//se.scanner=(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));

            }catch(Exception ae){
                ae.printStackTrace();
            }

        }




    }







    public static void main(String[] args) {


    }



}







