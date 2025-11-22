import javax.swing.*;
import java.awt.event.*;

public class SwingDialogExample 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Main Frame");
        JButton button = new JButton("Open Dialog");
        
        button.addActionListener(e ->
        {
            JDialog dialog = new JDialog(frame, "Dialog Example", true);
            dialog.add(new JLabel("This is a dialog box!", JLabel.CENTER));
            dialog.setSize(200, 100);
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
