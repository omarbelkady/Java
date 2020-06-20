import java.util.*;

public class KeyCheck
{
   
    public static void main (String[] args)
    {
	        
            Map<Object, Object> h = new HashMap<>(); //allows for any key and any value
            h.put("Timothy",5);
            h.put("Joey","x");
            //h.put(11,99) this implementation will cause the program to error since the keys
            //must be the same type when using a Tree map. We made a string tree map therefore
            //all subsequent keys must be Strings. 
            
            h.put("Dennis",66);
            
            //Checking for a specific key
            System.out.println(h.containsKey("Joey"));//evaluates to true
            System.out.println(h.containsValue("y"));//evaluates to false
            System.out.println(h.containsValue("x"));//evaluates to true
            System.out.println(h.get(66));//prints null .get method only used for keys not values. since key
            //does not exist in the map
            System.out.println(h.get("Dennis"));
            
            //Outputs all the values of the map
            System.out.println(h.values());
            
            //To clear all the contents of the map
            //h.clear();
            //System.out.println()  ===> Prints an empty map
            
            
            //To check if the map is empty or not
            //h.isEmpty();
    }
}
