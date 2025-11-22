class A extends Thread
{
	public void run()
	{
		for(int i=1; i<=1000; i++)
		{
			if(i==3 || i==45 || i==55)
				Thread.yield();  
			
			System.out.println("From Thread A: i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=1; j<=1000; j++)
		{
			if(j==23)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			System.out.println("From Thread B: j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=1; k<=1000; k++)
		{
			if(k==5)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			System.out.println("From Thread C: k = " + k);
		}
		System.out.println("Exit from C");
	}
}

public class ThreadTest1 
{
	public static void main(String[] args) 
	{
		new A().start();
		new B().start();
		new C().start();
	}
}
