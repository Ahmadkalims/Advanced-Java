
class Test
{
	int a,b,c;
	Test()
	{
		this(10,20,30);
		a=125;
		b=225;
		
	}
	Test(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("a= "+this.a+"\nb= "+this.b);
	}
	Test(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("a= "+this.a+"\nb= "+this.b+"\nc= "+this.c);
	}
	
	
	void display()
	{
		this.show();
		System.out.println("Inside display");
	}
	void show()
	{
		System.out.println("Inside show");
	}
	
	
	void view(Test ob)
	{
		System.out.println("a= "+ob.a+"\nb= "+ob.b);
	}
	
	void set()
	{
		view(this);
	}
	
	
	Test get()
	{
		return this;
	}
}


public class ThisExample 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.set();
		t.get().show();
		t.show();
		t.display();

	}

}
