import java.util.*;


public class Stringcomp{
    public static void main(String [] args)
    {
        String password = "Let me in Man";
        System.out.print("Guess the pass to get in: ");
        
        Scanner pass2GetIn= new Scanner(System.in);
        String guess = pass2GetIn.nextLine();//guess is a container that points to the string
        
        
        System.out.println(password.equals(guess));//How to compare the value of 2 strings
        //prints true
        
        //Comparison -> password == guess ... This works when comparing primitive types
        //For example Strings would error when using .equals because String are ! primitives
        
        //When comparing objects we are not comparing the values we are comparing the addresses
        //in memory.
        
        //But NOT RECOMMENDED when comparing objects. 
        //Because values of objects are a reference to the object not PBV they're PBR
        
        System.out.println(password==guess);
        
        String alpha = new String("a");
        String betaButAlpha = new String("a");
        
        System.out.println(alpha==betaButAlpha);
        //false because alpha and betaButAlpha are String objects
        //the == compares their address in Memory
        //alpha is stored in a different location than betaButAlpha in Memory
        
        
    }
}
