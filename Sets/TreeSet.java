//package myPackage;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main
{
    //main method
    public static void main (String[] args)
    {
        //Syntax: Set<Datatype> nameofSet = new TreeSet<datatype>()
        Set<Integer> t = new TreeSet<Integer>();
        
        //To append to a Set
        t.add(5);
        t.add(8);
        t.add(5);
        t.add(9);
        System.out.println(t);//print 5, 8, 9
        t.add(-8);
        t.remove(8);
        
        //clear an entire Set
        //t.clear();
        
        //check if empty
        //t.isEmpty()
        
        //get the length of the Set
        //t.size();
        
        //Check if element exists within the Set
        boolean m = t.contains(5);
        System.out.println(m);
        System.out.println(t);
        
    }
}
