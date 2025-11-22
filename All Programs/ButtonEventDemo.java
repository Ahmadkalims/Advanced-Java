import java.awt.*;
import java.awt.event.*;

public class ButtonEventDemo extends WindowAdapter implements ActionListener
{
	Frame f;
    Button b;

    ButtonEventDemo() 
    {
    	f=new Frame();
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        b.addActionListener(this); // Register listener for Button

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.addWindowListener(this); // Register listener for Frame
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button was clicked!");
    }
    
    public void windowClosing(WindowEvent e) 
    {
        f.dispose();
        System.exit(0);
    }

    public static void main(String[] args)
    {
        new ButtonEventDemo();
    }
}
