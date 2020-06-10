import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main
{
    //main method
    public static void main (String[] args)
    {
        //Syntax: Set<Datatype> nameofSet = new HashSet<datatype>()
        Set<Integer> t = new HashSet<Integer>();
        
        //To append to a Set
        t.add(5);
        t.add(8);
        t.add(5);
        t.add(9);
        System.out.println(t);//prints 5, 8, 9
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
        
        /*
        A set is a collection of unordered elements that are unique it cannot contain duplicate values. 
        Similar to a bubble it doesn’t know where they are, just knows that they exist there.
        Set are useful since searching within a set is super fast and runs in constant time O(1) 
        regardless of how many elements are within whether it is 10000000 elements or 2 elements. 
        As opposed to arrays the longer it gets the longer it will take to perform an operation within it. 
        There are three types of sets: HASH SET, TREE SET, LINKED HASH SET. We use a set when we don’t care
        how many times something exists or where it exists. We use sets over arrays because it is faster 
        and simpler to do operation on. 
        */
        
        
    }
}
