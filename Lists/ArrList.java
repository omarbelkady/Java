import java.util.List;
import java.util.ArrayList;
public class ArrList{
	public static void main(String [] args)
	{
		
		User me = new User();
		me.setFirstName("Omar");
		me.setLastName("Belkady");


        User you = new User();
		you.setFirstName("Nour”);
		you.setLastName("Abouham");

		//Remember uppercase User is the type. The you is the name of the 
        //variable
		//When working with lists where we have to put a generic type
		//We can use the custom type. This is a custom type of type User
		List<User> users = new ArrayList<User>();
		//To append I use .add and I add the custom type user
		users.add(you);
		users.add(me);

		//To access
		System.out.println(users.get(1).getFullName());//1=me
		
	}
}
