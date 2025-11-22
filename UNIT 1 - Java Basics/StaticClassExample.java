// Example of Static Inner Class in Java
class OuterClass
{
	static String note = "Hello from OuterClass";
	
	static class StaticInnerClass
	{
		StaticInnerClass()
		{
			System.out.println("From Inner");
		}
		
		void display()
		{
			System.out.println("Message from StaticInnerClass");
		}
	}
}

public class StaticClassExample 
{

	public static void main(String[] args) 
	{
		System.out.println(OuterClass.note);
		
		OuterClass oc = new OuterClass();
		
		OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
		inner.display();
		
	}
}

//Output:
//Hello from OuterClass
//From Inner
//Message from StaticInnerClass