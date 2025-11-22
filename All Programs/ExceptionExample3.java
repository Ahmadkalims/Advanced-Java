
import java.lang.Exception;

class MyException extends Exception
{
	//private static final long serialVersionUID = 1L;

	MyException(String msg)
	{
		super(msg);
	}
}



public class ExceptionExample3
{
	
	public static void main(String args [] )
	{
		int a = 100000, b=5, x,y;
		try
		{
			x = b/a;
			if(x<0.001)
			{
				throw new MyException("Number is very small");
			}
		}
		catch(MyException e)
		{
			System.out.println("Caught my exception");
			System.out.println(e.getMessage());
		}
		finally
		{			
			y=(b*100000)/a;

			System.out.println("I am always here."+" "+y);
		}
	}
}
