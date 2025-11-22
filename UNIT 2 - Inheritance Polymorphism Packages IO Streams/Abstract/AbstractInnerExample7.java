// Abstract class with inner abstract class and inner concrete class
abstract class B
{
	abstract class C
	{
        abstract void myAbstractMethod();
    }
	
	class F
	{
		void view()
		{
			System.out.println("Inside class F");
		}
	}
}
class D extends B 
{
	class E extends C
	{
		void myAbstractMethod()
        {
			System.out.println("Inside abstract method implementation");
        }
    }
	class G extends F
	{
		void view()
		{
			System.out.println("Inside class G");
		}
	}
}

public class AbstractInnerExample7 
{
	public static void main(String args[])
    {
        // Instantiating the outer class
        D outer = new D();

        // Instantiating the inner class
        D.E inner = outer.new E();
        inner.myAbstractMethod();
        
        D.F iner;
        
        iner = outer.new G();
        iner.view();
        
        iner = outer.new F();
        iner.view();
        
        
    }

}
