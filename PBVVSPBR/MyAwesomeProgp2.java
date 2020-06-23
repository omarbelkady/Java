import java.util.*;

public class MyAwesomeProg2
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
			//Object user#1
			User myself = new User();
			myself.setFirstName("Omar");
			myself.setLastName("Belkady");


			//Object user#2
			User him = new User();
			him.setFirstName("Omar ");
			him.setLastName("Belkady");

			//List of  user Objects		
			List<User> users = new ArrayList<User>();
			users.add(myself);
			users.add(him);

			int p =6;
			User.changeSth(p);
			logln(p);//prints 6 because increment didn’t affect var

			User.changeSth(him);
			logln(him);

	}
}
