package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.company.Main.battingteamname;
import static com.company.Main.overs;



public class Match_Interface extends JFrame implements ActionListener {

    public static int score = 0;
    public static int wicket = 0;
    public static int ball = 0;
    public static int currentovers = 0;

    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JTextField t, t2, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11;
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    JPanel panel = new JPanel();
    Match_Interface() {


     /*  ImageIcon icon = new ImageIcon("Lords-The-Home-Of-Cricket-Event-Spaces-Prestigious-Venues.jpg");
        JLabel label = new JLabel(icon);
        add(label);

        pack();
       setVisible(true);
*/
        JPanel panel = new JPanel();
        panel.setBounds(550,350,400,500);
        panel.setBackground(Color.gray);

        add(panel);

        r1=new JRadioButton("IMAM");
        r2=new JRadioButton("HAFEEZ");
        r3=new JRadioButton("BABAR");
        r4=new JRadioButton("FAKHAR");
        r5=new JRadioButton("SOHAIB");
        r6=new JRadioButton("RIZWAN");
        r7=new JRadioButton("IMAD");
        r8=new JRadioButton("SHADAB");
        r9=new JRadioButton("RAUF");
        r10=new JRadioButton("HASSAN");
        r11=new JRadioButton("SHAHEEN");
        r12=new JRadioButton("naseem");

        r1.setBounds(10,10,100,20);
        r2.setBounds(10,50,100,20);
        r3.setBounds(10,90,100,20);
        r4.setBounds(10,130,100,20);
        r5.setBounds(10,170,100,20);
        r6.setBounds(10,210,100,20);
        r7.setBounds(10,250,100,20);
        r8.setBounds(10,290,100,20);
        r9.setBounds(10,330,100,20);
        r10.setBounds(10,370,100,20);
        r11.setBounds(10,410,100,20);
        r12.setBounds(10,440,100,20);
        r1.setBackground(Color.white);
        r2.setBackground(Color.white);
        r3.setBackground(Color.white);
        r4.setBackground(Color.white);
        r5.setBackground(Color.white);
        r6.setBackground(Color.white);
        r7.setBackground(Color.white);
        r8.setBackground(Color.white);
        r9.setBackground(Color.white);
        r10.setBackground(Color.white);
        r11.setBackground(Color.white);
        ButtonGroup bg=new ButtonGroup();

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        bg.add(r6);
        bg.add(r7);
        bg.add(r8);
        bg.add(r9);
        bg.add(r10);
        bg.add(r11);
        bg.add(r12);
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(r6);
        panel.add(r7);
        panel.add(r8);
        panel.add(r9);
        panel.add(r10);
        panel.add(r11);
        panel.add(r12);
        panel.setLayout(null);
        r1.addActionListener(this);

        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);
        r6.addActionListener(this);
        r7.addActionListener(this);
        r8.addActionListener(this);
        r9.addActionListener(this);
        r10.addActionListener(this);
        r11.addActionListener(this);
        r12.addActionListener(this);



        l1 = new JLabel("Score/Wickets");
        l1.setFont(new Font("Osward", Font.ITALIC, 30));
        l1.setBounds(100, 50, 1200, 200);
        l1.setForeground(Color.black);
        add(l1);

        l2 = new JLabel("1st Innings");
        l2.setFont(new Font("Osward", Font.ITALIC, 25));
        l2.setBounds(10, 1, 600, 150);
        l2.setForeground(Color.white);
       add(l2);

        t = new JTextField(15);
        t.setBounds(320, 130, 300, 40);
        t.setFont(new Font("Arial", Font.BOLD, 25));
        t.setBackground(Color.white);
        t.setForeground(Color.black);

        add(t);
        t.setText(battingteamname + ": " + score + "/" + wicket);


        l3 = new JLabel("Overs");
        l3.setBackground(Color.cyan);
        l3.setFont(new Font("Osward", Font.ITALIC, 30));
        l3.setBounds(100, 120, 1200, 200);
        l3.setForeground(Color.yellow);
        add(l3);

