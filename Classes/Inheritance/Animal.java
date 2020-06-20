public class Animal 
{
    private final String name;
    private final int age; 
    
    public Animal(String n, int a)
    {
        name = n;
        age = a;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    public void speak() {System.out.println("called from animal class");}
}