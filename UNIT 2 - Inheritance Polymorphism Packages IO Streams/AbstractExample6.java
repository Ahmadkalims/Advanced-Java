abstract class Helper
{
	static void demofun()
    {
		System.out.println("Static Method in abstract class Helper");
    }
	abstract void add();
}


public class AbstractExample6 //extends Helper
{
	public static void main(String[] args)
    {
        Helper.demofun();
    }

}
