import java.util.ArrayList;
import java.util.List;

public class MyArrList
{
	public static void main(String [] args)
	{
		//Creating an array of Names
		String [] fNames = {"Richard", "Nouhaila", "Hicham", "Alan", "Angela", "Waleed"};
		String [] lNames = {"Nguyen", "Bahtat", "Ikken", "Ngo", "Cao", "ana"};
		//Creating a user list
		List<User> user = new ArrayList<User>();

		//Just assume we are reading the data from a file 

		//Create a loop to loop through and first invoke the new user
		//Then we set the firstName
		//Then we set the lastName
		for(int i=0; i<fNames.length;i++)
		{
			//Converting a bunch of string data to objects
			User n = new User();
			n.setfName(fNames[i]);
			n.setfName(lNames[i]);
			users.add(n);
		}
		
		//Output all the elements using a for each
		for(User n:user)
		{
			System.out.println(n.getFullName());
		}
		
	}
}
