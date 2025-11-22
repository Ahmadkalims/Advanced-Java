// Example of static variable to count number of instances created of a class 
class Counter
{
	static int count;//will share the memory for every instances
	
	//int count=0;//will get memory each time when the instance is created
	
	Counter()
	{
		count++;//incrementing value
		System.out.println(count);
	}  
}
  
public class CounterTest
{

	public static void main(String args[])
	{  
		//Creating objects 
		Counter.count=7;
		
		Counter c1=new Counter();  
		Counter c2=new Counter();  
		Counter c3=new Counter();  		
	}
}
