/*
A linked Hash map maintains the order at which we declare the dictionary values NOT in alphabetical order
*/
import java.util.*;
public class Main
{
   
    public static void main (String[] args)
    {
	        
            Map h = new LinkedHashMap();
            h.put("Timothy",5);
            h.put("Joey","x");
            //h.put(11,99) this implementation will cause the program to error since the keys
            //must be the same type when using a Tree map. We made a string tree map therefore
            //all subsequent keys must be Strings. 
            
            h.put("Dennis",66);
            System.out.println(h);
        
    }
}
