
class Room
{
	int length, breadth;
	Room(int x, int y)
	{
		length = x;
		breadth = y;
	}
	int area()
	{
		return (length * breadth);
	}
}

class BedRoom extends Room
{
	int height;
	BedRoom(int x, int y, int z)
	{
		super(x, y);
		height = z;
	}
	int volume()
	{
		return (length * breadth * height);
	}
}


public class SingleLevelInheritance 
{

	public static void main(String[] args) 
	{
		BedRoom br1 = new BedRoom(14, 12, 10);
		
		int area1 = br1.area();
		
		int vol1 = br1.volume();
		
		System.out.println("Area of BedRoom = " + area1);
		System.out.println("Volume of BedRoom = " + vol1);

	}

}
