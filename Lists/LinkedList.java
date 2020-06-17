//A linked list is faster in certain operations than an Array List.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
   
    public static void main (String[] args)
    {
	         //When defining the type for a list always use the keyword Integer NOOOOOT Int	
            LinkedList<Integer> t = new LinkedList<Integer>(); 
	
            t.add(1);
            t.add(2);
            t.add(5);
            t.add(4);
            t.add(9);
            t.add(17);
            t.add(14);
            t.add(-25);
            t.get(0);
            t.set(1,9); //changes the value of 2 in the 2nd index to 9
            System.out.println(t);
            System.out.println(t.subList(1,3));//start at the 2nd element and stop at the 4 element do not print the 4th
        
    }
}
