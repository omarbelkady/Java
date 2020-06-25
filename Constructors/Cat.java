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


