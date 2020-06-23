//I will override the address output 
import java.util.*;
public class User
{
	private String firstName;
	public String lastName;
	
	static void log(Object o)
    {
   		System.out.print(o);
	}

    static void logln(Object o)
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
			return "You\'re an awesome person"+ " "  + getFullName() + ".";

		}
		return "You\'re an idiot"+ " "  + getFullName() + ".";
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	//Setter not returning anything ∴ void
	public void setFirstName(String fN)
	{
		//Assigning the fName value we pass in to the field firstName
		fN=firstName;
		//the .trim at the end will raise a null pointer exception because 
		//it doesn't know what are we referencing
		//the .strip remove any whitespaces before output.
		
	}

	public String getLastName()
	{
		return lastName;
	}

	//Setter not returning anything ∴ void
	public void setLastName(String lN)
	{
		//Assigning the lN value we pass in to the field lastName
		lN=lastName;
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
	
	//Overload search and pass in this time a USER OBJECT
    	public static int searchList(List<User> users, User u)
    	{
        	return searchList(users, u.getFullName());
    	}

	public static int searchList(List<User> users, String fN, String lN)
	{
		return searchList(users, fN + " "  + lN);
	}

	//OVERLOAD
	public static int searchList(List<User> users, String fullName)
	{
		//iterate through the list
		for(int i=0;i<users.size();i++)
		{
			//Use .equals instead of ==
			if(users.get(i).getFullName().equals(fullName))
			{
				return i;
			}
		}

		//if no match
		return -1;
	}


   //Now I will override the ToString
    @Override
    public String toString()
    {
        //To override remember to give the method to override the same name
        return "  " + getFullName() + "]";
    }

    //Intended to put obj in a hash table ∴ turn the hash code into a number
    @Override
    public int hashCode()
    {
    	final int prime = 19;
    	int res = 1;
    	res= prime * res + ((firstName==null) ? 0 : firstName.hashCode());
    	res= prime * res + ((lastName==null) ? 0 : lastName.hashCode());
    	return res;
    }

    @Override
    public boolean equals(Object obj)
    {
    	if(this == obj)
        {
    		return true;
        }
    	if(obj == null)
    	{
    		return false;
    	}
    	if(getClass() != obj.getClass())
    	{
            return false;
    	}

        User other = (User) obj;

        if(firstName == null){
            if(other.firstName != null)
            {
                return false; 
            }
		} 
		else if(!firstName.equals(other.firstName))
		{
	        logln(false);
            
            if(lastName == null)
            {
			    if(other.lastName != null)
			    {
                    return false; 
			    }
		    }	 
		    else if(!lastName.equals(other.lastName))
		    {
				return false;
		    }
		}
		 return true;
    }
}
