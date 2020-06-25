import java.util.*;

public class MyAwesomeProg1
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
		
		
		
		User him = new User();
		him.setFirstName("Alan ");
		him.setLastName("6342");

				
		List<User> users = new ArrayList<User>();
		users.add(myself);
		users.add(him);

		logln(myself.toString());       
	}
	
}