        t2 = new JTextField(15);
        t2.setBounds(320, 200, 300, 40);
        t2.setFont(new Font("Arial", Font.BOLD, 25));
        t2.setBackground(Color.white);
        t2.setForeground(Color.black);

        add(t2);
        t2.setText(currentovers + "." + ball + "/" + overs);




        T1 = new JTextField(15);
        T1.setBounds(110, 10, 250, 20);
        T1.setFont(new Font("Arial", Font.ITALIC, 15));
        T1.setBackground(Color.white);
        T1.setForeground(Color.black);
        T1.setText("("+score+")"+"("+wicket+")");
        T2 = new JTextField(15);
        T2.setBounds(110, 50, 250, 20);
        T2.setFont(new Font("Arial", Font.ITALIC, 15));
        T2.setBackground(Color.white);
        T2.setForeground(Color.black);
        T2.setText("("+score+")"+"("+wicket+")");
        T3 = new JTextField(15);
        T3.setBounds(110, 90, 250, 20);
        T3.setFont(new Font("Arial", Font.ITALIC, 15));
        T3.setBackground(Color.white);
        T3.setForeground(Color.black);
        T4 = new JTextField(15);
        T4.setBounds(110, 130, 250, 20);
        T4.setFont(new Font("Arial", Font.ITALIC, 15));
        T4.setBackground(Color.white);
        T4.setForeground(Color.black);

        T5 = new JTextField(15);
        T5.setBounds(110, 170, 250, 20);
        T5.setFont(new Font("Arial", Font.ITALIC, 15));
        T5.setBackground(Color.white);
        T5.setForeground(Color.black);
        T6 = new JTextField(15);
        T6.setBounds(110, 210, 250, 20);
        T6.setFont(new Font("Arial", Font.ITALIC, 15));
        T6.setBackground(Color.white);
        T6.setForeground(Color.black);
        T7 = new JTextField(15);
        T7.setBounds(110, 250, 250, 20);
        T7.setFont(new Font("Arial", Font.ITALIC, 15));
        T7.setBackground(Color.white);
        T7.setForeground(Color.black);
        T8 = new JTextField(15);
        T8.setBounds(110, 290, 250, 20);
        T8.setFont(new Font("Arial", Font.ITALIC, 15));
        T8.setBackground(Color.white);
        T8.setForeground(Color.black);

        T9 = new JTextField(15);
        T9.setBounds(110, 330, 250, 20);
        T9.setFont(new Font("Arial", Font.ITALIC, 15));
        T9.setBackground(Color.white);
        T9.setForeground(Color.black);
        T10 = new JTextField(15);
        T10.setBounds(110, 370, 250, 20);
        T10.setFont(new Font("Arial", Font.ITALIC, 15));
        T10.setBackground(Color.white);
        T10.setForeground(Color.black);
        T11 = new JTextField(15);
        T11.setBounds(110, 410, 250, 20);
        T11.setFont(new Font("Arial", Font.ITALIC, 15));
        T11.setBackground(Color.white);
        T11.setForeground(Color.black);

        panel.add(T1);
        panel.add(T2);
        panel.add(T3);
        panel.add(T4);
        panel.add(T5);
        panel.add(T6);
        panel.add(T7);
        panel.add(T8);
        panel.add(T9);
        panel.add(T10);
        panel.add(T11);





