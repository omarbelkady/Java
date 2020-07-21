import java.util.Scanner;

public class Main{
    
    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        Method mea= new Method();
        System.out.print("Enter your Name heer: ");
        String name = inp.nextLine();
        mea.dumbMethod(name);
    }
}
