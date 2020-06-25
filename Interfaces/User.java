public abstract class User
{
    //MAKE YOUR FIELDS PRIVATE WHEN USING ANY CLASS FOR BETTER CODE PRACTICE
    
	private String firstName;//fieldA
	private String lastName;//fieldB
	private boolean isVerified = false;

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

	
}

    //Remember this is an abstract class which means
    //we will not be invoking the constructor directly
    //Which means to not call it within our calling program
    //But in our Student Class