        b1 = new JButton("0");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b2 = new JButton("1");
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLACK);
        b3 = new JButton("2");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b4 = new JButton("3");
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b5 = new JButton("4");
        b5.setBackground(Color.white);
        b5.setForeground(Color.black);
        b6 = new JButton("5");
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.BLACK);
        b7 = new JButton("6");
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);
        b8 = new JButton("WD BALL");
        b8.setBackground(Color.WHITE);
        b8.setForeground(Color.BLACK);
        b9 = new JButton("WKT");
        b9.setBackground(Color.white);
        b9.setForeground(Color.BLACK);


        setLayout(null);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBounds(100, 350, 100, 60);
       add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBounds(250, 350, 100, 60);

      add(b2);
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.setBounds(400, 350, 100, 60);
     add(b3);
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.setBounds(100, 470, 100, 60);
      add(b4);

        setLayout(null);
        b5.setFont(new Font("Arial", Font.BOLD, 15));
        b5.setBounds(250, 470, 100, 60);
      add(b5);
        b6.setFont(new Font("Arial", Font.BOLD, 15));
        b6.setBounds(400, 470, 100, 60);
     add(b6);


        b7.setFont(new Font("Arial", Font.BOLD, 15));
        b7.setBounds(100, 590, 100, 60);
 add(b7);
        b8.setFont(new Font("Arial", Font.BOLD, 15));
        b8.setBounds(250, 590, 100, 60);
     add(b8);
        b9.setFont(new Font("Arial", Font.BOLD, 15));
        b9.setBounds(400, 590, 100, 60);
        add(b9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


        setSize(1700, 900);
        setLocation(150, 50);
       // getContentPane().setBackground(Color.gray);
        setVisible(true);


    }
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    Player p5 = new Player();
    Player p6 = new Player();
    Player p7 = new Player();
    Player p8 = new Player();
    Player p9 = new Player();
    Player p10 = new Player();
    Player p11 = new Player();




    //int player_data[]= {p1.player_score, p1.player_Balls};
    @Override
    public void actionPerformed(ActionEvent e) {
        //for player 1

        if (r1.isSelected())
        {
        if (e.getSource()==b1)
        {
            p1.player_Balls++;
             dotball();
             T1.setEditable(false);
             T1.setText("");
             T1.setText(T1.getText().concat(String.valueOf("("+ p1.player_score+")"+"("+p1.player_Balls+")")));

             overs(); }




   if (e.getSource()==b2){
        onerun();
        T1.setEditable(false);
        T1.setText("");

        p1.player_score = p1.player_score + 1;
        p1.player_Balls++;
        T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" +p1.player_Balls + ")")));
    }
    overs();



           if (e.getSource()==b3)
         {
        tworuns();
        T1.setEditable(false);
        T1.setText("");

        p1.player_score = p1.player_score + 2;
        p1.player_Balls++;
        T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" + p1.player_Balls + ")")));
       overs();
        }

            if (e.getSource()==b4)
            {T1.setEditable(false);
                T1.setText("");

                p1.player_score = p1.player_score + 3;
                T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" + p1.player_Balls+ ")")));
                p1.player_Balls++;
                threeruns();
               overs();
            }
            if (e.getSource()==b5)
            {T1.setEditable(false);
                T1.setText("");

                p1.player_score = p1.player_score + 4;
                T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" + p1.player_Balls+ ")")));
                p1.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {  T1.setEditable(false);
                T1.setText("");

                p1.player_score = p1.player_score + 5;
                T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" + p1.player_Balls + ")")));
                p1.player_Balls++;
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T1.setEditable(false);
                T1.setText("");
                p1.player_Balls++;
                p1.player_score = p1.player_score + 6;
                T1.setText(T1.getText().concat(String.valueOf("(" + p1.player_score + ")" + "(" + p1.player_Balls+ ")")));

                sixruns();
                overs();
            }
        }
    //for player 2
        if (r2.isSelected())
        {
            if (e.getSource()==b1)
            {    T2.setText("");

                p2. player_Balls++;
                dotball();
                T2.setEditable(false);

                T2.setText(T2.getText().concat(String.valueOf("("+ p2.player_score+")"+"("+p2.player_Balls+")")));

                overs();
            }

            if (e.getSource()==b2) {

                onerun();
                {
                    T2.setEditable(false);
                    T2.setText("");

                    p2.player_score = p2.player_score + 1;
                    p2.player_Balls++;
                    T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" +p2.player_Balls + ")")));
                }
                overs();
            }


            if (e.getSource()==b3)
            {
                tworuns();
                T2.setEditable(false);
                T2.setText("");

                p2.player_score = p2.player_score + 2;
                p2.player_Balls++;
                T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" + p2.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {   T2.setEditable(false);
                T2.setText("");

                p2.player_score = p2.player_score + 3;
                T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" + p2.player_Balls+ ")")));
                p2.player_Balls++;
                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T2.setEditable(false);
                T2.setText("");

                p2.player_score = p2.player_score + 4;
                T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" + p2.player_Balls+ ")")));
                p2.player_Balls++;fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {  T2.setEditable(false);
                T2.setText("");

                p2.player_score = p2.player_score + 5;
                T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" + p2.player_Balls + ")")));
                p2.player_Balls++;
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T2.setEditable(false);
                T2.setText("");

                p2.player_score = p2.player_score + 6;
                T2.setText(T2.getText().concat(String.valueOf("(" + p2.player_score + ")" + "(" + p2.player_Balls+ ")")));
                p2.player_Balls++;
                sixruns();
                overs();
            }
        }
