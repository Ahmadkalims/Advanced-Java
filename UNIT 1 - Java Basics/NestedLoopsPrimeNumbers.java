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

public class NestedLoopsPrimeNumbers 
{

	public static void main(String[] args)
	{
		Prime p = new Prime();
		p.compute();
	}

}

//Output:
//1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97