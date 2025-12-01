package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    FastCash(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel intro = new JLabel("SELECT WITHDRAWL AMOUNT");
        intro.setFont(new Font("Arial", Font.BOLD, 19));
        intro.setBounds(480,170,350,40);
        intro.setForeground(Color.WHITE);
        image.add(intro);

        b1 = new JButton("Rs. 100");
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(new Color(67, 155, 141));
        b1.setForeground(Color.white);
        b1.setBounds(420,270,170,35);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs. 200");
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBackground(new Color(67, 155, 141));
        b2.setForeground(Color.white);
        b2.setBounds(420,320,170,35);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs. 500");
        b3.setFont(new Font("Arial", Font.BOLD, 15));
        b3.setBackground(new Color(67, 155, 141));
        b3.setForeground(Color.white);
        b3.setBounds(420,370,170,35);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs. 1000");
        b4.setFont(new Font("Arial", Font.BOLD, 15));
        b4.setBackground(new Color(67, 155, 141));
        b4.setForeground(Color.white);
        b4.setBounds(670,270,170,35);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs. 2000");
        b5.setFont(new Font("Arial", Font.BOLD, 15));
        b5.setBackground(new Color(67, 155, 141));
        b5.setForeground(Color.white);
        b5.setBounds(670,320,170,35);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs. 5000");
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
        if (e.getSource()==(b7)){
            setVisible(false);
            new main_class(pin);


        }

        else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            connect c1 = new connect();
            Date date = new Date();


            try {


                ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }
                    else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }
                if (e.getSource()!=b7 && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Account Balance");
                    return;
                }

                c1.statement.executeUpdate("insert into bank(pin,date,type,amount) values ('"+pin+"', '"+date+"','withdraw', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+ amount+ " has been Withdrawn");

            }
            catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);


        }




    }

    public static void main(String[] args) {
        new FastCash("");
    }
}

