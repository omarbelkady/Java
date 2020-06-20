
import java.util.Scanner;

public class Part1
{
    public static void main(String [] args)
    {
      //Creating a scanner object. The parameters we pass in, specifies where we 
      //will read user input from: terminal window/file
      //Terminal window: System.in
      //File
      Scanner scanner= new Scanner(System.in);
      byte age= scanner.nextByte();//for reading the next byte and storing it in a var
      //scanner.nextLine();//for reading the next line aka getline(cin, varname) in C++
      //scanner.nextBoolean();//for reading next boolean

      //line below is implicit casting or implicit type conversion
      //I am converting the age of type byte to a string to have the string printed 
      //out to the console
      System.out.println("My friend you are: " + age);
      scanner.close();
    }
  }
