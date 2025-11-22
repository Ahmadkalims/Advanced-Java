// Example of printing all prime numbers from 1 to 100 using nested loops
class Prime
{
	int i,j;
	void compute()
	{
		for(i=1;i<=100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.print(" "+i);
			}
		}
	}
}

public class PrimeNumbers 
{

	public static void main(String[] args)
	{
		Prime p = new Prime();
		p.compute();
	}

}
