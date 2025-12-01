package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JRadioButton r1,r2;
    JRadioButton m1, m2;

    JTextField textname, textFname;
    JTextField textEmail , textpin, textstate,textcity , textadd;

    JDateChooser dateChooser;
    JButton next;

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,20,90,90);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO: ");
        label1.setBounds(220,30,400,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 24));
        add(label1);

        Random rand = new Random();
        int randomNumber = 1000+ rand.nextInt(9000);

        JLabel randomValue = new JLabel(String.valueOf(randomNumber));
        randomValue.setBounds(520,30,200,40);
        randomValue.setFont(new Font("Raleway", Font.BOLD, 24));
        add(randomValue);

        JLabel page = new JLabel("Page 1");
        page.setFont(new Font("Arial", Font.BOLD, 16));
        page.setBounds(380, 60,100,30);
        add(page);

        JLabel personal = new JLabel("Personal Details");
        personal.setFont(new Font("Arial", Font.BOLD, 20));
        personal.setBounds(330, 100, 300, 30);
        add(personal);

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Arial", Font.BOLD, 18));
        name.setBounds(80,190,200,30);
        add(name);

        textname = new JTextField();
        textname.setFont(new Font("Raleway", Font.BOLD, 16));
        textname.setBounds(250,190,350,30);
        add(textname);

        JLabel fName = new JLabel("Father's Name :");
        fName.setFont(new Font("Arial", Font.BOLD, 18));
        fName.setBounds(80,230,200,30);
        add(fName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 16));
        textFname.setBounds(250,230,350,30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Arial", Font.BOLD, 18));
        DOB.setBounds(80,270,200,30);
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(Color.pink);
        dateChooser.setBounds(250, 270,350,30);
        add(dateChooser);


        JLabel gender = new JLabel("Select Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        gender.setBounds(80,310,200,30);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(250,310,80,25);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(350,310,80,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel email = new JLabel("Enter e-mail: ");
        email.setFont(new Font("Arial", Font.BOLD, 18));
        email.setBounds(80,350,200,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 16));
        textEmail.setBounds(250,350,350,30);
        add(textEmail);

        JLabel marry =new JLabel("Marital Status: ");
        marry.setFont(new Font("Arial", Font.BOLD, 18));
        marry.setBounds(80,390,200,30);
        add(marry);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Arial", Font.BOLD, 14));
        m1.setBounds(250,390,80,25);
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Arial", Font.BOLD, 14));
        m2.setBounds(350,390,100,25);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        ButtonGroup group = new ButtonGroup();
        group.add(m1);
        group.add(m2);

        JLabel address =new JLabel("Address: ");
        address.setFont(new Font("Arial", Font.BOLD, 18));
        address.setBounds(80,430,200,30);
        add(address);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD, 16));
        textadd.setBounds(250,430,350,30);
        add(textadd);

        JLabel city =new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 18));
        city.setBounds(80,470,200,30);
        add(city);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD, 16));
        textcity.setBounds(250,470,350,30);
        add(textcity);

        JLabel pincode =new JLabel("Pincode: ");
        pincode.setFont(new Font("Arial", Font.BOLD, 18));
        pincode.setBounds(80,510,200,30);
        add(pincode);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD, 16));
        textpin.setBounds(250,510,350,30);
        add(textpin);

        JLabel state =new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 18));
        state.setBounds(80,550,200,30);
        add(state);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD, 16));
        textstate.setBounds(250,550,350,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("raleway", Font.BOLD,16));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(500,600,100,30);
        next.addActionListener(this);
        add(next);












        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(750,700);
        setLocation(400,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = textname.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()){
        gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";
        }

        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();

        try {
            if (textname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter your Name");
            }
            else {
                connect con = new connect();
                String q = "insert into signup values('"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pincode+"', '"+state+"')";
                con.statement.executeUpdate(q);
                new signup2();
                setVisible(false);
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        signup sign = new signup();
    }
}

