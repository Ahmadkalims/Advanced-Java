import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener 
{
    TextField tf;
    Label l;

    KeyEventDemo() 
    {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 30);
        tf.addKeyListener(this);

        l = new Label();
        l.setBounds(50, 100, 200, 30);

        add(tf); add(l);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() 
        {
        	public void windowClosing(WindowEvent e)
        	{
        		dispose();
        		System.exit(0);
        	}
        });
    }

    public void keyPressed(KeyEvent e) 
    {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) 
    {
        new KeyEventDemo();
    }
}
