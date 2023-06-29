import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;

    login(){
        super("Login Page");
        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
        Image i1 = ic1.getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT);
        b1 = new JButton("Login",new ImageIcon(i1));

        ImageIcon ic2= new ImageIcon(ClassLoader.getSystemResource("images/cancel.jpg"));
        Image i2 = ic2.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        b2 = new JButton("Cancel",new ImageIcon(i2));

        b1.addActionListener(this);
        b2.addActionListener(this);

        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("images/pop.jpg"));
        Image i3 = ic3 .getImage().getScaledInstance(340,370,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);

        l3 = new JLabel(icc3);

        setLayout(new BorderLayout());

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();



    }


}
