import java.util.*;
public class User
{
	public String firstName;
	public String lastName;


    public static void log(Object o)
    {
   		System.out.print(o);
	}

    public static void logLn(Object o)
    {
        System.out.println(o);
    }

	public String getFullName()
	{
		return getFirstName() + " "  + lastName.toUpperCase();
	}

	public String output()
	{
		return "Hi, my name is "+ getFirstName() + " "  + getLastName() + ".";
	}
	
	
	//Now I will overload output
	public String output(boolean nice)
	{
		if(nice)
		{
			return " Youre an awesome person"+ " "  + getFullName() + ".";
		}
		else
		{
			return "Youre an idiot"+ " "  + getFullName() + ".";
	    }
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	//Setter not returning anything ∴ void
	public void setFirstName(String firstName)
	{
		//Assigning the fName value we pass in to the field firstName
		firstName=firstName.trim();
		//the .strip remove any whitespaces before output.
		//ALAN: I used the .trim because .strip cannot be found even though I import java.util.*
		
	}

	public String getLastName()
	{
		return lastName;
	}

	//Setter not returning anything ∴ void
	public void setLastName(String ln)
	{
		//Assigning the lN value we pass in to the field lastName
		lastName=ln;
	}
	

	public static void printUsers(List<User> users)
	{
		//I want to iterate through the users
		//For each User o in users)
		for(User o:users)
		{
			logLn(o.getFullName());
		}
	}

	public static int searchList(List<User> user, String fn, String ln)
	{
		return searchList(user, fn + " " + ln);
	}

	//OVERLOAD
	public static int searchList(List<User> user, String fullName)
	{
		//iterate through the list
		for(int i=0;i<user.size();i++)
		{
			//Use .equals instead of ==
			
			if(user.get(i).getFullName().equals(fullName))
			{
				return i;
			}
		}

		//if no match
		return -1;
	}
}
