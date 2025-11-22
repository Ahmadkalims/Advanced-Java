
class OuterClass1
{
	int a=10;

	private static String msg = "Hello World";

	// Static nested class
	public static class NestedStaticClass
	{
		// Only static members of Outer class is directly accessible in nested static class
		public void view()
		{
			System.out.println("Message from nested static class: " + msg);
		}
	}

	public class InnerClass
	{
		// Both static and non-static members of Outer class are accessible in this Inner class
		public void display()
		{
			System.out.println("Message from non-static nested class: "+ msg+a);
		}
	}
}

public class Test
{

	public static void main(String args[])
	{

		// Creating instance of nested Static class inside main() method
		OuterClass1.NestedStaticClass ob= new OuterClass1.NestedStaticClass();

		// Calling non-static method of nested static class
		ob.view();

		// Note: In order to create instance of Inner class we need an Outer class instance

		// Creating Outer class instance for creating non-static nested class
		
		OuterClass1 outer = new OuterClass1();
		OuterClass1.InnerClass inner
			= outer.new InnerClass();

		// Calling non-static method of Inner class
		inner.display();

		// We can also combine above steps in one
		// step to create instance of Inner class
		OuterClass1.InnerClass innerObject
			= new OuterClass1().new InnerClass();

		// Similarly calling inner class defined method
		innerObject.display();
	}


}
