abstract class Base 
{
    Base()
    {
         System.out.println("Base Constructor Called");
    }

     abstract void fun();
}


abstract class Derived extends Base
{

    Derived()
    {
        System.out.println("Derived Constructor Called");
    }


   /* void fun()
    {
        System.out.println("Derived fun() called");
    }*/
}

class DerivedNext extends Derived
{
	DerivedNext()
    {
        System.out.println("DerivedNext Constructor Called");
    }
	
	void fun()
    {
        System.out.println("Derived fun() called");
    }
}


public class AbstractExample3
{
	public static void main(String args[])
    {
        // Creating object of class 2
        // inside main() method
        //Derived d = new Derived();
		DerivedNext dn = new DerivedNext();
		dn.fun();
    }

}
