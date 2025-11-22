// Demonstrates the use of 'super' keyword in Java inheritance
class Animal2
{
	int x;
	Animal2()
	{
		System.out.println("animal is created");
	}  
	Animal2(int x)
	{
		this.x=x;
	}
}  
class Dog2 extends Animal2
{
	Dog2()
	{
		super();
		//super(10);
		System.out.println("dog is created");
		//super();
		
	}  
}  

/*class Dog3 extends Dog2
{
	Dog3()
	{
		super.super();
	}
}*/
class Super3
{
	public static void main(String args[])
	{
		Dog2 d=new Dog2();
	}
} 

// This program demonstrates the use of 'super' keyword in Java inheritance.
//output will be:
// animal is created
// dog is created