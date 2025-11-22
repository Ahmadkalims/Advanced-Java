// Example of computing factorial of a number using recursion
class Factorial
{
	int f;
	Factorial(int f)
	{
		this.f=f;
	}
	int fact(int x)
	{
		if(x==1)
		{
			return 1;
		}
		else
		{
			return (x*fact(x-1));
		}
	}
}

public class ComputeFactorial 
{

	public static void main(String[] args) 
	{
		Factorial f = new Factorial(5);
		int n=f.fact(f.f);
		System.out.println("Factorial of 5 = "+n);
	}

}
