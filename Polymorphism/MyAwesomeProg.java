/*
Now because both Student and Teacher extend User we can say that every 
Student and Teacher is a User.
THE OPPOSITE HOWEVER IS NOT ALWAYS TRUE.
*/


import java.util.List;
import java.util.ArrayList;

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
		Student m = new Student();
		m.major= "Biology";
		m.firstName = "Nathan";
		m.lastName = "Higgins";
		m.sayHello();

		Teacher c = new Teacher();
		c.firstName = "chauntelle";
		c.lastName = "o\'loughlin";

		//Since both these classes we created instances of,
		//extended User we will append them to a list of Type
		//User
		List<User> acadUsers = new ArrayList<User>();
		acadUsers.add(c);
		acadUser.add(m);

		//Create a for Each for every User of Instance t in acadUsers
		for(User t: acadUsers)
		{
			t.sayHello();
		}
		
	}
}
