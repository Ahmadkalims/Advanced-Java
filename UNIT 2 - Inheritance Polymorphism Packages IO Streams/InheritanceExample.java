// Java program to demonstrate inheritance 
class Bicycle 
{
    
    public int gear;
    public int speed;

    
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    
    public String toString()
    {
        return ("No of gears are: " + gear + "\n"
                + "Speed of bicycle is: " + speed);
    }
}

// derived class
class MountainBike extends Bicycle 
{

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nSeat height is: "
                + seatHeight);
    }
}

// driver class
public class InheritanceExample 
{

	public static void main(String args[])
    {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }

}

// This program demonstrates inheritance in Java by creating a base class Bicycle and a derived class MountainBike.
//output will be:
// No of gears are: 3
// Speed of bicycle is: 100
// Seat height is: 25
