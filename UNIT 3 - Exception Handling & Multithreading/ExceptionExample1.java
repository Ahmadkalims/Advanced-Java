//this program demonstrates exception handling in Java
class ExceptionExample1
{
	public static void main(String args [] )
	{
		int a = 10, b=5, c=5, x,y;
		try
		{
			x = a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}

		y=a/(b+c);

		System.out.println("y="+y);
	//	System.out.println("x="+x);
	}
}
//output will be:
// Division by zero
// y=1
