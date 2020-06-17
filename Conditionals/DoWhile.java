import java.util.*;

public class DoWhile
{
    public static void main (String[] args) {
        /*REMEMBER FOR LOOPING ICU METHOD
            -I:Initialization
            -C: Condition to Check true:false
            -U: Update else it will be an infinite loop and you do not want that
        */
        String password = "passpass";
        Scanner scanner = new Scanner(System.in);
        String guessed;
        do
        {
            System.out.println("This device is prompting you to enter the password to gain access");
            guessed = scanner.nextLine();
        }
        //Notice how guessed is declared then defined because if we didn't do that 
        //error will be raised "guessed is not defined" as soon as we reach the while loop execution
        
        
        while(!guessed.equals(password));
        System.out.println("Congratulations you're not a mong!");
        
        //When finishin with a scanner REMEMBER 
        scanner.close();
        //This frees memory and prevents a memory leak
    }
	
	
}
