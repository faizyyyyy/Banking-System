package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {

    JRadioButton a1,a2,a3,a4;

    JCheckBox s1,s2,s3,s4,s5,s6;

    JButton submit, cancel;

    signup3(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,20,90,90);
        add(image);


        JLabel page = new JLabel("Page 3");
        page.setFont(new Font("Arial", Font.BOLD, 16));
        page.setBounds(350, 30,100,30);
        add(page);

        JLabel l1 = new JLabel("Account Details");
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l1.setBounds(300, 70, 300, 30);
        add(l1);

        JLabel l2 = new JLabel("Account Type :");
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        l2.setBounds(100,120,200,30);
        add(l2);

        a1 = new JRadioButton("Savings Account");
        a1.setBackground(new Color(233, 224, 155));
        a1.setFont(new Font("Raleway", Font.BOLD, 14));
        a1.setBounds(100,160,180,30);
        add(a1);

        a2 = new JRadioButton("Fixed Deposit Account");
        a2.setBackground(new Color(233, 224, 155));
        a2.setFont(new Font("Raleway", Font.BOLD, 14));
        a2.setBounds(310,160,180,30);
        add(a2);

        a3 = new JRadioButton("Current Account");
        a3.setBackground(new Color(233, 224, 155));
        a3.setFont(new Font("Raleway", Font.BOLD, 14));
        a3.setBounds(100,190,180,30);
        add(a3);

        a4 = new JRadioButton("Recurring Deposit Account");
        a4.setBackground(new Color(233, 224, 155));
        a4.setFont(new Font("Raleway", Font.BOLD, 14));
        a4.setBounds(310,190,180,30);
        add(a4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(a1);
        buttonGroup.add(a2);
        buttonGroup.add(a3);
        buttonGroup.add(a4);

        JLabel l3 = new JLabel("Card Number : ");
        l3.setBounds(100,250,150,40);
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        add(l3);

        JLabel l4 = new JLabel("(Your 16 digit Card Number)");
        l4.setBounds(100,270,170,40);
        l4.setFont(new Font("Arial", Font.BOLD, 11));
        add(l4);

        JLabel l5 = new JLabel("XXXX-XXXX-XXXX-4148");
        l5.setBounds(310,250,200,40);
        l5.setFont(new Font("Arial", Font.BOLD, 16));
        add(l5);

        JLabel l6 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        l6.setBounds(310,270,400,40);
        l6.setFont(new Font("Arial", Font.BOLD, 11));
        add(l6);

        JLabel l7 = new JLabel("PIN : ");
        l7.setBounds(100,305,150,40);
        l7.setFont(new Font("Arial", Font.BOLD, 16));
        add(l7);

        JLabel l8 = new JLabel("(4 Digit Password)");
        l8.setBounds(100,320,170,40);
        l8.setFont(new Font("Arial", Font.BOLD, 11));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(310,305,200,40);
        l9.setFont(new Font("Arial", Font.BOLD, 16));
        add(l9);

        JLabel l10 = new JLabel("Services Required : ");
        l10.setBounds(100,370,200,40);
        l10.setFont(new Font("Arial", Font.BOLD, 16));
        add(l10);

        s1 = new JCheckBox("ATM Card");
        s1.setBounds(100,420,200,30);
        s1.setFont(new Font("Arial", Font.BOLD, 14));
        add(s1);

        s2 = new JCheckBox("Mobile Banking");
        s2.setBounds(100,450,200,30);
        s2.setFont(new Font("Arial", Font.BOLD, 14));
        add(s2);

        s3 = new JCheckBox("Cheque Book");
        s3.setBounds(100,480,200,30);
        s3.setFont(new Font("Arial", Font.BOLD, 14));
        add(s3);

        s4 = new JCheckBox("Internet Banking");
        s4.setBounds(310,450,200,30);
        s4.setFont(new Font("Arial", Font.BOLD, 14));
        add(s4);

        s5 = new JCheckBox("E-Mail Alerts");
        s5.setBounds(310,420,200,30);
        s5.setFont(new Font("Arial", Font.BOLD, 14));
        add(s5);

        s6 = new JCheckBox("E-Statement");
        s6.setBounds(310,480,200,30);
        s6.setFont(new Font("Arial", Font.BOLD, 14));
        add(s6);

        JCheckBox c1 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge", true);
        c1.setBounds(70,530,530,30);
        c1.setFont(new Font("Arial", Font.BOLD, 11));
        add(c1);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(200,590,100,30);
        cancel.addActionListener(this);
        add(cancel);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(350,590,100,30);
        submit.addActionListener(this);
        add(submit);











        setLayout(null);
        setSize(750,700);
        setLocation(400,60);
        getContentPane().setBackground(new Color(233, 224, 155));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String aType = "";
        if ((a1.isSelected())){
            aType = "Savings Account";
        } else if ((a2.isSelected())) {
            aType = "Fixed Deposit Account";
        }
        else if ((a3.isSelected())) {
            aType = "Current Account";
        }else if ((a4.isSelected())) {
            aType = "Recurring Deposit Account";
        }

        Random rand = new Random();
        long first7 = (rand.nextLong()%90000000) + 1440361000000000L;
        String cardNo = " "+ Math.abs(first7);

        long first3 = (rand.nextInt()%1000)+ 1000L;
        String pin = " "+ Math.abs(first3);

        String sReq = "";
        if (s1.isSelected()){
            sReq += "ATM Card";
        } else if (s2.isSelected()) {
            sReq += "Mobile Banking";
        }
        else if (s3.isSelected()) {
            sReq += "Cheque Book";
        }
        else if (s4.isSelected()) {
            sReq += "E-Mail Alerts";
        }
        else if (s5.isSelected()) {
            sReq += "Internet Banking";
        }
        else if (s6.isSelected()) {
            sReq += "E-Statement";
        }
        try {
            if (e.getSource()==submit){
                if (aType.equals("")|| sReq.equals("")){
                    JOptionPane.showMessageDialog(null, "Please select all options");
                }

                else {
                    connect c1 = new connect();
                    String q1 = "insert into signupthree values('"+aType+"', '"+cardNo+"','"+pin+"','"+sReq+"')";
                    String q2 = "insert into login values('"+cardNo+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);

                    JOptionPane.showMessageDialog(null, "Card Number: "+ cardNo+ "\nPin: "+pin);
                    new deposit(pin);
                    setVisible(false);

                }
            }
            else if(e.getSource()==cancel) {
                System.exit(0);
            }



        }
        catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new signup3();
    }
}
