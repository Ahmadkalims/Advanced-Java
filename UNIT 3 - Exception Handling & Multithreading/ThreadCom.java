
class Circle
{
	float radius = 0.0f;
	synchronized void output() 
	{
		System.out.println("Output method invoked for displaying area of circle...");
		if(radius==0.0)
		{
			System.out.println("Waiting for input radius...");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Area = "+3.14*radius*radius);
		
	}
	synchronized void input(float r)
	{
		System.out.println("Inputting radius...");
		radius = r;
		System.out.println("Radius value received...");
		notify();
	}
}

public class ThreadCom
{

	public static void main(String[] args)
	{
		Circle c = new Circle();
		new Thread()
		{
			public void run()
			{
				c.output();
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.input(2.5f);
			}
		}.start();

	}

}

//output will be:
// Output method invoked for displaying area of circle...
// Waiting for input radius...
// Inputting radius...
// Radius value received...
// Area = 19.625
