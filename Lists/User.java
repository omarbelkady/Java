public class User
{
	private String fN;
	public String lN;
	
	public String getFullName()
	{
		return getFirstName() + " "  + lN.toUpperCase();
	}

	public String output()
	{
		return "Hi, my name is "+ fN + " "  + lN + ".";
	}
	public String getFirstName()
	{
		return fN.toUpperCase();
	}

	//Setter not returning anything ∴ void
	public void setFirstName(String firstName)
	{
		//Assigning the fName value we pass in to the field firstName
		fN=firstName.strip().toLowerCase();
		//the .strip remove any whitespaces before output.
		
	}

	public String getLastName()
	{
		return lN;
	}

	//Setter not returning anything ∴ void
	public void setLastName(String lastName)
	{
		//Assigning the lN value we pass in to the field lastName
		lN=lastName;
	}

}
