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
    }
}
