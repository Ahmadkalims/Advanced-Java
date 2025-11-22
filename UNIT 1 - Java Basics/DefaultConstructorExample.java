// Example of Default Constructor in Java
/*public class DefaultConstructorExample
{
	int a,b;
	
	DefaultConstructorExample()
	{
		System.out.println("A class is created with default constructor.");
		a=10;
		b=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

	public static void main(String[] args) 
	{
		DefaultConstructorExample d = new DefaultConstructorExample();
	}

}*/
// Another way of writing Default Constructor Example
class Cal
{
	int a,b;
	Cal()
	{
		a=10;
		b=20;
	}
}

public class DefaultConstructorExample
{
	public static void main(String[] args) 
	{
		Cal c = new Cal();
		
		System.out.println("a = "+c.a);
		System.out.println("b = "+c.b);
	}

}