
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("From Thread One: i = "+i);
		}
		System.out.println("Exit from One");
	}
}
class Two extends Thread
{
	public void run()
	{
		for(int j=1;j<=100;j++)
		{
			System.out.println("From Thread Two: j = "+j);
		}
		System.out.println("Exit from Two");
	}
}
class Three extends Thread
{
	public void run()
	{
		for(int k=1;k<=100;k++)
		{
			System.out.println("From Thread Three: k = "+k);
		}
		System.out.println("Exit from Three");
	}
}

public class ThreadExample
{
	public static void main(String[] args) 
	{
		One o = new One();
	//	o.run();
		o.start();		
		
		Two t = new Two();
	//	t.run();
		t.start();
		
		Three th = new Three();
	//	th.run();
		th.start();
		
	}

}

// This program demonstrates creating and running threads by extending the Thread class in Java.
//output will be:
// From Thread One: i = 1
// From Thread Two: j = 1
// From Thread Three: k = 1
// ...
// From Thread One: i = 100
// Exit from One
// From Thread Two: j = 100
// Exit from Two
// From Thread Three: k = 100
// Exit from Three