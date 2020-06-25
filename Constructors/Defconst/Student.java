public class Student extends User
{
	public boolean verified = true;
	public String major;
	
	/*This will be called as soon as I create an Instance of the class*/
	/*REMEMBER THE CONSTRUCTOR MUUUUST HAVE SAME NAME AS CLASS AND CANNOT HAVE A RETURN TYPE*/

	public Student(){
		logln("HOWDY, HOWDY, I AM CREATING A STUDENT FOR YOU");
	}
	
	
	
	
	@Override
	public void sayHello()
	{
		logln("Hello y\'all my major is " + major + ". My name is " + firstName + " " + lastName);
	}
}
