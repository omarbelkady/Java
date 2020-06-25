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
    
        //Student d = new Student("Driss", "PUT THE LNAME HEERE")
        Student d = new Student("Daniela", "Ennen");
        d.sayHello();
        //d.fName and d.lName are not available however still accessible
        //ALL in all remember, we can create getters for the fields define them within the USer class.
        //BUT DO NOT create the setters in the User Class. Just leave them so that the constructor is
        //the only one who can assign them values
    }
}
