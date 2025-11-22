// This program demonstrates the use of 'super' keyword to call superclass methods in Java
class Animal1
{
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Dog1 extends Animal1
{
	void eat()
	{
		System.out.println("eating bread...");
	}  
	
	void bark()
	{
		System.out.println("barking...");
	}
	
	void work()
	{
		super.eat();
		
	//	eat();
		
		bark();
	
		
	}  
}  
class Super2
{  
	public static void main(String args[])
	{
		Dog1 d=new Dog1();
		d.work();
	}
}  