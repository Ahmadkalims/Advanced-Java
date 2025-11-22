// Example of static method and variables in a class by calculating cube of a number

class CalCube
{  
	static int y;
	int p;
	
	static void add()
	{
		System.out.println("Hello");
	}
	
  static int cube(int x)
  {
	  y=y+x;
	  //add();
	  return x*x*x;  
  }    
}  
public class MethodStaticCalculate
{
	public static void main(String args[])
	{  
		  int result=CalCube.cube(5); 
		  CalCube.add();
		  System.out.println(result);  
	}
}

//Output:
//Hello 125