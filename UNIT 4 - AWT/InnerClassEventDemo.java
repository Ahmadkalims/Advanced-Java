import java.awt.*;
import java.awt.event.*;

public class InnerClassEventDemo extends Frame
{
    Button b;

    InnerClassEventDemo() 
    {
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 40);
        add(b);

        // Anonymous inner class for ActionListener
        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.out.println("Button clicked using inner class!");
            }
        });

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new InnerClassEventDemo();
    }
}

// This program demonstrates handling button click events using an inner class in an AWT application.
//output will be:
// A window with a button labeled "Click Me". Clicking the button prints a message to the console.