//for player 3
            if (r3.isSelected())
            {
               if (e.getSource()==b1)
                {
                p3.player_Balls++;
                dotball();
                T3.setEditable(false);
                T3.setText("");
                T3.setText(T3.getText().concat(String.valueOf("("+ p3.player_score+")"+"("+p3.player_Balls+")")));
                overs();
                }




            if (e.getSource()==b2){
                onerun();
                T3.setEditable(false);
                T3.setText("");

                p3.player_score = p3.player_score + 1;
                p3.player_Balls++;
                T3.setText(T3.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" +p3.player_Balls + ")")));
            }
            overs();



            if (e.getSource()==b3)
            {
                tworuns();
                T3.setEditable(false);
                T3.setText("");

                p3.player_score = p3.player_score + 2;
                p3.player_Balls++;
                T3.setText(T3.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" + p3.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {T3.setEditable(false);
                T3.setText("");
                p3.player_Balls++;
                p3.player_score = p3.player_score + 3;
                T3.setText(T3.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" + p3.player_Balls+ ")")));

                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T3.setEditable(false);
                T3.setText("");

                p3.player_score = p3.player_score + 4;
                T3.setText(T3.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" + p3.player_Balls+ ")")));
                p3.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {  T3.setEditable(false);
                T3.setText("");

                p3.player_score = p3.player_score + 5;
                T3.setText(T1.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" + p3.player_Balls + ")")));
                p3.player_Balls++;
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T3.setEditable(false);
                T3.setText("");
                p3.player_Balls++;
                p3.player_score = p3.player_score + 6;
                T3.setText(T3.getText().concat(String.valueOf("(" + p3.player_score + ")" + "(" + p3.player_Balls+ ")")));

                sixruns();
                overs();
            }
        }
            //-----------------------------------------for player 4 ---------------------------------------------------
        if (r4.isSelected())
        {
            if (e.getSource()==b1)
            {
                p4.player_Balls++;
                dotball();
                T4.setEditable(false);
                T4.setText("");
                T4.setText(T4.getText().concat(String.valueOf("("+ p4.player_score+")"+"("+p4.player_Balls+")")));
                overs();
            }
            if (e.getSource()==b2){
                onerun();
                T4.setEditable(false);
                T4.setText("");

                p4.player_score = p4.player_score + 1;
                p4.player_Balls++;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" +p4.player_Balls + ")")));
            }
            overs();



            if (e.getSource()==b3)
            {
                tworuns();
                T4.setEditable(false);
                T4.setText("");

                p4.player_score = p1.player_score + 2;
                p4.player_Balls++;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" + p4.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {T4.setEditable(false);
                T4.setText("");

                p4.player_score = p4.player_score + 3;
                p4.player_Balls++;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" + p4.player_Balls+ ")")));

                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T4.setEditable(false);
                T4.setText("");
                p4.player_Balls++;
                p4.player_score = p4.player_score + 4;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" + p4.player_Balls+ ")")));
                p4.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {
                T4.setEditable(false);
                T4.setText("");
                p4.player_score = p4.player_score + 5;
                p4.player_Balls++;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" + p4.player_Balls + ")")));
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T4.setEditable(false);
                T4.setText("");
                p4.player_Balls++;
                p4.player_score = p1.player_score + 6;
                T4.setText(T4.getText().concat(String.valueOf("(" + p4.player_score + ")" + "(" + p4.player_Balls+ ")")));

                sixruns();
                overs();
            }
        }
