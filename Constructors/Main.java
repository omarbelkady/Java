/*An object is essentially an instance of a class*/
import java.util.ArrayList;


public class Main
{
    public static void main(String [] args)
    {
        Cat rich= new Cat("Richard", 19, 150);
	      Cat diana = new Cat("Diana", 7);
	      Cat isabella = new Cat("Isabella");
	      rich.speak();
	      diana.speak();
	      isabella.speak();
       
    }
    
}

