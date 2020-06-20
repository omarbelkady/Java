
import java.util.*;

public class Part2
{
	public static void main(String [] args)
	{
		//Creating a scanner object. The parameters we pass in, specifies where we 
    //will read user input from: terminal window/file
    //Terminal window: System.in
    //File
		Scanner scanner= new Scanner(System.in);
		System.out.print("Welcome enter your age ");		//byte age= scanner.nextByte();
		int age=scanner.nextInt();
		//To read a string

		System.out.print("Welcome enter your name ");
		String name=scanner.next();
    //Anytime I write to the console next it reads the next token
    //Say I write for name input Omar Belkady it will say Hi Omar
    //Not Hi Omar Belkady because the next method reads one token at a time
    //To read Omar Belkady we use the method nextLine
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);

		scanner.close();

	}
}
