public class Student extends User
{
	public boolean verified = true;//method overriding
	public String major;

    public Student(String fName, String lName)
    {
    	//Now I will call the access the base class constructor
    	super(fName,lName);
        //how to initialize the default fields
    }
	
} 
