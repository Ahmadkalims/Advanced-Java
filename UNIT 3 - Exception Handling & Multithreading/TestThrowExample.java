
public class TestThrowExample
{
	static void checkAge(int age) 
	{
		if (age < 18)
		{		
			//System.out.println("Access denied - You must be 18+");
			throw new ArithmeticException("Access denied - You must be 18+");
		} 
		else
		{
			System.out.println("Access granted!");
		}
	}
	
	public static void main(String[] args) 
	{
	
		try
		{
			checkAge(15);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}    

//output will be:
// Access denied - You must be 18+