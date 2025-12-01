package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {

    String pin;
    JTextField depo;

    JButton d1, b1;

    deposit(String pin){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel j1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        j1.setBounds(460,170,350,40);
        j1.setFont(new Font("Arial", Font.BOLD, 17));
        j1.setForeground(Color.WHITE);
        image.add(j1);

        depo = new JTextField();
        depo.setFont(new Font("Arial", Font.BOLD, 21));
        depo.setBounds(460,220,335,30);
        image.add(depo);

        d1 = new JButton("DEPOSIT");
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

        try {
            String amount = depo.getText();
            Date date = new Date();
            if (e.getSource()==d1){
                if (depo.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter amount to deposit");
                }
                else{
                    connect c1 = new connect();
                    String q1 = "insert into bank values('"+pin+"', '"+date+"', 'deposit', '"+amount+"')";
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    c1.statement.executeUpdate(q1);
                    setVisible(false);
                    new main_class(pin);
                }
            }
            else if (e.getSource().equals(b1)){
                setVisible(false);
                new main_class(pin);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new deposit("");
    }
}
