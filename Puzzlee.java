package Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Puzzlee extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next, Next;

    Puzzlee() {

        setTitle("Puzzle Game.");

        Font f = new Font("Arial Black", Font.PLAIN, 20);
        b1 = new JButton("1");
        b1.setBounds(10, 80, 100, 100);
        b1.setFont(f);
        add(b1);
        b2 = new JButton("2");
        b2.setBounds(120, 80, 100, 100);
        add(b2);
        b2.setFont(f);
        b3 = new JButton("3");
        b3.setBounds(230, 80, 100, 100);
        add(b3);
        b3.setFont(f);

        b4 = new JButton("4");
        b4.setBounds(10, 190, 100, 100);
        add(b4);
        b4.setFont(f);
        b5 = new JButton("5");
        b5.setBounds(120, 190, 100, 100);
        add(b5);
        b5.setFont(f);
        b6 = new JButton("6");
        b6.setBounds(230, 190, 100, 100);
        add(b6);
        b6.setFont(f);

        b7 = new JButton("7");
        b7.setBounds(10, 300, 100, 100);
        add(b7);
        b7.setFont(f);
        b8 = new JButton(" ");
        b8.setBounds(120, 300, 100, 100);
        add(b8);
        b8.setFont(f);
        b9 = new JButton("8");
        b9.setBounds(230, 300, 100, 100);
        add(b9);
        b9.setFont(f);

        next = new JButton("Play Again.");
        next.setBounds(100, 420, 160, 50);
        add(next);
        next.setFont(f);

        Next = new JButton("Play");
        Next.setBounds(100, 20, 160, 50);
        add(Next);
        Next.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);
        Next.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(360, 560);
        setLocation(100, 100);

        getContentPane().setBackground(new Color(44, 95, 44));// for background color

        b1.setBackground(new Color(151, 188, 98));
        b2.setBackground(new Color(151, 188, 98));
        b3.setBackground(new Color(151, 188, 98));
        b4.setBackground(new Color(151, 188, 98));
        b5.setBackground(new Color(151, 188, 98));
        b6.setBackground(new Color(151, 188, 98));
        b7.setBackground(new Color(151, 188, 98));
        b8.setBackground(new Color(151, 188, 98));
        b9.setBackground(new Color(151, 188, 98));
        next.setBackground(new Color(151, 188, 98));
        Next.setBackground(new Color(151, 188, 98));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        String button = e.getActionCommand();

        if (e.getSource() == b1) {
            String s = b1.getText();
            if (b2.getText() == " ") {
                b1.setText(" ");
                b2.setText(s);
            }
            if (b4.getText() == " ") {
                b1.setText(" ");
                b4.setText(s);
            }
        }
        if (e.getSource() == b2) {
            String s = b2.getText();
            if (b5.getText() == " ") {
                b5.setText(s);
                b2.setText(" ");
            }
            if (b3.getText() == " ") {
                b3.setText(s);
                b2.setText(" ");
            }
            if (b1.getText() == " ") {
                b1.setText(s);
                b2.setText(" ");
            }

        }
        if (e.getSource() == b3) {
            String s = b3.getText();
            if (b2.getText() == " ") {
                b2.setText(s);
                b3.setText(" ");
            }
            if (b6.getText() == " ") {
                b6.setText(s);
                b3.setText(" ");
            }

        }
        if (e.getSource() == b4) {
            String s = b4.getText();
            if (b1.getText() == " ") {
                b1.setText(s);
                b4.setText(" ");
            }
            if (b5.getText() == " ") {
                b5.setText(s);
                b4.setText(" ");
            }
            if (b7.getText() == " ") {
                b7.setText(s);
                b4.setText(" ");
            }

        }
        if (e.getSource() == b5) {
            String s = b5.getText();
            if (b4.getText() == " ") {
                b4.setText(s);
                b5.setText(" ");
            }
            if (b2.getText() == " ") {
                b2.setText(s);
                b5.setText(" ");
            }
            if (b8.getText() == " ") {
                b8.setText(s);
                b5.setText(" ");
            }
            if (b6.getText() == " ") {
                b6.setText(s);
                b5.setText(" ");
            }

        }
        if (e.getSource() == b6) {
            String s = b6.getText();
            if (b3.getText() == " ") {
                b3.setText(s);
                b6.setText(" ");
            }
            if (b5.getText() == " ") {
                b5.setText(s);
                b6.setText(" ");
            }
            if (b9.getText() == " ") {
                b9.setText(s);
                b6.setText(" ");
            }

        }
        if (e.getSource() == b7) {
            String s = b7.getText();
            if (b4.getText() == " ") {
                b4.setText(s);
                b7.setText(" ");
            }
            if (b8.getText() == " ") {
                b8.setText(s);
                b7.setText(" ");
            }
        }
        if (e.getSource() == b8) {
            String s = b8.getText();
            if (b9.getText() == " ") {
                b9.setText(s);
                b8.setText(" ");
            }
            if (b5.getText() == " ") {
                b5.setText(s);
                b8.setText(" ");
            }
            if (b7.getText() == " ") {
                b7.setText(s);
                b8.setText(" ");
            }

        }
        if (e.getSource() == b9) {
            String s = b9.getText();
            if (b6.getText() == " ") {
                b6.setText(s);
                b9.setText(" ");
            } else if (b8.getText() == " ") {
                b8.setText(s);
                b9.setText(" ");
            }
            if (b1.getText() == "1" && b2.getText() == "2" && b3.getText() == "3" && b4.getText() == "4"
                    && b5.getText() == "5" && b6.getText() == "6" && b7.getText() == "7" && b8.getText() == "8"
                    && b9.getText() == " ") {
                JOptionPane.showMessageDialog(this, " You Won The Game");
                ;
            }

        }
        if (e.getSource() == next) {
            String s1 = b1.getText();
            b1.setText(b5.getText());
            b5.setText(s1);
            String s2 = b4.getText();
            b4.setText(b9.getText());
            b9.setText(s2);
            String s3 = b2.getText();
            b2.setText(b7.getText());
            b7.setText(s3);
            String s4 = b3.getText();
            b3.setText(b4.getText());
            b4.setText(s4);
        }
    }

    public static void main(String[] args) {
        Puzzlee p = new Puzzlee();

    }
}
