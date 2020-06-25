public class Student extends User implements Speaks
{   
	public boolean verified = true;//method overriding
	public String major;

    public static void log(Object o)
   	{
   	    System.out.print(o);
   	}
	
    public static void logln(Object o)
	{
	    System.out.println(o);
	}
	
    public Student(String fName, String lName)
    {
        //how to initialize the default fields
        super(fName,lName);
    }
    
    @Override
	public void waveAtThem()
    {
        logln("Hello my id is xxx-xx-xxxx and 2526 likes to See and C language altogether");
    }
    	
} 

