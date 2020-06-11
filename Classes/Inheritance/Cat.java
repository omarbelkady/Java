public class Cat extends Dog
{
    //Here Dog is the Base Class and the Cat is the Derived Class
    //Whenever we inherit and want to use the functions within that Class
    //WEEE MUST IMPLEMENT THE CONSTRUCTOR of the DErived class or else the functions
    //within the  dog class will not work
    
    private int food;
    
    public Cat(String name, int age, int food)
    {
        //We must call the super class constructor using this implementation or else it will error
        super(name, age);
        this.food=food;
    }
    
    //We want to override the speak method
    public void speak(){
        System.out.println("Meow my name is "+ this.name + " and I get fed " + this.food);
    }
    
    public void eat(int x)
    {
        this.food -= x;
    }
}

