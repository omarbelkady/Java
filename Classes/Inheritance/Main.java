/*An object is essentially an instance of a class*/
import java.util.ArrayList;


public class Main
{
    public static void main(String [] args)
    {
       //Create 1st dog object
       Dog blanco = new Dog("Blanco", 5);
       
       //I want to invoke the speak method
       blanco.speak();
       
       //Create 2nd dog object
       Dog eva = new Dog("Eva", 2);
       
       //I want to invoke the speak method
       eva.speak();
       
       //Create 3rd dog object
       Dog yorkie = new Dog("Yorkie", 4);
       
       //I want to invoke the speak method
       yorkie.speak();
       
       //We invoke the setAge method 
       yorkie.setAge(3);
       
       
       yorkie.speak();
       
       
       Cat carla= new Cat("Carla", 19, 13);
       carla.speak();
    }
    
}
