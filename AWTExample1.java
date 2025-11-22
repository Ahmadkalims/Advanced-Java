// importing Java AWT class  
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;    
  
// extending Frame class to our class AWTExample1  
public class AWTExample1 extends Frame 
{    
  
   // initializing using constructor  
   AWTExample1() 
   {  
  
      // creating a button   
      Button b = new Button("Click Me!!");  
  
      // setting button position on screen  
      b.setBounds(150,150,125,100);  
  
      // adding button into frame    
      add(b);  
  
      // frame size 300 width and 300 height    
      setSize(600,600);  
  
      // setting the title of Frame  
      setTitle("This is our basic AWT Example");   
          
      // no layout manager   
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
      
      addWindowListener(new WindowAdapter()
      {
        public void windowClosing(WindowEvent e) 
        {
            dispose(); // closes the frame
            System.exit(0); // ends the program
        }
      });
   }    
  
   // main method  
   public static void main(String args[]) 
   {  	 
  
	   // creating instance of Frame class   
	   AWTExample1 f = new AWTExample1();    
  
   }  
  
}    