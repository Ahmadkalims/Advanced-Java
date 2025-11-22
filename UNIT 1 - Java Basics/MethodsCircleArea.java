// Example of calculating area of circle using methods in a class
public class CircleArea 
{
	int r;
	
	double area(int x)
	{
		double a=3.14*x*x;
		return(a);
	}
	

	public static void main(String[] args)
	{
		CircleArea ca=new CircleArea();
		ca.r=10;
		
		double area1, area2;
		
		area1=3.14*ca.r*ca.r;
		
		System.out.println("Area of circle = "+area1);
		
		area2=ca.area(20);
		
		System.out.println("Area of circle = "+area2);

	}

}
