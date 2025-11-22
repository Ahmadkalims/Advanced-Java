import java.io.*;

class Example
{
	void fileAccess() throws FileNotFoundException, ArithmeticException
	{
		FileReader f = new FileReader("C:\\Users\\thepi\\Music\\Desktop\\Ruf.txt");
		
		BufferedReader br = new BufferedReader(f);
	}
}

public class ThrowsExample
{

	public static void main(String[] args) 
	{

		Example e =  new Example();
		try
		{
			e.fileAccess();
		}
		catch(FileNotFoundException ex)
		{
			//ex.printStackTrace();
			System.out.println("File is Missing "+ex.getMessage());
		}
		
	}

}

// This program demonstrates the use of 'throws' keyword for exception handling in Java.
//output will be: