// Example of printing numbers between 1 to 1000 that are divisible by both 7 and 11
public class LogiacalOPExample1 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0 && i%11==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
