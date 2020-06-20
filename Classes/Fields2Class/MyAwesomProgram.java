// We make field definitions not at the class level but at the object level
// Notice the user is defined within a method
public class MyAwesomeProgram
{
	public static void main(String [] args)
	{
		User user = new User();//not a field not a class but a loc var to the main meth
		user.firstName= "Bob";
		user.lastName= "Smith";
	}
}
