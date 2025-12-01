package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField textField;
    JPasswordField passwordField;

    JButton button1;
    JButton button2;
    JButton button3;

    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(270,20,90,90);
        add(image);

        ImageIcon icard = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image icard1 = icard.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon icard2 = new ImageIcon(icard1);
        JLabel icard3 = new JLabel(icard2);
        icard3.setBounds(450,330,80,80);
        add(icard3);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 25));
        label1.setBounds(210,110,300,50);
        add(label1);

        label2 = new JLabel("CARD NO: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway", Font.BOLD, 15));
        label2.setBounds(170, 180, 300, 30);
        add(label2);

        textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.BOLD, 11));
        textField.setBounds(270,180,200,27);
        add(textField);

        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway", Font.BOLD, 15));
        label3.setBounds(170,230,300,30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Arial", Font.BOLD, 15));
        passwordField.setBounds(270, 230, 200,27);
        add(passwordField);

        button1 = new JButton("SIGN IN");
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(200,280,90,25);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setBounds(320,280,90,25);
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(210,310, 180,25);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iback = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iback1 = iback.getImage().getScaledInstance(650,450,Image.SCALE_DEFAULT);
        ImageIcon iback2 = new ImageIcon(iback1);
        JLabel iback3 = new JLabel(iback2);
        iback3.setBounds(0,0,650,450);
        add(iback3);

        setLayout(null);
        setSize(650,450);
        setVisible(true);
        setLocation(450,200);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource()==button1){
                connect c1 = new connect();
                String cardNo = textField.getText();
                String pin = passwordField.getText();

                String sql = "SELECT 1 FROM login WHERE cardNo = ? AND pin = ?";

                PreparedStatement ps = c1.connection.prepareStatement(sql);

                ps.setString(1, cardNo);

                ps.setString(2, pin);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) { setVisible(false); new main_class(pin); } else { JOptionPane.showMessageDialog(null, "Invalid card or PIN"); }




            }
            else if (e.getSource()==button2) {
                textField.setText("");
                passwordField.setText("");
            }
            else if(e.getSource()==button3){
                new signup();
                setVisible(false);

            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
