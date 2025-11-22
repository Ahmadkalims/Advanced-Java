// This program demonstrates the use of interfaces in Java
interface Area
{
	final static double pi = 3.14;
	double compute (double x, double y);
}

class Rectangle implements Area
{
	public double compute(double x, double y)
	{
		return x*y;
	}
}

class Circle implements Area
{
	public double compute(double x, double y)
	{
		return (pi*x*x);
	}
}


public class InterfaceTest 
{

	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		Area area;
		
		area = rect;
		
		System.out.println("Area of rectangle = "+/*rect*/area.compute(10, 20));
		
		area = cir;
		
		System.out.println("Area of circle = "+area.compute(10, 0));

	}

}
