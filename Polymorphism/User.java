public abstract class User
{
	public String firstName;//fieldA
	public String lastName;//fieldB
	public boolean verified = false;

	public static void log(Object o)
   	{       
   		System.out.print(o);
	}

	public static void logln(Object o)
	{
   		System.out.println(o);
	}


	/*
	the sayHello Method has a keyword abstract in its function definition.
	This means that we cannot have a body.
	*/
	public abstract void sayHello();
	
}
