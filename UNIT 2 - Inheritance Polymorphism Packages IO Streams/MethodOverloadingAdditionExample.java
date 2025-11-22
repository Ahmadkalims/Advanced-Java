// Example of Method Overloading
class Addition
{
	int x, y, z;
	int addData(int p, int q, int r)
	{
		x=p;
		y=q;
		z=r;
		int add = x+y+z;
		return (add);
	}
	int addData(int p, int q)
	{
		x=p;
		y=q;
		int add = x+y;
		return (add);
	}
	int addData(int p)
	{
		x=p;
		y=p;
		int add = x+y;
		return (add);
	}
}

public class MethodOverloadingAdditionExample 
{

	public static void main(String[] args) 
	{
		Addition a1 = new Addition();
		Addition a2 = new Addition();
		Addition a3 = new Addition();
		
		int add1 = a1.addData(10, 20, 30);
		int add2 = a2.addData(15, 30);
		int add3 = a3.addData(125);
		
		System.out.println("Addition of 3 int = " + add1);
		System.out.println("Addition of 2 int = " + add2);
		System.out.println("Addition of 1 int = " + add3);
	}

}
