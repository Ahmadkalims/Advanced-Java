
class Super
{
	int x;
	Super(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("Super x = " + x);
	}
}
class Sub extends Super
{
	int y;
	Sub(int x, int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Super x = " + x);
		System.out.println("Sub y = " + y);
	}
}

public class OverrideTest
{

	public static void main(String[] args)
	{
		/*Sub ob1 = new Sub(100, 200);
		ob1.display();*/
		
		
		Super sp;
		sp = new Super(15);
		sp.display();
		
		sp = new Sub(25,45);
		sp.display();
		
	}

}
