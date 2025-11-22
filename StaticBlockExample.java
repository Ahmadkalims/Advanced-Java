 
public class StaticBlockExample 
{
	
	
	public static void main(String args[])
	{  
		   System.out.println("Hello main");  
	}
	
	static
	{
		  System.out.println("static block is invoked1");
		  System.out.println("static block is invoked2");
	}
	
	
}
