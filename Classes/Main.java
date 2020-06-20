/*I will create a new class called Dog which will automatically create a new file named Dog.java
A class is essentially a data type. Whenever we create an instance of a class, we declare it so 
say I want to declare 10 dog ages i would go and say int dogAge1= 3; and say int dogAge2=12; 
This is inefficient and is a waste of time. Within a class we have methods and we have attributes.
An attribute is similar to variables in that they hold information for us. We want to have 2 attributes
for our dog class the Name and the age.
*/

/*An object is essentially an instance of a class*/


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
    }
    
}
