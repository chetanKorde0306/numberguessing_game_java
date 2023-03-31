package Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class puzzle4 extends JFrame implements ActionListener {
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,next,Back;
    puzzle4(){
        setTitle("Puzzle Game.");
        Back = new JButton("Go to 3 X 3");
        Back.setBounds(100,10,160,50);
        add(Back);
        //add one line
        B1 = new JButton("1");
        B1.setBounds(5,70,83,83);
        add(B1);
        B2 = new JButton("2");
        B2.setBounds(93,70,83,83);
        add(B2);
        B3 = new JButton("3");
        B3.setBounds(181,70,83,83);
        add(B3);
        B4 = new JButton("4");
        B4.setBounds(269,70,83,83);
        add(B4);
        //add line 2
        B5 = new JButton("5");
        B5.setBounds(5,158,83,83);
        add(B5);
        B6 = new JButton("6");
        B6.setBounds(93,158,83,83);
        add(B6);
        B7 = new JButton("7");
        B7.setBounds(181,158,83,83);
        add(B7);
        B8 = new JButton("8");
        B8.setBounds(269,158,83,83);
        add(B8);
        //add line 3
        B9 = new JButton("9");
        B9.setBounds(5,246,83,83);
        add(B9);
        B10 = new JButton("10");
        B10.setBounds(93,246,83,83);
        add(B10);
        B11 = new JButton("12");
        B11.setBounds(181,246,83,83);
        add(B11);
        B12 = new JButton("15");
        B12.setBounds(269,246,83,83);
        add(B12);
        //add line 4
        B13 = new JButton("13");
        B13.setBounds(5,334,83,83);
        add(B13);
        B14 = new JButton("14");
        B14.setBounds(93,334,83,83);
        add(B14);
        B15 = new JButton(" ");
        B15.setBounds(181,334,83,83);
        add(B15);
        B16 = new JButton("11");
        B16.setBounds(269,334,83,83);
        add(B16);

        next = new JButton("Play Again.. ");
        next.setBounds(100,450,160,50);
        add(next);

        B1.addActionListener( this);
        B2.addActionListener( this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B10.addActionListener(this);
        B11.addActionListener(this);
        B12.addActionListener(this);
        B13.addActionListener(this);
        B14.addActionListener(this);
        B15.addActionListener(this);
        B16.addActionListener(this);
        Back.addActionListener(this);
        next.addActionListener(this );


        //color change
//        getContentPane().setBackground(new Color(0, 99, 178));//for background color
        getContentPane().setBackground(new Color(101, 53, 15));//for background color
        B1.setBackground(new Color(255,228,196));
        B2.setBackground(new Color(255,228,196));
        B3.setBackground(new Color(255,228,196));
        B4.setBackground(new Color(255,228,196));
        B5.setBackground(new Color(255,228,196));
        B6.setBackground(new Color(255,228,196));
        B7.setBackground(new Color(255,228,196));
        B8.setBackground(new Color(255,228,196));
        B9.setBackground(new Color(255,228,196));
        B10.setBackground(new Color(255,228,196));
        B11.setBackground(new Color(255,228,196));
        B12.setBackground(new Color(255,228,196));
        B13.setBackground(new Color(255,228,196));
        B14.setBackground(new Color(255,228,196));
        B15.setBackground(new Color(255,228,196));
        B16.setBackground(new Color(255,228,196));
        next.setBackground(new Color(255,228,196));
        Back.setBackground(new Color(255,228,196));


        setSize(370,560);
        setLocation(100,100);
        setLayout(null);
        setVisible(true);

    }

    //Developing logic for code
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Back){
            new Puzzlee();
            dispose();
        }
        if (e.getSource()==B1){
            String s = B1.getText();
            if (B2.getText()==" "){
                B2.setText(s);
                B1.setText(" ");
            }
            if (B5.getText()==" "){
                B5.setText(s);
                B1.setText(" ");
            }
        }

        if (e.getSource()==B2){
            String s = B2.getText();
            if(B1.getText()==" "){
                B2.setText(" ");
                B1.setText(s);
            }
            if (B6.getText()==" "){
                B2.setText(" ");
                B6.setText(s);
            }
            if (B3.getText()==" "){
                B2.setText(" ");
                B3.setText(s);
            }
        }

        if (e.getSource()==B3){
            String s = B3.getText();
            if (B2.getText().equals(" ")){
                B2.setText(s);
                B3.setText(" ");
            }
            if(B7.getText()==" "){
                B3.setText(" ");
                B7.setText(s);
            }
            if (B4.getText()==" "){
                B3.setText(" ");
                B4.setText(s);
            }

        }

        if (e.getSource()==B4){
            String s = B4.getText();
            if (B3.getText()==" "){
                B4.setText(" ");
                B3.setText(s);
            }
            if (B8.getText()==" "){
                B8.setText(s);
                B4.setText(" ");
            }
        }


        //code for 2nd line


        if (e.getSource()==B5){
            String s  = B5.getText();
            if (B1.getText()==" "){
                B1.setText(s);
                B5.setText(" ");
            }
            if (B6.getText()==" "){
                B6.setText(s);
                B5.setText(" ");
            }
            if (B9.getText()==" "){
                B9.setText(s);
                B5.setText(" ");
            }
        }
        if (e.getSource()==B6){
            String s  = B6.getText();
            if (B2.getText()==" "){
               B2.setText(s);
               B6.setText(" ");
            }
            if (B5.getText()==" "){
                B5.setText(s);
                B6.setText(" ");
            }
            if (B10.getText()==" "){
                B10.setText(s);
                B6.setText(" ");
            }
            if (B7.getText()==" "){
                B7.setText(s);
                B6.setText(" ");
            }
        }
        if (e.getSource()==B7){
            String s  = B7.getText();
            if (B6.getText()==" "){
                B6.setText(s);
                B7.setText(" ");
            }
            if (B3.getText()==" "){
                B3.setText(s);
                B7.setText(" ");
            }
            if (B8.getText()==" "){
                B8.setText(s);
                B7.setText(" ");
            }
            if (B11.getText()==" "){
                B11.setText(s);
                B7.setText(" ");
            }
        }
        if (e.getSource()==B8){
            String s  = B8.getText();
            if (B4.getText()==" "){
                B4.setText(s);
                B8.setText(" ");
            }
            if (B7.getText()==" "){
                B7.setText(s);
                B8.setText(" ");
            }
            if (B12.getText()==" "){
                B12.setText(s);
                B8.setText(" ");
            }
        }


        //code for 3rd line


        if (e.getSource()==B9){
            String s  = B9.getText();
            if (B5.getText()==" "){
                B5.setText(s);
                B9.setText(" ");
            }
            if (B13.getText()==" "){
                B13.setText(s);
                B9.setText(" ");
            }
            if (B10.getText()==" "){
                B10.setText(s);
                B9.setText(" ");
            }

        }
        if (e.getSource()==B10){
            String s  = B10.getText();
            if (B6.getText()==" "){
                B6.setText(s);
                B10.setText(" ");
            }
            if (B9.getText()==" "){
                B9.setText(s);
                B10.setText(" ");
            }
            if (B11.getText()==" "){
                B11.setText(s);
                B10.setText(" ");
            }
            if (B14.getText()==" "){
                B14.setText(s);
                B10.setText(" ");
            }
        }
        if (e.getSource()==B11){
            String s  = B11.getText();
            if (B7.getText()==" "){
                B7.setText(s);
                B11.setText(" ");
            }
            if (B10.getText()==" "){
                B10.setText(s);
                B11.setText(" ");
            }
            if (B12.getText()==" "){
                B12.setText(s);
                B11.setText(" ");
            }
            if (B15.getText()==" "){
                B15.setText(s);
                B11.setText(" ");
            }
        }
        if (e.getSource()==B12){
            String s  = B12.getText();
            if (B8.getText()==" "){
                B8.setText(s);
                B12.setText(" ");
            }
            if (B11.getText()==" "){
                B11.setText(s);
                B12.setText(" ");
            }
            if (B16.getText()==" "){
                B16.setText(s);
                B12.setText(" ");
            }

        }

        //for 4th line


        if (e.getSource()==B13){
            String s  = B13.getText();
            if (B9.getText()==" "){
                B9.setText(s);
                B13.setText(" ");
            }
            if (B14.getText()==" "){
                B14.setText(s);
                B13.setText(" ");
            }
        }
        if (e.getSource()==B14){
            String s  = B14.getText();
            if (B13.getText()==" "){
                B13.setText(s);
                B14.setText(" ");
            }
            if (B10.getText()==" "){
                B10.setText(s);
                B14.setText(" ");
            }
            if (B15.getText()==" "){
                B15.setText(s);
                B14.setText(" ");
            }
        }
        if (e.getSource()==B15){
            String s  = B15.getText();
            if (B14.getText()==" "){
                B14.setText(s);
                B15.setText(" ");
            }
            if (B11.getText()==" "){
                B11.setText(s);
                B15.setText(" ");
            }
            if (B16.getText()==" "){
                B16.setText(s);
                B15.setText(" ");
            }
        }
        if (e.getSource()==B16){
            String s  = B16.getText();
            if (B12.getText()==" "){
                B12.setText(s);
                B16.setText(" ");
            }
            if (B15.getText()==" "){
                B15.setText(s);
                B16.setText(" ");
            }

            if (B1.getText()=="1"&&B2.getText()=="2"&&B3.getText()=="3"&&B4.getText()=="4"&&B5.getText()=="5"&&B6.getText()=="6"&&B7.getText()=="7"&&B8.getText()=="8"&&B9.getText()=="9"&&B10.getText()=="10"&&B11.getText()=="11"&&B12.getText()=="12"&&B13.getText()=="13"&&B14.getText()=="14"&&B15.getText()=="15"&&B16.getText()==" "){
                JOptionPane.showMessageDialog(this," You Won The Game");;
            }
        }
        if (e.getSource()==next){
            String s1=B1.getText();
            B1.setText(B5.getText());
            B5.setText(s1);
            String s2=B4.getText();
            B4.setText(B9.getText());
            B9.setText(s2);
            String s3=B2.getText();
            B2.setText(B7.getText());
            B7.setText(s3);
            String s4=B3.getText();
            B3.setText(B6.getText());
            B6.setText(s4);

            String s5= B10.getText();
            B10.setText(B13.getText());
            B13.setText(s5);
            String s6= B11.getText();
            B11.setText(B14.getText());
            B14.setText(s6);
            String s7 = B12.getText();
            B12.setText(B16.getText());
            B16.setText(s7);
        }

    }

    public static void main(String[] args) {
        puzzle4 q = new puzzle4();
    }
}
