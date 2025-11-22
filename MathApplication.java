
class MathOperation
{
	static double mul(double x, double y)
	{
		return x*y;
	}
	static double div(double x, double y)
	{
		return x/y;
	}
	
}


public class MathApplication 
{

	public static void main(String[] args) 
	{
		double a = MathOperation.mul(45.12, 125.326);
		double b = MathOperation.div(452.68, 12.56);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
