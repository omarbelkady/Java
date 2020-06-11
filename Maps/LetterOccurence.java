//This program calculates the number of letters in a string

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main
{
    public static void main (String[] args)
    {
    		Map m = new HashMap();	
            String str = "Hello My Name is Omar and I am super social";
            for(char x:str.toCharArray())//take the string and place it inside a character Array
            {
                //Now we will check how many times a character exists within the array
               
                //If it already exists have it update the value
                if(m.containsKey(x))
                {
                    int old=(int)m.get(x);
                    m.put(x,old+1);
                }
                
                //If it doesn't exist create a new key and give it a value of 1
                else
                {
                    m.put(x,1);
                }
                
            }
            //Print the occurence of the letters to the console
            System.out.println(m);
        
    }
}
