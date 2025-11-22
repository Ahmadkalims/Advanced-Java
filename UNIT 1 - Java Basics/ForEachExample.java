// Example of for-each loop in Java with break statement
public class ForEachExample
{

	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};  
		for(int i:arr)
		{
			if(i==20)
			{
				break;
			}
			System.out.print(i+" ");
		}
	}  
}
