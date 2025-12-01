package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdraw extends JFrame implements ActionListener {

        String pin;
        JTextField with;

        JButton d1, b1;

        withdraw(String pin){

            this.pin = pin;

            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0,0,1550,830);
            add(image);

            JLabel j1 = new JLabel("MAXIMUM WITHDRAWL IS Rs. 10000");
            j1.setBounds(460,170,350,40);
            j1.setFont(new Font("Arial", Font.BOLD, 17));
            j1.setForeground(Color.WHITE);
            image.add(j1);

            JLabel j2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
            j2.setBounds(460,220,350,40);
            j2.setFont(new Font("Arial", Font.BOLD, 17));
            j2.setForeground(Color.WHITE);
            image.add(j2);

            with = new JTextField();
            with.setFont(new Font("Arial", Font.BOLD, 21));
            with.setBounds(460,270,335,30);
            image.add(with);

            d1 = new JButton("WITHDRAW");
            d1.setBounds(715,365,130,35);
            d1.setFont(new Font("Arial", Font.BOLD, 15));
            d1.setBackground(Color.cyan);
            d1.setForeground(Color.black);
            d1.addActionListener(this);
            image.add(d1);

            b1 = new JButton("BACK");
            b1.setBounds(715,405,130,35);
            b1.setFont(new Font("Arial", Font.BOLD, 15));
            b1.setBackground(Color.cyan);
            b1.setForeground(Color.black);
            b1.addActionListener(this);
            image.add(b1);






            this.pin = pin;
            setLayout(null);
            setLocation(0,0);
            setSize(1550,1080);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(d1)){

                try{
                    String amount = with.getText();
                    Date date = new Date();
                    if (with.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Please enter a amount");

                    }
                    else {
                        connect c1 = new connect();
                        ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin = '"+pin+"'");


                        int balance = 0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));
                            }
                            else {
                                balance-= Integer.parseInt(resultSet.getString("amount"));
                            }
                        }

                        if (balance< Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        }

                        String sql = "insert into bank(pin, date, type, amount) values('"+pin+"', '"+date+"', 'withdraw', "+amount+")";

                        c1.statement.executeUpdate(sql);

                        JOptionPane.showMessageDialog(null, "Rs. "+amount+ " debited successfully");
                        setVisible(false);
                        new main_class(pin);
                    }



                }
                catch (Exception E){
                    E.printStackTrace();
                    }


            }
            else if (e.getSource().equals(b1)){
                setVisible(false);
                new main_class(pin);
            }

        }

        public static void main(String[] args) {
            new withdraw("");
        }
    }
