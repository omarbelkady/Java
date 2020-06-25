public abstract class User
{
	private String firstName;//fieldA
	private String lastName;//fieldB
	
    	public static void log(Object o)
   	{
   	    System.out.print(o);

   	}
	
    	public static void logln(Object o)
	{
	    System.out.println(o);
	}

	//Remember this is an abstract class which means
	//we will not be invoking the constructor directly
	//Which means to not call it within our calling program
	//But in our Student Class
	//I create a User Constructor
	public User(String fName, String lName)
	{
		//Remember fieldName=parameterName
		//NOTTT parameterName=fieldName
		firstName=fName;
		lastName=lName;


	}

	public final void sayHello()
	{
	    logln(firstName+ " "  + lastName);
	}	
}

    //Remember this is an abstract class which means
    //we will not be invoking the constructor directly
    //Which means to not call it within our calling program
    //But in our Student Class
