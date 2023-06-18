import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Project  extends JFrame implements ActionListener {

    Project() {
        super("Elecricity Billing System");

        setSize(1500,800);

//        Backgournd image
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("images/main.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1420, 720,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);


    }
}
