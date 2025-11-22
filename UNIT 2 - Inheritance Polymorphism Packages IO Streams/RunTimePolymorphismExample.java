class Parent 
{   
    void Print() 
    {
        System.out.println("parent class");
    }
}

class Subclass1 extends Parent 
{
    void Print() 
    { 
      System.out.println("subclass1"); 
    }
}


class Subclass2 extends Subclass1//Parent 
{    
    void Print()
    {
        System.out.println("subclass2");
    }
}


public class RunTimePolymorphismExample
{

	 public static void main(String[] args) 
	 {	        
	        Parent a;
	        
	        //Subclass2 a;

	        // Now we will be calling print methods inside main() method
	        a = new Parent();
	        a.Print();
	        
	        a = new Subclass1();
	        a.Print();

	        a = new Subclass2();
	        a.Print();
	  }
}
