class ExceptionExample2
{
	public static void main(String args [] )
	{
		try
		{
			int[] arr = {1, 2, 3};
			System.out.println(arr[5]); // error
			
			try
			{
				int x=5/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by Zero");
			}
			
		} 
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		//catch(ArithmeticException e)
		//catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index!");
			
		} 
		catch(Exception e)
		{
			System.out.println("Next Error");
		}
		finally
		{
		    System.out.println("This will always execute");
		}

	}
}