import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class User
{
    private String lN;
    private String fN;
    
    static void log(Object o)
    {
   		System.out.print(o);
	}

    static void logln(Object o)
	{
        System.out.println(o);
    }

    //Setter not returning anything ∴ void
	public void setFirstName(String firstName)
	{
		//Assigning the fName value we pass in to the field firstName
		fN=firstName.toLowerCase();
		//the .strip remove any whitespaces before output.
		
	}
	
	public String getFullName()
	{
		return getFirstName() + " "  + lN.toUpperCase();
	}


	public String getLastName()
	{
		return lN;
	}


    public String output()
	{
		return "Hi, my name is "+ getFirstName() + " "  + getLastName() + ".";
	}


    public String output(boolean nice)
	{
		if(nice)
		{
			return "You\re an awesome person"+ " "  + getFullName() + ".";

		}
		return "You\'re an idiot"+ " "  + getFullName() + ".";
	}



    public void setLastName(String lastName)
	{
		//Assigning the lN value we pass in to the field lastName
		lN=lastName;
	}
	
	public String getFirstName()
	{
		return fN.toUpperCase();
	}


    public static void printUsers(List<User> users)
	{
		//I want to iterate through the users
		//For each User o in users)
		for(User o:users)
		{
			logln(o.getFullName());
		}
	}


    public String toString()
    {
        return fN+lN;
    }


	public static void main(String [] args)
	{
		


		User myself = new User();
		myself.setFirstName("Omar");
		myself.setLastName("Belkady");
		
		
		
	   /*	User him = new User();
		/*him.setFirstName("Alan ");
		him.setLastName(null);
		logln(him.toString());
		*/
		User she = new User();
		she.setFirstName("Angela ");
		she.setLastName("");
		//a blank string is not the same as NULL. This WILL NOT PRINT ANGELA NULL
		logln(she);
		//Should output Alan null;
		//This will trigger a null pointer exception because we are trying to referene a null valeu
		
		List<User> users = new ArrayList<User>();
		users.add(myself);
		//users.add(him);
	
		//Pass in an entire list
		User.printUsers(users);

		logln(myself.output());

		logln(myself.output());//nice message
		logln(myself.output());//mean message
    }
	
}
