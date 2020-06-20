public class Dog extends Animal
{
    
    //Let's create a constructor
    public Dog(String name, int age){
        //set the age and attributes to whatever we pass in
        super(name, age);
        
        //The this keyword is referencing the attributes of the class
        
        speak();
    }
    
    @Override
    public void speak()
    {
        System.out.println("called from Dog");
        System.out.println("I am "+getName()+" and I am "+ getAge()+ " years old");
    }
    
}
