import java.util.ArrayList;
import java.util.List;

public class custtypeasargs
{
	public static void main(String [] args)
	{
		String [] firstNames = {"Omar", "Angela", "Nouhaila", "Noor", "Alan"};
		String [] lastNames = {"Belkady", "Cao", "Bahtat", "Zalila", "Ngo"};

		List<User> users = new ArrayList<User>();

		
		for(int j=0;j<firstNames.length;j++)
		{
			User o = new User();
			o.setFirstName(firstNames[j]);
			{
				System.out.println(o.getFullName());
			}

		    //Instantiate myCustTypeArgs  because it is not static
		    Main n = new Main();
		    n.printUser(users.get(0));
		}
	
	//Method to take the user
	public void printUser(User u)
	{
		//Reference the user object
		System.out.println(u.getFullName());
	}
	

    o.setLastName(lastNames[j]);
	    users.add(o);
}

	for(User o: users)
	{
		System.out.println(o.getFullName());
	}
}
