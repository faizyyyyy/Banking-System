package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    main_class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel intro = new JLabel("Please Select Your Transaction");
        intro.setFont(new Font("Arial", Font.BOLD, 19));
        intro.setBounds(480,170,350,40);
        intro.setForeground(Color.WHITE);
        image.add(intro);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(new Color(67, 155, 141));
        b1.setForeground(Color.white);
        b1.setBounds(420,270,170,35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBackground(new Color(67, 155, 141));
        b2.setForeground(Color.white);
        b2.setBounds(420,320,170,35);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("PIN CHANGE");
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.setBackground(new Color(67, 155, 141));
        b3.setForeground(Color.white);
        b3.setBounds(420,370,170,35);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("CASH WITHDRAW");
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.setBackground(new Color(67, 155, 141));
        b4.setForeground(Color.white);
        b4.setBounds(670,270,170,35);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("MINI STATEMENT");
        b5.setFont(new Font("Arial", Font.BOLD, 15));
        b5.setBackground(new Color(67, 155, 141));
        b5.setForeground(Color.white);
        b5.setBounds(670,320,170,35);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE");
        b6.setFont(new Font("Arial", Font.BOLD, 15));
        b6.setBackground(new Color(67, 155, 141));
        b6.setForeground(Color.white);
        b6.setBounds(670,370,170,35);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("Arial", Font.BOLD, 15));
        b7.setBackground(new Color(67, 155, 141));
        b7.setForeground(Color.white);
        b7.setBounds(670,420,170,35);
        b7.addActionListener(this);
        image.add(b7);










        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(b1)){
                new deposit(pin);
                setVisible(false);
            } else if (e.getSource().equals(b7)) {
                System.exit(0);

            } else if (e.getSource().equals(b4)) {
                new withdraw(pin);
                setVisible(false);
            } else if (e.getSource().equals(b6)) {
                new Balance(pin);
                setVisible(false);
            } else if (e.getSource().equals(b2)) {
                new FastCash(pin);
                setVisible(false);


            } else if (e.getSource().equals(b3)) {
                new changePin(pin);
                setVisible(false);
            } else if (e.getSource().equals(b5)) {
                new miniStatement(pin);


            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
