//An array list is used when we do not know the finite size of an array 
//and we do not want to be bounded by a certain number.
//package Omar;

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
                 ArrayList<Integer> t = new ArrayList<Integer>(); 
        //to add t.add();   and to remove t.remove();
        //TO GET THE INDEX OF AN ELEMENT t.get(5);
        //TO APPEND TO THE SET t.set(INDEX, ELEMENT)
        //t.set(1,5) so now the 2nd element is 5 but we must have an element in that position
        t.add(1);
        t.add(2);
        t.add(5);
        t.add(4);
        t.add(9);
        t.add(17);
        t.add(14);
        t.add(-25);
        t.get(17);
        t.set(1,9); //changes the value of 3 in the 2nd index to 9
        System.out.println(t);
        System.out.println(t.subList(1,3));
	
        //.subList method is used to return a portion of this list between the 
        //specified fromIndex, inclusive, and toIndex. This means start at the element index 1
        //and and stop at index 3 do not include the 4th index i.e. [1,3) in interval notation.
	
    }
}
