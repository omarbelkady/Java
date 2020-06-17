import java.util.*;

public class WhileLoopFreeMemICU
{
    public static void main (String[] args) {
        /*REMEMBER FOR LOOPING ICU METHOD
            -I:Initialization
            -C: Condition to Check true:false
            -U: Update else it will be an infinite loop and you do not want that
        */
        System.out.print("Guess the password:\n");
        
        String password = "passpass";
        Scanner scanner = new Scanner(System.in);
        String guessed = scanner.nextLine();
        int myIter =0;
        
        
        while(!guessed.equals(password))
        {
            System.out.print("Wrong pass you mong, guess the pass again: ");
            guessed=scanner.nextLine();
        }
        
        System.out.println("Congratulations you're not a mong!");
        
        //When finishin with a scanner REMEMBER 
        scanner.close();
        //This frees memory and prevents a memory leak
    }
	
	
}