//---------------------------------------- for player 5 -------------------------------------------------------------
        if (r5.isSelected())
        {
            if (e.getSource()==b1)
            {
                p5.player_Balls++;
                dotball();
                T5.setEditable(false);
                T5.setText("");
                T5.setText(T5.getText().concat(String.valueOf("("+ p5.player_score+")"+"("+p5.player_Balls+")")));
                overs();
            }
            if (e.getSource()==b2){
                onerun();
                T5.setEditable(false);
                T5.setText("");

                p5.player_score = p5.player_score + 1;
                p5.player_Balls++;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" +p5.player_Balls + ")")));
            }
            overs();



            if (e.getSource()==b3)
            {
                tworuns();
                T5.setEditable(false);
                T5.setText("");
                p5.player_score = p5.player_score + 2;
                p5.player_Balls++;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" + p5.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {T5.setEditable(false);
                T5.setText("");

                p5.player_score = p5.player_score + 3;
                p5.player_Balls++;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" + p5.player_Balls+ ")")));
                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T5.setEditable(false);
                T5.setText("");
                p5.player_Balls++;
                p5.player_score = p5.player_score + 4;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" + p5.player_Balls+ ")")));
                p5.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {
                T5.setEditable(false);
                T5.setText("");
                p5.player_score = p5.player_score + 5;
                p5.player_Balls++;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" + p5.player_Balls + ")")));
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T5.setEditable(false);
                T5.setText("");
                p5.player_Balls++;
                p5.player_score = p5.player_score + 6;
                T5.setText(T5.getText().concat(String.valueOf("(" + p5.player_score + ")" + "(" + p5.player_Balls+ ")")));
                sixruns();
                overs();
            }
        }
