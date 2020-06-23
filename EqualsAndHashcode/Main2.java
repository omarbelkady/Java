import java.util.*;

public class Main2
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
		him.setFirstName("Omar ");
		him.setLastName("Belkady");

				
		List<User> users = new ArrayList<User>();
		users.add(myself);
		users.add(him);

        logln(myself.hashCode() == him.hashCode());       
	}
	
}
