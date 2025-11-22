// This program demonstrates method overloading for multiplication of different data types
class Multiplication
{
	int multiplyData(int p, int q, int r)
	{
		int mul = p*q*r;
		return (mul);
	}
	long multiplyData(long p, long q, long r)
	{
		long mul = p*q*r;
		return (mul);
	}
	double multiplyData(double p, double q, double r)
	{
		double mul = p*q*r;
		return (mul);
	}
}

public class MethodOverloadingMultiplicationExample
{
	public static void main(String[] args) 
	{
		Multiplication a1 = new Multiplication();
		Multiplication a2 = new Multiplication();
		Multiplication a3 = new Multiplication();
		
		int mul1 = a1.multiplyData(10, 20, 30);
		long mul2 = a2.multiplyData(1500000, 3000000, 456);
		double mul3 = a3.multiplyData(10.223f, 45.56f, 899.465f);
		
		System.out.println("Multiplication of 3 int = " + mul1);
		System.out.println("Multiplication of 3 long = " + mul2);
		System.out.println("Multiplication of 3 duble = " + mul3);
	}
}

//output will be:
// Multiplication of 3 int = 6000
// Multiplication of 3 long = 2052000000000000
// Multiplication of 3 duble = 414907.12420832
