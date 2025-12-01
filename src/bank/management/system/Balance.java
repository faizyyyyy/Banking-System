package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Balance extends JFrame implements ActionListener {
    String pin;

    JLabel j2;
    JButton b1;

    Balance(String pin){
        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel j1 = new JLabel("YOUR CURRENT BALANCE IS: ");
        j1.setBounds(460,170,350,40);
        j1.setFont(new Font("Arial", Font.BOLD, 17));
        j1.setForeground(Color.WHITE);
        image.add(j1);

        j2 = new JLabel();
        j2.setBounds(460,220,350,40);
        j2.setFont(new Font("Arial", Font.BOLD, 17));
        j2.setForeground(Color.WHITE);
        image.add(j2);

        b1 = new JButton("BACK");
        b1.setBounds(715,405,130,35);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        image.add(b1);

        int balance = 0;
        try {
            connect c1 = new connect();
            ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin = '"+pin+"'");

            while (resultSet.next()){
                if (resultSet.getString("type").equals("deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }

        j2.setText(""+  balance);









        setLayout(null);
        setLocation(0,0);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            if (e.getSource().equals(b1)){
                setVisible(false);
                new main_class(pin);
            }


        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Balance("");
    }
}
