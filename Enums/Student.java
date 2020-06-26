public class Student extends User implements Speaks
{
	public boolean verified = true;//method overriding
	public String major;

    public Student(String fName, String lName)
    {
    	firstName=fName;
    	lastName=lName;
    }
	
} 