//   --------------------------------------- for player 6 ------------------------------------------------------------
        if (r6.isSelected())
        {
            if (e.getSource()==b1)
            {
                p6.player_Balls++;
                dotball();
                T6.setEditable(false);
                T6.setText("");
                T6.setText(T6.getText().concat(String.valueOf("("+ p6.player_score+")"+"("+p6.player_Balls+")")));
                overs();
            }
            if (e.getSource()==b2){
                onerun();
                T6.setEditable(false);
                T6.setText("");

                p6.player_score = p6.player_score + 1;
                p6.player_Balls++;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" +p6.player_Balls + ")")));
            }
            overs();



            if (e.getSource()==b3)
            {
                tworuns();
                T6.setEditable(false);
                T6.setText("");

                p6.player_score = p6.player_score + 2;
                p6.player_Balls++;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" + p6.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {T6.setEditable(false);
                T6.setText("");

                p6.player_score = p6.player_score + 3;
                p6.player_Balls++;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" + p6.player_Balls+ ")")));
                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T6.setEditable(false);
                T6.setText("");
                p6.player_Balls++;
                p6.player_score = p6.player_score + 4;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" + p6.player_Balls+ ")")));
                p6.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {
                T6.setEditable(false);
                T6.setText("");
                p6.player_score = p6.player_score + 5;
                p6.player_Balls++;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" + p6.player_Balls + ")")));
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T6.setEditable(false);
                T6.setText("");
                p6.player_Balls++;
                p6.player_score = p6.player_score + 6;
                T6.setText(T6.getText().concat(String.valueOf("(" + p6.player_score + ")" + "(" + p6.player_Balls+ ")")));
                sixruns();
                overs();
            }
        }
       // ----------------------------- for player 7 ---------------------------------------------------------

        if (r7.isSelected())
        {
            if (e.getSource()==b1)
            {
                p7.player_Balls++;
                dotball();
                T7.setEditable(false);
                T7.setText("");
                T7.setText(T7.getText().concat(String.valueOf("("+ p7.player_score+")"+"("+p7.player_Balls+")")));
                overs();
            }
            if (e.getSource()==b2){
                onerun();
                T7.setEditable(false);
                T7.setText("");

                p7.player_score = p6.player_score + 1;
                p7.player_Balls++;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" +p7.player_Balls + ")")));
            }
            overs();



            if (e.getSource()==b3)
            {
                tworuns();
                T7.setEditable(false);
                T7.setText("");

                p7.player_score = p7.player_score + 2;
                p7.player_Balls++;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" + p7.player_Balls + ")")));
                overs();
            }

            if (e.getSource()==b4)
            {T7.setEditable(false);
                T7.setText("");

                p7.player_score = p6.player_score + 3;
                p7.player_Balls++;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" + p7.player_Balls+ ")")));
                threeruns();
                overs();
            }
            if (e.getSource()==b5)
            {T7.setEditable(false);
                T7.setText("");
                p7.player_Balls++;
                p7.player_score = p7.player_score + 4;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" + p7.player_Balls+ ")")));
                p7.player_Balls++;
                fourruns();
                overs();
            }
            if (e.getSource()==b6)
            {
                T7.setEditable(false);
                T7.setText("");
                p7.player_score = p7.player_score + 5;
                p7.player_Balls++;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" + p7.player_Balls + ")")));
                fiveruns();
                overs();
            }
            if (e.getSource()==b7)
            {   T7.setEditable(false);
                T7.setText("");
                p7.player_Balls++;
                p7.player_score = p6.player_score + 6;
                T7.setText(T7.getText().concat(String.valueOf("(" + p7.player_score + ")" + "(" + p7.player_Balls+ ")")));
                sixruns();
                overs();
            }
        }


        if (e.getSource()==b8)
        {
            score=score+1;
            t.setEditable(false);
            t2.setEditable(false);
            t.setText("");
            t2.setText("");
            t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
            t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));

            if (ball == 5) {
                ball = ball * 0;
                ball--;
                currentovers++;
                            }
        }
        if (e.getSource() == b9) {
                ball++;
                wicket = wicket + 1;
                t.setEditable(false);
                t2.setEditable(false);
                t.setText("");
                t2.setText("");
                t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
                t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));

                if (ball == 5) {
                    ball = ball * 0;
                    ball--;
                    currentovers++; }
        }




    }
public void dotball()
    {
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }
    public void onerun()
    {
        score++;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }
    public void tworuns()
    {
        score=score+2;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));

    }
    public void threeruns()
    {
        score=score+3;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }
    public void fourruns()
    {
        score=score+4;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }
    public void fiveruns()
    {
        score=score+5;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }
    public void sixruns()
    {
        score=score+5;
        ball++;
        t.setEditable(false);
        t2.setEditable(false);
        t.setText("");
        t2.setText("");
        t.setText(t.getText().concat(String.valueOf(battingteamname + ": " + score + "/" + wicket)));
        t2.setText(t2.getText().concat(String.valueOf(currentovers + "." + ball + "/" + overs)));
    }



    public void overs()
    {
        if (ball == 5) {
            ball = ball * 0;
            ball--;
            currentovers++;
        }
    }


    }

