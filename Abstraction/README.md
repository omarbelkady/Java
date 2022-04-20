## Abstraction

- Hide certain details and show only what's necessary to the User
- Used through Abstract Classes/Interfaces
- Any class that inherits from an abstract class must implement all the abstract methods declared in the abstract class
- An abstract Class Cannot be instantiated


### Example


```java
public abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}

public class Dog extends Animal{
    public void animalSound(){
        System.out.println("Woofwoof");
    }
}

public class Base{
    public static void main(String [] args)
    {
        Dog olivia = new Dog();
        olivia.animalSound();
        olivia.sleep();
    }
}
```