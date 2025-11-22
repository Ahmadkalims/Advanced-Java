// importing Java AWT class  
import java.awt.*;
import java.awt.event.*;    
  
// class AWTExample2 directly creates instance of Frame class  
class AWTExample2 
{    
  
   // initializing using constructor  
   AWTExample2() 
   {  
  
      // creating a Frame  
      Frame f = new Frame();  
  
      // creating a Label  
      Label l = new Label("Employee id:");   
  
      // creating a Button  
      Button b = new Button("Submit");  
  
      // creating a TextField  
      TextField t = new TextField();  
  
      // setting position of above components in the frame  
      l.setBounds(40, 50, 80, 40);  
      t.setBounds(40, 150, 100, 50);  
      b.setBounds(200, 200, 80, 100);  
  
      // adding components into frame    
      f.add(b);  
      f.add(l);  
      f.add(t);  
  
      // frame size 300 width and 300 height    
      f.setSize(400,300);  
  
      // setting the title of frame  
      f.setTitle("Employee info");   
          
      // no layout  
      f.setLayout(null);   
  
      // setting visibility of frame  
      f.setVisible(true);  
      
      f.addWindowListener(new WindowAdapter()
      {
    	  public void windowClosing(WindowEvent e) 
    	  {
    		  f.dispose(); // closes the frame
    		  System.exit(0); // ends the program
    	  }
      });
   }    
  
   // main method  
   public static void main(String args[]) 
   {   
  
	   // creating instance of Frame class   
	   AWTExample2 awt_obj = new AWTExample2();    
  
   }  
  
}