public class Dog
{
    public String name;
    public int age;
    
    //Let's create a constructor
    public Dog(String name, int age){
        //set the age and attributes to whatever we pass in
        this.name=name;
        this.age=age;
        
        //The this keyword is referencing the attributes of the class
        
        add2();
        speak();
    }
    
    public void speak()
    {
        System.out.println("I am "+this.name+" and I am "+ this.age+ " years old");
    }
    
    //Lets create another method to get the age
    public int getAge()
    {
        return this.age;
    }
    
    //Lets create another method that will set the age
    public void setAge(int age)
    {
        this.age=age;
    }
    
    private int add2()
    {
        return this.age+2;
    }
}
