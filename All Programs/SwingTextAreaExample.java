import javax.swing.*;
import java.awt.*;

public class SwingTextAreaExample 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("JTextArea Example");
        JTextArea area = new JTextArea(5, 20);
        JButton b = new JButton("Show Text");

        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "You wrote:\n" 
        + area.getText()));

        f.add(new JScrollPane(area));
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
