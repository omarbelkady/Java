package myPackage;

import java.util.ArrayList;
import java.util.*;
public class Main
{
   
    public static void main (String[] args)
    {
	        
            Map m = new TreeMap();
            m.put("Timothy",5);
            m.put("Joey","x");
            //m.put(11,99) this implementation will cause the program to error since the keys
            //must be the same type when using a Tree map. We made a string tree map therefore
            //all subsequent keys must be Strings. 
            
            m.put("Dennis",66);
            System.out.println(m);
    }
}
/*
In the console we will have the sorted dictionary in 
alphabetical order: Dennis(the key)=value of dennis, 
Joey(the key)=value of Joey, Timothy(the key)=value of Timothy
*/

