package com.company;



import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static Scanner u = new Scanner(System.in);
    public static String playername1[] = new String[2];
    public static String playername2[] = new String[2];
    public static int player1score[] = new int[2];
    public static int player1balls[] = new int[2];
    static String t1,t2;
    static int option;
    static int score =0;
    static int wicket =0;
    static int ball =0;
    static int overs =0;
    static int enterover;

    static int score1 =0;
    static int wicket1 =0;
    static int ball1 =0;
    static int overs1 =0;
    static int s1,s2;



    public static void main(String[] args)  {

        JOptionPane.showMessageDialog(null,"welcome to zantek cricket scoring software");
        JOptionPane.showMessageDialog(null,"about developer: This program is made from scratch by zain ijaz |FA20-BCS-107");
        JOptionPane.showMessageDialog(null,"how it works: you have to enter the run/wide/no-ball/wicket after every ball in inputbox and view live results on console");

       teamname();
        enterovers();
        gameonhay();



    }
    /*static void playernames()
    {
        System.out.println("ENTER PLAYER NAMES of "+t1);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter player " + (1 + i));
            playername1[i] = u.nextLine(); }
        System.out.println("ENTER PLAYER NAMES of "+t2);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter player " + (1 + i));
            playername2[i] = u.nextLine(); }

    }*/
    static void teamname()
    {

       t1= JOptionPane.showInputDialog("Enter name of batting team  ");


        t2= JOptionPane.showInputDialog("Enter name of bowling team  ");




    }
  /*  static void displayplayername()
    {
        System.out.println(t1+" playing 11 :");
        for (String element: playername1){
            System.out.println(element);
        }
        System.out.println(t2+" playing 11 :");
        for (String element: playername2){
            System.out.println(element);
        }
    }*/
    static void gameonhay()
    {
            battingteam1();
            battingteam2(); }
    static void battingteam1()
    {
        JOptionPane.showMessageDialog(null,"MATCH START");
        JOptionPane.showMessageDialog(null, "1ST INNINGS" );

        scorecard();

        while(true)
        {

            String p= JOptionPane.showInputDialog("ENTER: RUNS/WICKET");

            option=Integer.parseInt(p);

            if (option == 0)
            {

                System.out.println(t1+":"+score+"/"+wicket);
                System.out.println("overs: "+overs+"."+ball);
                ball++;

                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;
                    }


            }
            if (option == 1)
            {
                 score++;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);

                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;
                    }

            }
            if (option == 2)
            {
                score=score+2;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);

                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;
                   }

            }
            if (option == 3)
            {
                score =score+3;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);
                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}
            }
            if (option == 4)
            {
                score=score+4;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);
                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}
            }
            if (option == 5)
            {
                score=score+5;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);
                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}
            }
            if (option == 6)
            {
                score=score+6;
                System.out.println(t1+":"+score+"/"+wicket);
                ball++;
                System.out.println("overs: "+overs+"."+ball);

                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}

            }
            if (option == 7)
            {

                JOptionPane.showMessageDialog(null, "wicket");
                wicket++;
                System.out.println(t1+":"+score+"/"+wicket);

                ball++;
                System.out.println("overs: "+overs+"."+ball);
                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}

            }
            if (option == 8)
            {
                JOptionPane.showMessageDialog(null, "wide / no ball");
                wicket=wicket+1;
                score++;
                System.out.println(t1+":"+score+"/"+wicket);
                System.out.println("overs: "+overs+"."+ball);
                if(ball==5)
                {ball = ball*0;
                    ball--;
                    overs++;}
            }
            if (wicket==10 || enterover==overs && ball==0)
            {       s1=score;
                float runrate=score/enterover;

                JOptionPane.showMessageDialog(null, " Innings Ended ");


                JOptionPane.showMessageDialog(null," TARGET: "+(score+1)+" " );

                JOptionPane.showMessageDialog(null,t2+" Needs "+(score+1)+" runs to win in "+enterover+" overs at run-rate of "+runrate+" per over" );


                break;
            }



        }
    }
    static void battingteam2()
    {
        JOptionPane.showMessageDialog(null,"MATCH START");
        JOptionPane.showMessageDialog(null,"SCEOND INNINGS" );

scorecard();
        while(true)
        {
            String p= JOptionPane.showInputDialog("ENTER: RUNS/WICKET");

            option=Integer.parseInt(p);

            if (option == 0)
            {

                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);

                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 1)
            {
                score1++;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;

                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 2)
            {
                score1=score1+2;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 3)
            {
                score1 =score1+3;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 4)
            {
                score1=score1+4;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 5)
            {
                score1=score1+5;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (option == 6)
            {
                score1=score1+6;
                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}

            }
            if (option == 7)
            {  wicket1=wicket1+1;
                JOptionPane.showMessageDialog(null, "wicket");

                System.out.println(t2+":"+score1+"/"+wicket1);
                ball1++;
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}

            }
            if (option == 8)
            {
                JOptionPane.showMessageDialog(null, "wide / no ball");
                score1++;
                System.out.println(t2+":"+score1+"/"+wicket1);
                System.out.println("overs: "+overs1+"."+ball1);
                if(ball1==5)
                {ball1 = ball1*0;
                    ball1--;
                    overs1++;}
            }
            if (wicket1==10 || enterover==overs1 && ball1==0||score1>s1)
            {  s2=score1;
                JOptionPane.showMessageDialog(null, " Innings Ended ");


                if(s1>s2)
                {
                    JOptionPane.showMessageDialog(null, t1+" won the match by  "+(score-score1)+" runs");

                }
                else
                {
                    JOptionPane.showMessageDialog(null, t2+ " won the match by "+(10-wicket1)+ " wickets");

                }

                if(s1==s2)
                {
                    JOptionPane.showMessageDialog(null,"MATCH TIED");
                }
              

                break;
            }



        }
    }
    static void scorecard()
    {
        System.out.println("************************** ENTER: RUNS & WICKETS *********************");
        System.out.println("ENTER 0 FOR DOT BALL");
        System.out.println("ENTER 1 FOR 1 RUN");
        System.out.println("ENTER 2 FOR 2 RUNS");
        System.out.println("ENTER 3 FOR 3 RUNS");
        System.out.println("ENTER 4 FOR 4 RUNS");
        System.out.println("ENTER 5 FOR 5 RUNS");
        System.out.println("ENTER 6 FOR 6 RUNS");
        System.out.println("ENTER 7 FOR WICKET");
        System.out.println("ENTER 8 FOR WIDE/NO BALL");
    }
static void enterovers()
{

   String a= JOptionPane.showInputDialog("Enter Overs: ");
    enterover=Integer.parseInt(a);

}
    }



