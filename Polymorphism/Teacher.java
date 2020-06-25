public class Teacher extends User
{
	public void fName(String fN,String lN)
	{
		log("Hello My name is " +fN+ " " +lN+" ");
	}

	//Because We inherited User we must inherit sayHello
	//I will override it
	@Override
	public void sayHello()
	{
		log("I will be your Teacher today.");
	}



} 
