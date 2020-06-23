public class Student extends User
{
	public boolean verified = true;//method overriding
	public String major;
	@Override
	public void sayHello()
	{
		logln("Hello y\'all my major is "+ major+
		". My name is " + firstName + " " + lastName);
	}
} 
