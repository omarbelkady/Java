public class Student extends User
{
	public boolean verified = true;//method overriding
	public String major;
	public Student(){
		logln("HOWDY, HOWDY, I AM CREATING A STUDENT FOR YOU");
	}

	public Student(String alpha, String beta)
	{
		//how to initialize the default fields
		firstName= alpha;
		lastName=beta;
	}

	@Override
	public void sayHello()
	{
		logln("Hello y\'all my major is "+ major+". My name is " + firstName + " " + lastName);
	}
}
