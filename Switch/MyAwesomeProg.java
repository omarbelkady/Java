import java.util.List;
import java.util.ArrayList;

public class MyAwesomeProg
{
    public static void log(Object o)
    {
        System.out.print(o);
    }

	public static void logln(Object o)
	{
	    System.out.println(o);
	}

    public static void main(String [] args)
    {
        Student d = new Student("Daniela", "Ennen");
        d.currentSubs=d.currentSubs.Silver;
    
    	//To output I do this
    	logln(d.currentSubs);
    	
    	switch(d.currentSubs)
    	{
    	    case Platinum:
    	        logln("Outstanding customer. We highly value your business and thank you for trusting us.");
    	        break;
    	   
    	    case Gold:
    	        logln("You have been an awesome addition to our business. We appreciate the numerous visits a year");
    	        break;
    	   
    	    case Silver:
    	        logln("We appreciate that you have shown interest in our business and would like to offer you a free service.");
    	        break;
    	}
    }
}
