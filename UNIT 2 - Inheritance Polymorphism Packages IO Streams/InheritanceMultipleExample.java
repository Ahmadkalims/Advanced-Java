// Example of Multiple Inheritance using Interfaces in Java
interface Add
{
    int add(int a, int b);
}


interface Sub
{
      int sub(int a, int b);
}

class Mul
{
	int mul(int a, int b)
	{
		return (a*b);
	}
}

 
class Cal extends Mul implements Add , Sub
{
      public int add(int a,int b)
      {
          return a+b;
      }
  
      
      public int sub(int a,int b)
      {
    	  return a-b;
      }
}


public class InheritanceMultipleExample 
{
	public static void main (String[] args) 
    {
		Cal x = new Cal();
		
		System.out.println("Addition : " + x.add(2,1));
		System.out.println("Substraction : " + x.sub(2,1));
		System.out.println("Multiplication : " + x.mul(2,1));
    }

}
