
class Pyramid
{
	synchronized void draw_pyramid(char ch)
	{
		for(int i=0;i<10;i+=2)
		{
			for(int j=10-i;j>0;j-=2)
			{
				System.out.print("   ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+ch+" ");
			}
			System.out.println();
		}
	}
}

class A1 extends Thread
{
	Pyramid p;
	A1(Pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('*');
	}
}
class B1 extends Thread
{
	Pyramid p;
	B1(Pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('#');
	}
}
class C1 extends Thread
{
	Pyramid p;
	C1(Pyramid p)
	{
		this.p=p;
	}
	public void run()
	{
		p.draw_pyramid('&');
	}
}

public class SynchTest 
{

	public static void main(String[] args)
	{
		Pyramid pobj = new Pyramid();
		A1 threadA = new A1(pobj);
		B1 threadB = new B1(pobj);
		C1 threadC = new C1(pobj);
		threadB.start();
		threadA.start();
		threadC.start();

	}

}
