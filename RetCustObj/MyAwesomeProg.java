import java.util.*;

public class MyAwesomeProg
{
	public static void log(Object o)
   	{       
   		System.out.print(o);
	}

	public static void logln(Object o)
	{
   		System.out.println(o);
	}
    
	public static void main(String [] args)
	{

		User myself = new User();
		myself.setFirstName("Omar ");
		myself.setLastName("Belkady");
		
		
		
		User her = new User();
		her.setFirstName("Bent ");
		her.setLastName("Al3ahira");

				
		List<User> users = new ArrayList<User>();
		users.add(myself);
		users.add(him);

		//Creating a user named Search
		User recherche = new User();
		recherche.setFirstName(“Bent”);
		recherche.setLastName(“Al3ahira”);


		//since this returns a user we can set it to a User object
		User located = User.searchForUser(users, recherche);

		//With this new user object created we will log it to the console.
		logln(located);//returns User[getFullName()=Bent Al3ahira]
		//The memory address of the object is passed by VALUE

	}
	
}

