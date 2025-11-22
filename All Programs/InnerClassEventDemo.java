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
