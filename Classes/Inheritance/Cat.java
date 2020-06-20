public class Cat extends Animal
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
    @Override
    public void speak()
    {
        System.out.println("called from Dog");
        System.out.println("I am "+getName()+" and I am "+ getAge()+ " years old");
    }
    
    public void eat(int x)
    {
        this.food -= x;
    }

    public int getFood(){return food;}
}

