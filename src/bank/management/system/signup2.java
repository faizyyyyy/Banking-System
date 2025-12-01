package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4,comboBox5,comboBox6;

    JTextField textPan, textAadhar;

    JRadioButton s1, s2, e1,e2;

    JButton next;

    signup2(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,20,90,90);
        add(image);



        JLabel page = new JLabel("Page 2");
        page.setFont(new Font("Arial", Font.BOLD, 16));
        page.setBounds(380, 30,100,30);
        add(page);

        JLabel Additiona = new JLabel("Additional Details");
        Additiona.setFont(new Font("Arial", Font.BOLD, 28));
        Additiona.setBounds(300, 70, 300, 30);
        add(Additiona);

        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Arial", Font.BOLD, 18));
        religion.setBounds(80,190,200,30);
        add(religion);

        String reli[] = {"","Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(reli);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 16));
        comboBox.setBounds(250,190,350,30);
        comboBox.setBackground(new Color(239, 215, 147));
        add(comboBox);

        JLabel l2 = new JLabel("Category :");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(80,230,200,30);
        add(l2);

        String category[] = {"","General","SC","ST","OBC","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 16));
        comboBox2.setBounds(250,230,350,30);
        comboBox2.setBackground(new Color(239, 215, 147));
        add(comboBox2);

        JLabel l3 = new JLabel("Annual Income :");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(80,270,200,30);
        add(l3);

        String income[] = {"","<100,000","<250,000","<500,000","<800,000","Above 1,000,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 16));
        comboBox3.setBounds(250,270,350,30);
        comboBox3.setBackground(new Color(239, 215, 147));
        add(comboBox3);

        JLabel l4 = new JLabel("Education :");
        l4.setFont(new Font("Arial", Font.BOLD, 18));
        l4.setBounds(80,310,200,30);
        add(l4);

        String education[] = {"","HSC","Graduate","Post-Graduate","Masters","Higher-Studeis"};
        comboBox4 = new JComboBox(education);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 16));
        comboBox4.setBounds(250,310,350,30);
        comboBox4.setBackground(new Color(239, 215, 147));
        add(comboBox4);

        JLabel l5 = new JLabel("Occupation :");
        l5.setFont(new Font("Arial", Font.BOLD, 18));
        l5.setBounds(80,350,200,30);
        add(l5);

        String occupation[] = {"","working","student","self-employed","Business","Retired"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 16));
        comboBox5.setBounds(250,350,350,30);
        comboBox5.setBackground(new Color(239, 215, 147));
        add(comboBox5);

        JLabel l6 = new JLabel("Pan-Card No :");
        l6.setFont(new Font("Arial", Font.BOLD, 18));
        l6.setBounds(80,390,200,30);
        add(l6);

        textPan = new JTextField(30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 16));
        textPan.setBounds(250,390,350,30);
        add(textPan);

        JLabel l7 = new JLabel("Aadhar-Card No :");
        l7.setFont(new Font("Arial", Font.BOLD, 18));
        l7.setBounds(80,430,200,30);
        add(l7);

        textAadhar = new JTextField(30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 16));
        textAadhar.setBounds(250,430,350,30);
        add(textAadhar);

        JLabel l8 = new JLabel("Senior Citizen : ");
        l8.setBounds(80,470,200,30);
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        add(l8);

        s1 = new JRadioButton("Yes");
        s1.setBackground(new Color(239, 215, 147));
        s1.setFont(new Font("Raleway", Font.BOLD, 14));
        s1.setBounds(280,470,80,30);
        add(s1);

        s2 = new JRadioButton("No");
        s2.setBackground(new Color(239, 215, 147));
        s2.setFont(new Font("Raleway", Font.BOLD, 14));
        s2.setBounds(380,470,80,30);
        add(s2);

        JLabel l9 = new JLabel("Existing Account : ");
        l9.setBounds(80,510,200,30);
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        add(l9);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(239, 215, 147));
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(280,510,80,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(239, 215, 147));
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(380,510,80,30);
        add(e2);

        next = new JButton("Next");
        next.setFont(new Font("raleway", Font.BOLD, 16));
        next.setBounds(500,570,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
















        setLayout(null);
        setSize(750,700);
        setLocation(400,100);
        getContentPane().setBackground(new Color(239, 215, 147));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aad = textAadhar.getText();

        String sCitizen = "";
        if ((s1.isSelected())){
            sCitizen = "Yes";
        }
        else if((s2.isSelected())){
            sCitizen = "No";
        }

        String eAccount ="";
        if ((e1.isSelected())){
            eAccount = "Yes";
        } else if ((e2.isSelected())) {
            eAccount = "No";
        }

        try {
            if (textPan.getText().equals("")|| textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter valid Credentials");
            }
            else {
                connect c1 = new connect();
                String q = "insert into signuptwo values('"+rel+"', '"+cat+"', '"+inc+"', '"+edu+"','"+occ+"', '"+pan+"', '"+aad+"','"+sCitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);

                new signup3();
                setVisible(false);
            }

        }
        catch (Exception E){
            E.getStackTrace();
        }

    }

    public static void main(String[] args) {
        new signup2();
    }
}
