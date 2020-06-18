import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        
    
        ramo("WHAT\'s UUUUUUUUP!",7);
        System.out.println(add2(9,1666));
        System.out.println(str("Have a terrible day\n"));
    }
    
    
    
    public static void ramo(String myString, int l)
    {
        for(int i=0;i<l;i++)
        {
            System.out.println(myString);
        }
    }
    
    //Method with integer return Type
    public static int add2(int x, int y)
    {
        return x+y;
    }
    
    public static String str(String x)
    {
        return x+" is the string you entered for this function which outputs a string";
    }

}
