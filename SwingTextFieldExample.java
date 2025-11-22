import javax.swing.*;
import java.awt.*;

public class SwingTextFieldExample 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JTextField Example");
        JTextField tf = new JTextField(15);
        JButton b = new JButton("Show Text");

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "You typed: " + tf.getText()));

        f.add(tf);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 150);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
