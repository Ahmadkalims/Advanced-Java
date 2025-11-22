// Example of calculating area of rooms using constructors in Java
class Room
{
	int length, breadth;
	Room()
	{
		
	}
	Room(int x, int y)
	{
		length=x;
		breadth=y;
	}
	Room(int x)
	{
		length=breadth=x;
	}
	double roomArea()
	{
		double area;
		area=length * breadth;
		return area;
	}
}


public class ConstructorsRoomArea 
{

	public static void main(String[] args) 
	{
		Room r1=new Room(20,15);
		Room r2=new Room(35);
		
		double area1=r1.roomArea();
		double area2=r2.roomArea();
		
		System.out.println("Area of room = " + area1);
		System.out.println("Area of room = " + area2);

	}

}
