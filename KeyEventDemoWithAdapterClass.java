import java.awt.*;
import java.awt.event.*;

public class KeyEventDemoWithAdapterClass extends KeyAdapter 
{
	Frame f;
    TextField tf;
    Label l;

    KeyEventDemoWithAdapterClass() 
    {
    	f = new Frame("My Frame");
        tf = new TextField();
        tf.setBounds(50, 50, 150, 30);
        tf.addKeyListener(this);

        l = new Label();
        l.setBounds(50, 100, 200, 30);

        f.add(tf); f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() 
        {
        	public void windowClosing(WindowEvent e)
        	{
        		f.dispose();
        		System.exit(0);
        	}
        });
    }

    public void keyPressed(KeyEvent e) 
    {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

 //   public void keyReleased(KeyEvent e) {}
 //   public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) 
    {
        new KeyEventDemo();
    }
}
