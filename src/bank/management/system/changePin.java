package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class changePin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    changePin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel intro = new JLabel("CHANGE YOUR PIN");
        intro.setFont(new Font("Arial", Font.BOLD, 19));
        intro.setBounds(530,170,350,40);
        intro.setForeground(Color.WHITE);
        image.add(intro);



        JLabel label2 = new JLabel("NEW PIN :");
        label2.setFont(new Font("Arial", Font.BOLD, 15));
        label2.setBounds(420,240,350,40);
        label2.setForeground(Color.WHITE);
        image.add(label2);

        p1 = new JPasswordField();
        p1.setFont(new Font("Arial", Font.BOLD, 25));
        p1.setBounds(600,245,200,30);
        image.add(p1);

        JLabel label3 = new JLabel("RE- ENTER NEW PIN :");
        label3.setFont(new Font("Arial", Font.BOLD, 15));
        label3.setBounds(420,280,280,40);
        label3.setForeground(Color.WHITE);
        image.add(label3);

        p2 = new JPasswordField();
        p2.setFont(new Font("Arial", Font.BOLD, 25));
        p2.setBounds(600,285,200,30);
        image.add(p2);




        b1 = new JButton("CHANGE");
        b1.setBounds(715,365,130,35);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(715,405,130,35);
        b2.setFont(new Font("Arial", Font.BOLD, 15));
        b2.setBackground(Color.cyan);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        image.add(b2);







        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pin1 = new String(p1.getPassword());
        String pin2 = new String(p2.getPassword());

        try {



            if (e.getSource().equals(b1)){
                if (pin1.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                else if (pin2.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }
                else if (!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }


                connect c1 = new connect();
                String sql1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String sql2 = "update signupthree  set pin = '"+pin1+"' where pin = '"+pin+"'";
                String sql3 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";

                c1.statement.executeUpdate(sql1);
                c1.statement.executeUpdate(sql2);
                c1.statement.executeUpdate(sql3);

                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                setVisible(false);
                new main_class(pin1);
            } else if (e.getSource().equals(b2)) {

                new main_class(pin);
                setVisible(false);
            }


        }
        catch (Exception E){
            E.printStackTrace();
        }







    }

    public static void main(String[] args) {
        new changePin("");
    }
}
