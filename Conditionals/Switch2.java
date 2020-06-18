import java.util.*;


public class Switch2
{
    public static void main(String [] args)
    {
        
        System.out.print("What\'s your name? ");
        
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();//Storing the string value in the memory location of name
        switch(name)
        {
            //The break keyword within the switch statement
            //prevents what\'s called fallthrough(where execution passes to the next condition)
            case "Alan":
                System.out.println("Part of the Nelan Clan");
                break;//without this break statement it would print part of the nelan squad nelan squad
            
            case "Waleed":
                System.out.println("Nelan Squad");
                break;
                
            case "Angela":
                System.out.println("Nelan Squad");
                break;
            
            case "Government":
                System.out.println("Horrible");
                break;
            
            case "History":
                System.out.println("Death in a nutshell");
                break;
            
            case "H8sToRead":
                System.out.println("CS&Logic doesn't require you to read to understand WTF we are trying to point out!. You are a Winner. You learn by doing!");
                break;
                
            case "Likes2Read":
                System.out.println("Good luck digging a hole you cannot get out of. This is an infectious world that is very hard to cure.");
                break;
                
            case "LitMajor":
                System.out.println("Terrible");
                break;
             
            case "CS":
                System.out.println("Winner");
                break;
            
            case "CE":
                System.out.println("Winner");
                break;
            
            case "Music":
                System.out.println("Loser");
                break;
            
            case "Trump":
                System.out.println("Idiot");
                break;
            
            case "TSupporter":
                System.out.println("Mong");
                break;
            
            //Instead of repeating the same thing for the same output shortcut
            case "X":
            case "Y":
            case "Z":
                System.out.println("3-dim");
                break;
            
            
            default:
                System.out.println("Out of Assumptions");
                break;
        }
        
        
    }
}
