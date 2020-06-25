public class Teacher extends User implements Speaks
{
	//REMEMBER SINCE I IMPLEMENTED SPEAK I MUST HAVE THE METHOD WAVEATTHEM

    @Override
    public void waveAtThem()
    {
        logln("Hi there");
    }

    //An interface forces a class to meet certain criteria
    //As in they must have certain methods
    
    
    //If i overload the constructor I have to redefine the default one
    public Teacher(String fName,String lName)
    {
        super(fName, lName);
    }
} 
//Whenever you define implicitly a child constructor it will call the parent constructor:
//Just call the super() and pass in the corresponding arguments.
