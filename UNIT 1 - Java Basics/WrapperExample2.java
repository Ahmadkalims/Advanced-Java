//Java program to convert object into primitives  
//Unboxing example of Integer to int  
// Example of Wrapper class in Java
public class WrapperExample2
{
	public static void main(String args[])
	{
		
		//Converting Integer to int    
		Integer a=3;//new Integer(3);  
		
		Integer b = Integer.valueOf(5);
		
		int i=a.intValue();//converting Integer to int explicitly  
		
		int j=a;//unboxing, now compiler will write a.intValue() internally  
		
		int k = b;
    
		System.out.println(a+" "+i+" "+j+" "+b+" "+k);    

	}
}   

// Output:
// 3 3 3 5 5