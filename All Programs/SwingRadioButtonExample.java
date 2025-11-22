import javax.swing.*;
import java.awt.*;

public class SwingRadioButtonExample 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("JRadioButton Example");

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        
        JRadioButton father = new JRadioButton("Father");
        JRadioButton mother = new JRadioButton("Mother");


        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(male);
        bg1.add(female);
        
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(father);
        bg2.add(mother);

        JButton b1 = new JButton("Show1");
        JButton b2 = new JButton("Show2");
        b1.addActionListener(e ->
        {
            String msg = male.isSelected() ? "Male" : "Female";
            JOptionPane.showMessageDialog(f, "Selected: " + msg);
        });
        b2.addActionListener(e ->
        {
            String msg = father.isSelected() ? "Father" : "Mother";
            JOptionPane.showMessageDialog(f, "Selected: " + msg);
        });

        f.add(male); f.add(female); f.add(b1); f.add(father); f.add(mother); f.add(b2);
        f.setLayout(new FlowLayout());
        f.setSize(250, 150);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
