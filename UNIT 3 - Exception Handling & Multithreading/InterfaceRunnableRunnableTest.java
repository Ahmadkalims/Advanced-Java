// Example of implementing Runnable interface to create threads in Java
class X implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("\tThreadX: "+i);
		}
		System.out.println("End of ThreadX");
	}
}

class Y implements Runnable
{
	public void run()
	{
		for(int j=1;j<=100;j++)
		{
			System.out.println("\tThreadY: "+j);
		}
		System.out.println("End of ThreadY");
	}
}

class Z implements Runnable
{
	public void run()
	{
		for(int k=1;k<=100;k++)
		{
			System.out.println("\tThreadZ: "+k);
		}
		System.out.println("End of ThreadZ");
	}
}

public class InterfaceRunnableRunnableTest 
{

	public static void main(String[] args) 
	{
		X xRun = new X();
		Thread threadX = new Thread(xRun);
		threadX.start();
		
		Y yRun = new Y();
		Thread threadY = new Thread(yRun);
		threadY.start();
		
		Z zRun = new Z();
		Thread threadZ = new Thread(zRun);
		threadZ.start();
		System.out.println("End of Main Thread.");

	}

}

// This program demonstrates creating and running threads using the Runnable interface in Java.
//output will be:
// End of Main Thread.
// 		ThreadX: 1
// 		ThreadY: 1
// 		ThreadZ: 1
// 		...
// End of ThreadX
// End of ThreadY
// End of ThreadZ		
