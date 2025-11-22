// Example of Hybrid Inheritance in Java using Classes and Interfaces
class Student
{
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber = n;
	}
	void putNumber()
	{
		System.out.println("Roll Number: "+rollNumber);
	}
	void view()
	{
		System.out.println("Inside Student");
	}
}

class Test extends Student
{
	double part1, part2;
	void getMarks(double m1, double m2)
	{
		part1 = m1;
		part2 = m2;
	}
	void putMarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("part1 = " + part1);
		System.out.println("part2 = " + part2);
	}
	
	
	void view()
	{
		System.out.println("Inside Test");
	}
}

interface SportWt
{
	final double sportWt = 6.0;
}
interface Sport extends SportWt
{
	void putWt();
	void view();
}

class Results extends Test implements Sport
{
	double total;
	public void putWt()
	{
		System.out.println("Sports Wt = "+sportWt);
	}
	void display()
	{
		total = part1 + part2 + sportWt;
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total Score = "+total);
	}
	
	public void view()
	{
		System.out.println("Inside Results");
	}
}

public class InheritanceHybrid 
{

	public static void main(String[] args) 
	{
		Results stu1 = new Results();
		stu1.getNumber(1234);
		stu1.getMarks(27.5, 33.0);
		stu1.display();
		
		Student t;
		//t=new Test();
		t=new Test();
		t.view();
		stu1.view();

	}

}
