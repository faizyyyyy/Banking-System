package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.sql.ResultSet;

public class miniStatement extends JFrame {

    String pin;
    miniStatement(String pin){
        this.pin = pin;

        JLabel m1 = new JLabel("BANK STATEMENT");
        m1.setFont(new Font("Raleway", Font.BOLD, 17));
        m1.setBounds(120,15,200,40);
        add(m1);

        JLabel l2 = new JLabel("");
        l2.setBounds(40, 55, 300, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 13));
        add(l2);

        JTextArea transactionArea = new JTextArea();
        transactionArea.setEditable(false);
        transactionArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));

        JScrollPane scrollPane = new JScrollPane(transactionArea);
        scrollPane.setBounds(40, 90,300, 280);
        add(scrollPane);

        JLabel l4 = new JLabel("");
        l4.setFont(new Font("Raleway", Font.BOLD, 13));
        l4.setBounds(40, 390, 300, 30);
        add(l4);

        try {

            connect c1 = new connect();
            ResultSet resultSet = c1.statement.executeQuery("select * from login where pin = '"+pin+"'");
            if (resultSet.next()){
                l2.setText("Card Number : "+ resultSet.getString("cardNo").substring(0,4)+ "XXXXXXXX"+ resultSet.getString("cardNo").substring(12));

            }


        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            connect c1 = new connect();
            int balance = 0;

            ResultSet resultSet = c1.statement.executeQuery("select date, type, amount from bank where pin = '"+pin+"' order by date DESC");

            while (resultSet.next()){

                transactionArea.append(resultSet.getString("date")+"\t"+ resultSet.getString("type")+"\t\t"+ resultSet.getString("amount")+ "\n");
                if (resultSet.getString("type").equals("deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));//what is parse what is parse what help does it do
                }
                else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            l4.setText("Your Total balance is Rs. "+ balance );

        }
        catch (Exception e){
            e.printStackTrace();
        }


        getContentPane().setBackground(new Color(246, 235, 192));
        setLayout(null);
        setLocation(600,150);
        setSize(400,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new miniStatement("1234");

    }

}

