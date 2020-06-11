public class Cat extends Dog
{
  
    private int food;
    
    public Cat(String name, int age, int food)
    {
        //We must call the super class constructor using this implementation or else it will error
        super(name, age);
        this.food=food;
    }

//HERE’S HOW ITS DONE
     public Cat(String name, int age)
     {
	super(name, age);
	//if they do not specify the value of food we give it a default value of 50
	this.food=50;
     }

   public Cat(String name)
     {
	super(name, 0);
	this.food=50;
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


Say if I use the protected keyword what happens say to the protected String name. Well, only items within the same package or are sub classes of the class will be able to access this variable name. Therefore, in our case, Main and Cat will be the only ones able to use the function. However, say I create a 2nd package this package will not be able to see this.
