// Example of command line arguments in Java
public class CmdLineExample 
{
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(i+" argument: " + args[i]);
	    }
	}
}

//Output (if run with arguments "Hello World"):
//0 argument: Hello
//1 argument: World