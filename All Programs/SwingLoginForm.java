import javax.swing.*;
import java.awt.event.*;

public class SwingLoginForm 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Login Form");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);
    
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);

        JTextField tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);
        
        JPasswordField pf = new JPasswordField();
        pf.setBounds(150, 100, 150, 30);

        JButton b = new JButton("Login");
        b.setBounds(120, 150, 100, 30);

        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String user = tf.getText();
                String pass = new String(pf.getPassword());

                if (user.equals("admin") && pass.equals("1234"))
                    JOptionPane.showMessageDialog(f, "Login Successful!");
                else
                    JOptionPane.showMessageDialog(f, "Invalid Credentials!");
            }
        });

        f.add(l1); f.add(l2);
        f.add(tf); f.add(pf);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
