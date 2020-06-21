public class Getset
{
	private String firstName;
	public String lastName;
	
	public String getFullName()
	{
		return getFirstName() + " "  + lastName;
	}

	public String output()
	{
		return "Hi, my name is "+ firstName + " " + lastName + ".";
	}
	public String getTheFirstName()
	{
		return firstName.toUpperCase();
	}

	//Setter not returning anything ∴ void
	public void setFirstName(String fN)
	{
		//Assigning the fName value we pass in to the field firstName
		firstName=fN.strip().toLowerCase();
		//the .strip remove any whitespaces before output.
		
	}

	public String getTheLastName()
	{
		return lastName;
	}

	//Setter not returning anything ∴ void
	public void setLastName(String lN)
	{
		//Assigning the lN value we pass in to the field lastName
		lastName=lN;
	}

}
