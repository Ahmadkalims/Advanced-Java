import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener 
{
    Label l;

    MouseEventDemo()
    {
        l = new Label();
        l.setBounds(50, 50, 200, 30);
        add(l);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 300);
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

    
    
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked at " + e.getX() + "," + e.getY());
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    
    public static void main(String[] args)
    {
        new MouseEventDemo();
    }
}

// This program demonstrates handling mouse events in an AWT application.
//output will be:
// A window that displays the coordinates of mouse clicks within the window.
