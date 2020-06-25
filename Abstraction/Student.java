public class Student extends User
{
	public boolean verified = true;//method overriding
	public String major;
	
	
	
	
	/*my Student class which is the derived class I must create a 
	method called sayHello which will override the method because it is necessary or 
	else this will raise an error.*/
	@Override
	public void sayHello()
	{
		logln("Hello y\'all my major is "+ major+ ". My name is " + firstName + " " + lastName);
	}
} 
